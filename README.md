# 🏠 Smart Hostel Maintenance System and Auto Assignment System

A Java Spring Boot-based hostel maintenance management system that automates complaint registration, maintenance staff assignment, complaint tracking, and hostel maintenance operations. Students can report hostel issues, maintenance staff can manage assigned tasks, and administrators can monitor maintenance activities through dashboards.

## 📌 Project Information

| Field | Detail |
|---|---|
| Project Title | Smart Hostel Maintenance System and Auto Assignment System |
| Domain | Full-Stack Web Development |
| Backend | Java, Spring Boot |
| Frontend | HTML, CSS, JavaScript |
| Database | MySQL |
| API | REST API |
| Build Tool | Maven |
| Core Concepts | OOP, CRUD Operations, REST API, Database Management, Auto Assignment |

## 📖 Overview

The Smart Hostel Maintenance System is designed to improve hostel maintenance operations. Students can report electrical faults, plumbing problems, cleaning requests, and room repairs. Maintenance staff can view assigned tasks and update complaint statuses, while administrators can monitor complaints and manage maintenance activities.

The Auto Assignment System aims to assign complaints to suitable maintenance staff based on complaint category, staff availability, and workload. This helps reduce manual work, improve response time, and make hostel maintenance more efficient.

### Project Includes

- Student Registration and Login
- Maintenance Complaint Registration
- Complaint Tracking
- Automatic Staff Assignment
- Staff Dashboard
- Admin Dashboard
- Hostel Management
- Room Management
- Staff Management
- Notification Management
- Feedback Management
- Maintenance History
- REST API Integration
- Database Management

## 🎯 Objectives

- Provide an easy platform for students to report maintenance issues.
- Automate complaint registration and tracking.
- Assign maintenance tasks to suitable staff members.
- Reduce complaint resolution time.
- Maintain maintenance history.
- Improve communication between students, staff, and administrators.
- Monitor hostel maintenance activities efficiently.
- Demonstrate full-stack application development.

## 🏗️ System Design

### System Architecture

    Student / Staff / Admin
              |
              v
      Frontend Application
       HTML, CSS, JavaScript
              |
              v
         REST API
              |
              v
        Spring Boot
         Controllers
              |
              v
         Service Layer
              |
       +------+------+
       |             |
       v             v
 Auto Assignment  Notifications
       |
       v
 Staff Allocation
       |
       v
 Repository Layer
       |
       v
     Database

### Class Diagram

    User
      |
      +------------------+
      |                  |
    Student             Staff
      |                  |
      +--------+---------+
               |
           Complaint
               |
      +--------+---------+
      |        |         |
 Notification History Feedback
               |
       ComplaintService
               |
       AssignmentService
               |
    SmartHostelApplication

## 📚 Module Responsibilities

### 1. User Management

- Student registration
- Login validation
- User profile management
- Role management

### 2. Complaint Management

- Register maintenance complaints.
- View complaint details.
- Track complaint status.
- Maintain complaint records.

### 3. Auto Assignment System

- Identify the complaint category.
- Find suitable maintenance staff.
- Check staff availability.
- Consider staff workload.
- Assign complaints to appropriate staff.
- Update complaint status.
- Notify concerned users.

### 4. Staff Management

- Manage staff information.
- View assigned maintenance tasks.
- Update work progress.
- Mark complaints as resolved.

### 5. Admin Management

- Monitor complaints.
- Manage hostel information.
- Manage rooms and staff.
- View system summaries.

### 6. Notification Management

- Notify students about complaint updates.
- Inform users when complaint status changes.
- Maintain notification records.

### 7. Feedback Management

- Collect student feedback.
- Record ratings and comments.
- Evaluate maintenance service quality.

## ⚙️ Auto Assignment Algorithm

1. Student submits a complaint.
2. The system identifies the complaint category and location.
3. The system searches for suitable maintenance staff.
4. Staff availability is checked.
5. The workload of available staff is compared.
6. A suitable staff member is selected.
7. The complaint is assigned.
8. The complaint status is updated.
9. A notification is generated.
10. The complaint is tracked until resolution.

### Suggested Assignment Rule

The system should prioritize staff members who are available, qualified for the complaint category, and handling fewer active complaints.

## 🗄️ Database Design

### Main Entities

- **User:** Stores user details and roles.
- **Complaint:** Stores complaint details, category, status, and assigned staff.
- **Notification:** Stores notification messages and read status.
- **MaintenanceHistory:** Records complaint status changes.
- **Feedback:** Stores ratings and comments.

## 💻 Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- HTML5
- CSS3
- JavaScript
- MySQL
- REST API
- Maven
- Visual Studio Code
- Git
- GitHub

## 🚀 Build and Run

### Backend

Requirements: Java JDK 17 or above and Maven.

    cd backend/smart-hostel
    mvn spring-boot:run

### Frontend

Open `frontend/index.html` in a browser or use the VS Code Live Server extension.

### API Base URL

    http://localhost:8080/api

## 📂 Project Structure

    smart-hostel-maintenance-system/
    ├── README.md
    ├── Docs/
    │   ├── project-overview.md
    │   ├── system-architecture.md
    │   ├── database-design.md
    │   ├── api-documentation.md
    │   └── UML-Class-Diagram.png
    ├── backend/
    │   └── smart-hostel/
    │       ├── pom.xml
    │       └── src/
    │           ├── main/
    │           │   ├── java/com/smarthostel/
    │           │   │   ├── config/
    │           │   │   ├── controller/
    │           │   │   ├── dto/
    │           │   │   ├── model/
    │           │   │   ├── repository/
    │           │   │   ├── service/
    │           │   │   └── exception/
    │           │   └── resources/
    │           └── test/
    ├── frontend/
    │   ├── index.html
    │   ├── login.html
    │   ├── register.html
    │   ├── student-dashboard.html
    │   ├── complaint.html
    │   ├── complaint-details.html
    │   ├── staff-dashboard.html
    │   ├── work-details.html
    │   ├── admin-dashboard.html
    │   ├── hostel-management.html
    │   ├── room-management.html
    │   ├── staff-management.html
    │   ├── notifications.html
    │   ├── feedback.html
    │   ├── css/
    │   ├── js/
    │   └── assets/
    └── database/
        ├── schema.sql
        └── sample-data.sql

## 🏆 Features

- Student complaint registration
- Complaint status tracking
- Staff assignment support
- Staff work management
- Admin dashboard
- Hostel and room management pages
- Notification system
- Feedback system
- REST API integration
- Database schema
- Responsive frontend

## 📈 Future Enhancements

- Fully automated staff assignment
- Secure password hashing
- Role-based access control
- MySQL integration
- Email and SMS notifications
- Complaint image uploads
- Maintenance reports and analytics
- Mobile application
- Real-time complaint updates
- Staff performance monitoring

## 🧠 Key Concepts Demonstrated

- Object-Oriented Programming
- Encapsulation
- Abstraction
- Inheritance
- Polymorphism
- REST API Development
- CRUD Operations
- Spring Boot Architecture
- Database Management
- Auto Assignment Algorithm
- Exception Handling
- Software Design Principles

## 🙋 Author

**Student Name:** Arunachalam A

**Department:** B.E. Electrical and Electronics Engineering (EEE)

**College:** KIT – Kalaignarkarunanidhi Institute of Technology

## 📄 License

This project was developed as an academic mini project to demonstrate hostel maintenance management, complaint tracking, and maintenance staff assignment using Java Spring Boot and web technologies.
