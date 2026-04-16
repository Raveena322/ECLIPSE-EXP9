# Demo_JWT

A Spring Boot JWT authentication demo application.

## Project Overview

This repository contains a Java Spring Boot application that demonstrates JWT-based authentication and authorization.
The application exposes a login endpoint that returns a JWT token and a protected endpoint that requires a valid token.

## Features

- JWT authentication and token generation
- Login endpoint using `x-www-form-urlencoded` credentials
- Sample protected endpoint that validates JWT tokens
- Simple demo setup for learning JWT in Spring Boot

## Repository Structure

- `Demo_JWT/` - main application source tree
- `Demo_JWT/src/main/java/com/Demo_JWTexample/Demo_JWT/` - Java application code
- `Demo_JWT/src/main/resources/application.properties` - application configuration

## Prerequisites

- Java 17 or later
- Maven
- Git

## Build and Run

From the repository root:

```bash
cd Demo_JWT
./mvnw clean package
java -jar target/Demo_JWT-0.0.1-SNAPSHOT.jar
```

Alternatively, run in Maven directly:

```bash
./mvnw spring-boot:run
```

## API Endpoints

### Login

- URL: `POST /api/login`
- Content type: `application/x-www-form-urlencoded`
- Request fields:
  - `username`
  - `password`

Example request body:

```text
username=admin&password=admin
```

Successful response returns a JWT token.

### Protected endpoint

- URL: `GET /api/hello`
- Requires valid JWT token in the `Authorization` header:

```text
Authorization: Bearer <token>
```

## Screenshots

Below are the example screenshots for the login response and the protected endpoint response.
<img src = "Demo_JWT\src\Screenshot 2026-04-07 155039.png" alt = "page failed to load">
<img src = "Demo_JWT\src\Screenshot 2026-04-07 155126.png" alt = "page failed to load">


## Notes

- The application should return a JWT on successful login.
- Use the returned token to access protected endpoints.
- If the images are not visible, add the screenshot files to the `images/` directory with the exact names used above.
