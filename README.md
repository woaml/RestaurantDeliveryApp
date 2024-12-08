# Backend for RestaurantDeliveryApp

A robust backend application designed to manage restaurant orders, user authentication, and cart functionality. Built with Spring Boot, secured with JWT, and powered by MySQL for data storage. Provides seamless integration with RESTful APIs and advanced search features.

---

## Table of Contents
- [Features](#features)
- [Tech Stack](#tech-stack)
- [System Architecture](#system-architecture)
- [API Documentation](#api-documentation)
- [Setup Instructions](#setup-instructions)

---

## Features
- **Secure Authentication**:
    - User login and registration using JWT.
    - Role-based access control (Admin, Customer).
- **Restaurant Management**:
    - CRUD operations for restaurants, menus, and ingredients.
    - Detailed menu management with pricing and availability tracking.
- **Order Processing**:
    - Create, update, and manage orders dynamically.
    - Real-time status updates for orders (pending, confirmed, completed).
- **Cart Functionality**:
    - Persistent cart linked to user sessions.
    - Integration with order processing.
- **Search and Filtering**:
    - Advanced search for restaurants and menu items by category, location, or rating.
- **OpenAPI Documentation**:
    - Interactive API documentation with Swagger UI.
- **Enhanced Security**:
    - Spring Security with customizable policies and tests.

---

## Tech Stack
- **Framework**: Spring Boot (Web, Security, Data JPA)
- **Database**: MySQL
- **Authentication**: JWT with `jjwt-api`, `jjwt-impl`, and `jjwt-jackson`
- **API Documentation**: OpenAPI/Swagger
- **Build Tool**: Maven
- **Utilities**: Spring Boot DevTools, Lombok, Hibernate Validation

---

## System Architecture
The backend is designed as a modularized Spring Boot application. Each layer is focused on separation of concerns:

- **Controllers**: Handle incoming HTTP requests and API responses.
- **Services**: Encapsulate business logic.
- **Repositories**: Interact with the database using Spring Data JPA.
- **Database**: MySQL stores all persistent data.


## API Documentation

Comprehensive API documentation is available through **Swagger UI**. Test endpoints directly from your browser:

- **Swagger UI**: [http://localhost:5454/swagger-ui.html](http://localhost:5454/swagger-ui.html)

For detailed specifications, refer to the OpenAPI YAML file in the repository.

## Setup Instructions

### Prerequisites

Ensure the following are installed on your system:

- Java 17 or later
- Maven 3.8+
- MySQL 8.0+

### Steps

1. **Clone the repository**:
    ```bash
    git clone https://github.com/woaml/RestaurantDeliveryApp.git
    cd RestaurantDeliveryApp
    ```

2. **Configure MySQL**:
   Update `src/main/resources/application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/restaurant_db
    spring.datasource.username=<your-username>
    spring.datasource.password=<your-password>
    spring.jpa.hibernate.ddl-auto=update
    ```

3. **Build the application**:
    ```bash
    mvn clean install
    ```

4. **Run the application**:
    ```bash
    ./mvnw spring-boot:run
    ```

### Access the API

The application will be available at [http://localhost:5454/swagger-ui.html](http://localhost:5454/swagger-ui.html).