package com.StudentApi.StudentRestApi.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Student_percentage")
    private float percentage;
    @Column(name = "Student_name")
    private String name;
    @Column(name = "Student_Branch")
    private String Branch;

    public Student(){
    }

    public Student(float percentage, String name, String branch) {
        super();
        this.percentage = percentage;
        this.name = name;
        Branch = branch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", percentage=" + percentage +
                ", name='" + name + '\'' +
                ", Branch='" + Branch + '\'' +
                '}';
    }
}
