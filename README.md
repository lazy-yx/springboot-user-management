# Spring Boot User Management API

A production-ready backend API for user management built with Spring Boot.

This project demonstrates how to build a scalable RESTful backend service with authentication, caching, and database integration.

## Tech Stack

- Java 17
- Spring Boot
- MyBatis Plus
- MySQL
- Redis
- JWT Authentication
- Docker

## Features

- User registration
- User login with JWT authentication
- CRUD operations for users
- Pagination query
- Redis caching for performance optimization
- Global exception handling
- RESTful API design

## Architecture

Controller -> Service -> Mapper -> Database

- Controller: REST API endpoints
- Service: Business logic
- Mapper: Database access layer
- Redis: Cache layer

## API Examples

### Register User

POST /api/users/register

```json
{
  "username": "testuser",
  "password": "123456",
  "email": "test@example.com"
}
