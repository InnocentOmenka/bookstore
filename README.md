# Bookstore Project

Welcome to the Bookstore project repository. This project is aimed at creating a RESTful web service for managing a bookstore.

## Project Description

Create a RESTful web service for managing a bookstore. The application allows CRUD operations (Create, Read, Update, Delete) for books, authors, and genres.

### Requirements

- Implement endpoints for adding, retrieving, updating, and deleting books, authors, and genres.
- Use a relational database (e.g., MySQL) to store the data.
- Implement basic validation and error handling.
- Use Spring Data JPA for database interactions.
- Create a comprehensive README with setup instructions and API documentation.

## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- Spring Boot
- MySQL
- Git

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/InnocentOmenka/bookstore.git
2.	Navigate to the project directory: cd springboot-bookstore
3.	Configure the database connection:
	•	Open the application.properties file in src/main/resources.
	•	Set your database connection properties (e.g., URL, username, password).
	4.	Build and run the application: ./mvnw spring-boot:run


API Documentation

The API provides the following endpoints for managing books, authors, and genres:

Books

	•	GET /api/books - Retrieve a list of all books
	•	GET /api/books/{id} - Retrieve a specific book by ID
	•	POST /api/books - Add a new book
	•	PUT /api/books/{id} - Update an existing book by ID
	•	DELETE /api/books/{id} - Delete a book by ID

Authors

	•	GET /api/authors - Retrieve a list of all authors
	•	GET /api/authors/{id} - Retrieve a specific author by ID
	•	POST /api/authors - Add a new author
	•	PUT /api/authors/{id} - Update an existing author by ID
	•	DELETE /api/authors/{id} - Delete an author by ID

Genres

	•	GET /api/genres - Retrieve a list of all genres
	•	GET /api/genres/{id} - Retrieve a specific genre by ID
	•	POST /api/genres - Add a new genre
	•	PUT /api/genres/{id} - Update an existing genre by ID
	•	DELETE /api/genres/{id} - Delete a genre by ID

Built With

	•	Java Spring Boot
	•	Spring Data JPA
	•	MySQL
