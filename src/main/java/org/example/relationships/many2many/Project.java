package org.example.relationships.many2many;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Project {
    @Id
    private int id;
    private String name;

    @ManyToMany(mappedBy = "projects")
    private List<Employee> employees;

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}