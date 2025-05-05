# SmartLib - Library Management System

access the video demo through the link z : https://youtu.be/r5TcVymJwQ4?si=TIb2AqSdKRK7pEcc

## Overview

SmartLib is a comprehensive Library Management System (LMS) built with Spring Boot and Thymeleaf. This web application provides a complete solution for managing library resources, including books, members, borrowing operations, and administrative functions.

## Features

- **Book Management**: Add, view, update, and delete books in the library inventory.
- **Member Management**: Register new members, update their information, and track their activities.
- **Borrowing Operations**: Manage book borrowing, returns, and reservations.
- **Admin Dashboard**: Get insights into library statistics and operations.
- **Responsive Design**: Mobile-friendly interface for access from any device.

## Technology Stack

- **Backend**: Spring Boot, Spring MVC, Spring Data JPA
- **Frontend**: Thymeleaf, HTML5, CSS3
- **Database**: H2 Database
- **Build Tool**: Maven

## Prerequisites

- JDK 11 or later
- Maven 3.6.3 or later
- MySQL (or any supported database)
- Git

## Getting Started

### Clone the Repository
Configure your database connection:
```bash
git clone https://github.com/Parthkarma/SmartLib.git
cd SmartLib
spring.datasource.url=jdbc:mysql://localhost:3306/smartlib
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── parthkarma/
│   │           └── smartlib/
│   │               ├── controller/       # MVC Controllers
│   │               ├── model/            # Entity classes
│   │               ├── repository/       # JPA Repositories
│   │               ├── service/          # Business logic
│   │               ├── config/           # Configuration classes
│   │               └── SmartLibApplication.java
│   └── resources/
│       ├── static/                      # Static resources (CSS, JS)
│       ├── templates/                   # Thymeleaf templates
│       └── application.properties       # Application configuration
└── test/                               # Unit and integration tests


