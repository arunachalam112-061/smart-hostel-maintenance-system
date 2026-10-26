package com.smarthostel.controller;

import com.smarthostel.model.Complaint;
import com.smarthostel.service.ComplaintService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/complaints")
@CrossOrigin(origins = "*")
public class ComplaintController {
    private final ComplaintService complaintService;

    public ComplaintController(ComplaintService complaintService) {
        this.complaintService = complaintService;
    }

    @GetMapping
    public List<Complaint> getAllComplaints() {
        return complaintService.getAllComplaints();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Complaint createComplaint(@RequestBody Complaint complaint) {
        return complaintService.createComplaint(complaint);
    }

    @PatchMapping("/{id}/status")
    public Complaint updateStatus(
            @PathVariable Long id,
            @RequestBody Map<String, String> request) {
        String status = request.get("status");
        if (status == null || status.isBlank()) {
            throw new IllegalArgumentException("Request must include a status.");
        }
        return complaintService.updateStatus(id, status.toUpperCase());
    }
}
