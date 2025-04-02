package org.example.relationships.one2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Configuration cfg = new Configuration().configure().addAnnotatedClass(StudentHiber.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        Adress a1 = new Adress();
        a1.setPin(700001);
        a1.setCity("Kolkata");
        a1.setState("West Bengal");

        StudentHiber s1 = new StudentHiber();
        s1.setId(5);
        s1.setName("Smriti");
        s1.setAge(20);
        s1.setAdress(a1);



//        StudentHiber s2 = new StudentHiber();

//        saving data
        session.persist(s1);

//        Fetching Data
//        s2 = session.get(StudentHiber.class, 2);

//        Updating Data
//          first chenge in the object then update
//          session.merge(s1);
//        delete data
//            session.remove(s1);



        System.out.println(s1.getAge());

        tx.commit();
        session.close();
        sf.close();

    }
}