# Hibernate Learning Codes

This repository contains various examples and implementations of Hibernate, a popular Java framework for Object-Relational Mapping (ORM). The examples demonstrate different types of relationships, CRUD operations, and Hibernate Query Language (HQL) usage.

## Project Structure

The project is organized into different packages, each focusing on a specific concept or feature of Hibernate:

1. **`getting_started`**: 
   - Basic CRUD operations using Hibernate.
   - Example file: `Main.java`.

2. **`one2one`**:
   - Demonstrates a one-to-one relationship using Hibernate.
   - Example files: `Main.java`, `StudentHiber.java`, `Adress.java`.

3. **`one2many`**:
   - Demonstrates a one-to-many relationship.
   - Example files: `Main.java`, `Department.java`, `Employee.java`.

4. **`many2many`**:
   - Demonstrates a many-to-many relationship.
   - Example files: `Main.java`, `Employee.java`, `Project.java`.

5. **`HQL`**:
   - Demonstrates the use of Hibernate Query Language (HQL) for querying the database.
   - Example files: `LearnHQL.java`, `demoputdata.java`, `StudentData.java`.

## How to Run the Code

1. **Prerequisites**:
   - Java 22 or higher.
   - Maven for dependency management.
   - PostgreSQL database (configured in `hibernate.cfg.xml`).

2. **Setup**:
   - Update the database connection details in `src/main/resources/hibernate.cfg.xml` to match your local PostgreSQL setup.
   - Run `mvn compile` to compile the project.

3. **Running Examples**:
   - Navigate to the desired package and run the corresponding `Main.java` file to see the example in action.

## Key Files

- **`hibernate.cfg.xml`**: Configuration file for Hibernate, including database connection details and annotated classes.
- **`pom.xml`**: Maven configuration file for managing dependencies.

## Notes

- The database schema is auto-generated based on the annotated classes (`@Entity`) when the application runs.
- Each example demonstrates a specific feature of Hibernate, so explore the packages to learn more.

Feel free to explore and modify the code to deepen your understanding of Hibernate!