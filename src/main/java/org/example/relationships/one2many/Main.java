package org.example.relationships.one2many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure().addAnnotatedClass(Department.class).addAnnotatedClass(Employee.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        // Creating a department
        Department sales = new Department();
        sales.setId(2L); // Manually setting the ID
        sales.setName("Sales");

        // Creating employees
        Employee emp3 = new Employee();
        emp3.setId(3L); // Manually setting the ID
        emp3.setName("Aakash");
        emp3.setDepartment(sales);


        Employee emp4 = new Employee();
        emp4.setId(4L); // Manually setting the ID
        emp4.setName("Sahil");
        emp4.setDepartment(sales);

        // Linking employees to the department
        sales.setEmployees(List.of(emp3, emp4));

        // Persisting the department (CascadeType.ALL will save employees too)
        session.persist(emp3);
        session.persist(emp4);
        session.persist(sales);

        tx.commit();
        session.close();
        sf.close();
    }
}