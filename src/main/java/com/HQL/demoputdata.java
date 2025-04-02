package com.HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class demoputdata {
    public static void main(String[] args) {
        // Create configuration instance
        Configuration cfg = new Configuration().configure();

        // Add annotated class
        cfg.addAnnotatedClass(StudentData.class);

        // Create session factory instance
        SessionFactory sf = cfg.buildSessionFactory();

        // Create session instance
        Session session = sf.openSession();

        // Begin transaction
        session.beginTransaction();

        // Create StudentData objects
        StudentData student1 = new StudentData();
        student1.setId(1);
        student1.setName("John Doe");
        student1.setAge(22);

        StudentData student2 = new StudentData();
        student2.setId(2);
        student2.setName("Jane Smith");
        student2.setAge(23);

        StudentData student3 = new StudentData();
        student3.setId(3);
        student3.setName("Alice Johnson");
        student3.setAge(21);

        StudentData student4 = new StudentData();
        student4.setId(4);
        student4.setName("Bob Brown");
        student4.setAge(24);

        StudentData student5 = new StudentData();
        student5.setId(5);
        student5.setName("Charlie Davis");
        student5.setAge(22);

// Save the student objects
        session.save(student1);
        session.save(student2);
        session.save(student3);
        session.save(student4);
        session.save(student5);

        // Commit transaction
        session.getTransaction().commit();

        // Close session
        session.close();

        // Close session factory
        sf.close();
    }
}