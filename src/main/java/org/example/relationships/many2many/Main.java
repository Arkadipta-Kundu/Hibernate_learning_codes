package org.example.relationships.many2many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure().addAnnotatedClass(Project.class).addAnnotatedClass(Employee.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        // Fetch employee with id = 1
        Employee employee = session.get(Employee.class, 1);
        if (employee != null) {
            System.out.println("Employee Name: " + employee.getName());
        } else {
            System.out.println("Employee not found");
        }

        tx.commit();
        session.close();
        sf.close();
    }
}