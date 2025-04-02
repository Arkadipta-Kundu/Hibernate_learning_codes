package org.example.relationships.getting_started;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

// Basic Hibernate example with CRUD operations
public class Main {
    public static void main(String[] args) {
        // Step 1: Load Hibernate configuration and build SessionFactory
        Configuration configuration = new Configuration();
        configuration.configure().addAnnotatedClass(Student.class); // Load hibernate.cfg.xml from resources
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Step 2: Open a session
        Session session = sessionFactory.openSession();

        // Step 3: Begin a transaction
        Transaction transaction = session.beginTransaction();

        // Create operation
        Student student = new Student();
        student.setName("John Doe");
        student.setEmail("john.doe@example.com");
        session.persist(student); // Save the student object to the database

        // Read operation
        Student retrievedStudent = session.get(Student.class, student.getId());
        System.out.println("Retrieved Student: " + retrievedStudent.getName() + ", " + retrievedStudent.getEmail());

        // Update operation
        retrievedStudent.setEmail("updated.email@example.com");
        session.update(retrievedStudent); // Update the student object in the database

        // Delete operation
        session.delete(retrievedStudent); // Delete the student object from the database

        // Step 5: Commit the transaction
        transaction.commit();

        // Step 6: Close the session and SessionFactory
        session.close();
        sessionFactory.close();
    }
}
