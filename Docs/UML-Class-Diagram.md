# UML Class Diagram (text version)

```text
User
 ├── id, name, email, phone, role
 └── registered through AuthService

Complaint
 ├── id, title, description, category, location
 ├── status, studentId, assignedStaffId
 └── tracked by ComplaintService

Notification
 └── userId, message, readFlag, createdAt

MaintenanceHistory
 └── complaintId, status, note, changedAt

Feedback
 └── complaintId, userId, rating, comments
```
