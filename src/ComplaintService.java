package com.smarthostel.service;

import com.smarthostel.model.Complaint;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ComplaintService {
    private final List<Complaint> complaints = new ArrayList<>();
    private final AtomicLong nextId = new AtomicLong(1);

    public List<Complaint> getAllComplaints() {
        return new ArrayList<>(complaints);
    }

    public Complaint createComplaint(Complaint complaint) {
        if (complaint.getTitle() == null || complaint.getTitle().isBlank()) {
            throw new IllegalArgumentException("Complaint title is required.");
        }
        complaint.setId(nextId.getAndIncrement());
        complaint.setStatus("OPEN");
        autoAssign(complaint);
        complaints.add(complaint);
        return complaint;
    }

    public Complaint updateStatus(Long id, String status) {
        Complaint complaint = findById(id);
        if (!List.of("OPEN", "IN_PROGRESS", "RESOLVED").contains(status)) {
            throw new IllegalArgumentException(
                "Status must be OPEN, IN_PROGRESS, or RESOLVED."
            );
        }
        complaint.setStatus(status);
        return complaint;
    }

    public Complaint findById(Long id) {
        return complaints.stream()
            .filter(item -> item.getId().equals(id))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException(
                "Complaint not found: " + id
            ));
    }

    private void autoAssign(Complaint complaint) {
        String category = complaint.getCategory();
        if (category == null) {
            complaint.setAssignedTechnician("Hostel Maintenance Team");
            return;
        }

        switch (category.trim().toLowerCase()) {
            case "electrical" -> complaint.setAssignedTechnician("Electrical Technician");
            case "plumbing" -> complaint.setAssignedTechnician("Plumbing Technician");
            case "wifi", "network" -> complaint.setAssignedTechnician("IT Support Technician");
            default -> complaint.setAssignedTechnician("General Maintenance Team");
        }
    }
}
