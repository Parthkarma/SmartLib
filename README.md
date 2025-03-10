# SmartLib - Library Management System

![SmartLib Logo](https://via.placeholder.com/150x150)

## Overview

SmartLib is a comprehensive Library Management System (LMS) built with Spring Boot and Thymeleaf. This web application provides a complete solution for managing library resources, including books, members, borrowing operations, and administrative functions.

## Features

- **Book Management**: Add, view, update, and delete books in the library inventory
- **Member Management**: Register new members, update their information, and track their activities
- **Borrowing Operations**: Manage book borrowing, returns, and reservations
- **Admin Dashboard**: Get insights into library statistics and operations
- **Responsive Design**: Mobile-friendly interface for access from any device

## Technology Stack

- **Backend**: Spring Boot, Spring MVC, Spring Data JPA
- **Frontend**: Thymeleaf, HTML5, CSS3,
- **Database**: H2 Database
- **Build Tool**: Maven

## Prerequisites

- JDK 11 or later
- Maven 3.6.3 or later
- MySQL (or any supported database)
- Git

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/Parthkarma/SmartLib.git
cd SmartLib
```

### Configure Database

1. Open `src/main/resources/application.properties`
2. Configure your database connection:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/smartlib
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### Build and Run

```bash
mvn clean install
mvn spring-boot:run
```

The application will be available at `http://localhost:8080`

### Default Admin Credentials

```
Username: admin
Password: admin123
```

## Project Structure

```
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
```

## API Endpoints

### Books API

- `GET /api/books` - Get all books
- `GET /api/books/{id}` - Get book by ID
- `POST /api/books` - Add a new book
- `PUT /api/books/{id}` - Update book information
- `DELETE /api/books/{id}` - Delete a book

### Members API

- `GET /api/members` - Get all members
- `GET /api/members/{id}` - Get member by ID
- `POST /api/members` - Register a new member
- `PUT /api/members/{id}` - Update member information
- `DELETE /api/members/{id}` - Delete a member

### Borrowing API

- `GET /api/borrowings` - Get all borrowings
- `POST /api/borrowings` - Create a new borrowing
- `PUT /api/borrowings/{id}/return` - Return a book
- `GET /api/borrowings/overdue` - Get all overdue borrowings

## Screenshots

![Dashboard](https://via.placeholder.com/800x400)
![Book Management](https://via.placeholder.com/800x400)
![Member Management](https://via.placeholder.com/800x400)

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

Parth - [GitHub](https://github.com/Parthkarma)

Project Link: [https://github.com/Parthkarma/SmartLib](https://github.com/Parthkarma/SmartLib)

## Acknowledgements

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Thymeleaf](https://www.thymeleaf.org/)
- [Bootstrap](https://getbootstrap.com/)
- [Font Awesome](https://fontawesome.com/)
