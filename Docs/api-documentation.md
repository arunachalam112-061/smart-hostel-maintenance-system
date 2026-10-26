# API Documentation

Base URL: `http://localhost:8080/api`

| Method | Endpoint | Purpose |
|---|---|---|
| POST | `/auth/register` | Register a user |
| POST | `/auth/login` | Demo login |
| GET | `/complaints` | List complaints |
| GET | `/complaints/{id}` | Get complaint details |
| POST | `/complaints` | Create a complaint |
| PATCH | `/complaints/{id}/status` | Update status |
| GET | `/notifications` | List notifications |
| POST | `/feedback` | Submit feedback |

Example create complaint:
```json
{
  "title": "Leaking tap",
  "description": "Water is leaking continuously",
  "category": "PLUMBING",
  "location": "Block A, Room 101",
  "studentId": 1
}
```

This starter API does not yet enforce role-specific access. Add authentication and authorization before real use.
