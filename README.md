# Splitfy

## Overview

Splitfy is a platform for managing shared subscriptions with friends. It enables users to organize, split costs, and track payments for services like Netflix, Spotify, and Microsoft 365 in a simple and transparent way.

## Features

- **Subscription Management**: Register and manage shared subscriptions.
- **User Management**: Invite and manage users in subscription groups.
- **Cost Splitting**: Automatically calculate and divide subscription costs.
- **Payment Tracking**: Monitor contributions and pending payments.
- **Notifications**: Send reminders for upcoming payments.
- **Security**: Implement authentication and role-based access control (RBAC).

## Tech Stack

### **Backend**

- **Language**: Kotlin
- **Framework**: Spring Boot 3+
- **Database**: PostgreSQL
- **ORM**: Spring Data JPA
- **Dependency Management**: Gradle (Kotlin DSL)
- **Authentication**: Spring Security with JWT
- **API Documentation**: OpenAPI (Swagger)
- **Testing**:
    - Unit Tests: JUnit 5 + Mockito
    - Integration Tests: TestContainers
- **Logging**: SLF4J + Logback

### **Infrastructure**

- **Database in Dev/Test**: PostgreSQL (Docker)
- **CI/CD**: GitHub Actions

## Installation & Setup

### **Prerequisites**

- Java 17+
- Kotlin 1.8+
- Gradle
- Docker (for database and testing)

### **Clone the repository**

```sh
git clone https://github.com/kbdemiranda/Splitfy.git
cd splitfy
```

### **Run the application**

```sh
./gradlew bootRun
```

### **Run tests**

```sh
./gradlew test
```

## API Documentation

After starting the application, you can access the API documentation at:

```
http://localhost:8080/api/swagger-ui.html
```

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature-name`)
3. Commit your changes (`git commit -m 'Add new feature'`)
4. Push to the branch (`git push origin feature-name`)
5. Open a pull request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

