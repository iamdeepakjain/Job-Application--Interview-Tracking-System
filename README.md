# Job Application & Interview Tracking System

A backend Spring Boot application to manage job applications, interviews, and users.

## Tech Stack
- Java 17
- Spring Boot 3
- Spring Security (Basic Authentication)
- Spring Data JPA
- H2 / MySQL Database
- Maven
- Postman

## Features
- Create users using REST APIs
- Fetch users from database
- Secure APIs using Spring Security
- Database persistence using JPA & Hibernate
- API testing using Postman

## How to Run the Project
1. Clone the repository
2. Open the project in IntelliJ IDEA
3. Run `JobPortalApplication.java`
4. Application runs on `http://localhost:8080`

## API Endpoints
- POST `/users` → Create a user
- GET `/users` → Fetch all users

## Authentication
- Uses Basic Authentication
- Username and password are configured in `application.properties`

## Author
Deepak Kumar Jain
