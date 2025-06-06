# mini-app-backend
Spring Boot backend for my mini app.
# Instructions for the developer.

# Spring Boot Backend for Mini-App

This is the starter project for the Spring Boot backend.

## Prerequisites

- Java 17 or higher
- Apache Maven

## How to Run

1.  **Package the application:**
    ```bash
    mvn clean package
    ```

2.  **Run the application:**
    ```bash
    java -jar target/mini-app-backend-0.0.1-SNAPSHOT.jar
    ```

The server will start on `http://localhost:8080`.

## Endpoints

- `GET /api/greeting`: Returns a simple JSON greeting message.
  - Example Response: `{"message": "Hello from Spring Boot!"}`

This endpoint is intended to be accessed through the Kong API Gateway, not directly.
