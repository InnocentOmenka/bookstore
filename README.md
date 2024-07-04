# Bookstore Project

Welcome to the Bookstore project repository. This project is aimed at creating a RESTful web service for managing a bookstore.

## Project Description

Create a RESTful web service for managing a bookstore. The application allows CRUD operations (Create, Read, Update, Delete) for books, authors, and genres.

## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- Spring Boot
- MySQL

### Installation
#### Option 1: Using Terminal

1. **Clone the repository:** git clone https://github.com/InnocentOmenka/bookstore.git
2. Navigate to the project directory: cd bookstore
3. Configure the database connection:
   . Open the application.properties file in src/main/resources.
   . Set your database connection properties (e.g., URL, username, password).
4. Build and run the application: ./mvnw spring-boot:run

Option 2: Using an IDE (IntelliJ IDEA or Eclipse)

	1.	Clone the repository:
	•	Open your IDE (IntelliJ IDEA or Eclipse).
	•	Select File > New > Project from Version Control (in IntelliJ IDEA) or File > Import > Git > Projects from Git (in Eclipse).
	•	Enter the repository URL: https://github.com/InnocentOmenka/bookstore.git.
	2.	Open the project:
	•	The project will be imported and opened in your IDE.
	3.	Configure the database connection:
	•	Open the application.properties file in src/main/resources.
	•	Set your database(Mysql) apploication properties (e.g., URL, username, password).
	4.	Build and run the application:
	•	In IntelliJ IDEA:
	•	Right-click on the BookstoreApplication class in the src/main/java directory.
	•	Select Run 'BookstoreApplication'.
	•	In Eclipse:
	•	Right-click on the SpringbootBookstoreApplication class in the src/main/java directory.
	•	Select Run As > Java Application.

 Dependency for Book Creation

To successfully create a book in the system, it is essential to first create a genre and an author. This is because a book must be associated with both a genre and an author through their respective IDs. Here are the steps to follow:

1. Create a Genre:
	•	Use the POST /api/genres endpoint to create a new genre.
	•	Example request body:

 {
  "name": "Fiction"
 }

2. Create an Author:
	•	Use the POST /api/authors endpoint to create a new author.
	•	Example request body:

  {
  "name": "Michael Austin"
  }

3. Create a Book:
	•	Use the POST /api/books endpoint to create a new book.
	•	Ensure that you include the IDs of the created genre and author in the request body.
	•	Example request body:
{
  "title": "Pride and Prejudice",
  "genreId": 1,
  "authorId": 1,
  "description": "A classic novel about manners and marriage."
}


API Documentation:
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
