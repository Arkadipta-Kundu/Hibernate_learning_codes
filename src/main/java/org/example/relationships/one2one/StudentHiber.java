package org.example.relationships.one2one;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentHiber {
    @Id
    private int rollNo;
    private String name;
    private int age;
    private Adress adress;

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public int getId() {
        return rollNo;
    }

    public Adress getAdress() {
        return adress;
    }


    public void setId(int id) {
        this.rollNo = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
