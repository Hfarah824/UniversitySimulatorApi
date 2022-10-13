package com.university.universitySimulator.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Instructor {
    @Id
    @GeneratedValue
    private long id;
    private String instructorName;
    private String department;

    @OneToMany(mappedBy = "instructor")
    private Collection<Course> courses;

    public Instructor(String instructorName, String department) {
        this.instructorName = instructorName;
        this.department = department;
    }

    public Instructor(long id, String instructorName, String department, Collection<Course> courses) {
        this.id = id;
        this.instructorName = instructorName;
        this.department = department;
        this.courses = courses;
    }

    public Instructor() {


    }
}
