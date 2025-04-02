package com.HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.query.Query;

import java.util.Scanner;

public class LearnHQL {
    public static void main(String[] args) {
        Configuration cfg  = new Configuration().configure().addAnnotatedClass(StudentData.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Scanner sc = new Scanner(System.in);

//        String query = "from StudentData where age > 22";
//        String query = "from StudentData where age > :x";
//        Query q = session.createQuery(query);
//        System.out.println("Enter the age: ");
//        int x_age = sc.nextInt();
//        q.setParameter("x", x_age);
//        List<StudentData> std = q.list();
//
//        for (StudentData studentData : std) {
//            System.out.println("Student Name: " + studentData.getName());
//        }

//        Transaction tx = session.beginTransaction();
//        String query = "delete from StudentData sd where sd.id = :x";
//        Query q = session.createQuery(query);
//        System.out.println("Enter the ID: ");
//        int x_id = sc.nextInt();
//        q.setParameter("x", x_id);
//        q.executeUpdate();
//
//        tx.commit();

        Transaction tx = session.beginTransaction();
        String query = "update StudentData sd set sd.name = :n where sd.id = :x";
        Query q = session.createQuery(query);
        System.out.println("Enter the ID: ");
        int x_id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the new name: ");
        String x_name = sc.nextLine();
        q.setParameter("x", x_id);
        q.setParameter("n", x_name);
        q.executeUpdate();

        tx.commit();

        session.close();
        sf.close();
    }
}
