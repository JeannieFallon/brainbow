package org.launchcode.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by jeannie on 5/1/17.
 */
@Entity
public class Subject {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min = 3, max = 35, message = "Subject should be a general area of study.")
    private String name;
    private SubjectColor color;

    public Subject() {

    }

    public Subject(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubjectColor getColor() {
        return color;
    }

    public void setColor(SubjectColor color) {
        this.color = color;
    }
}