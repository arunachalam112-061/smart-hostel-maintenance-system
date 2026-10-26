# System Architecture

```text
Student / Staff / Admin Browser
            |
            | HTML + CSS + JavaScript (REST fetch)
            v
       Spring Boot REST API
       /      |       \
 Auth API  Complaint  Feedback / Notifications
              |
         Service Layer
              |
        Spring Data JPA
              |
       H2 (demo) / SQL DB
```

The frontend is deliberately separate from the backend. Configure the API base URL in `frontend/js/api.js` if the backend runs elsewhere.
