package com.example.jma_springcrud_demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tutorials")
public class Tutorial {

    // FIELDS START
    @Id // this designates our PRIMARY KEY
    @GeneratedValue(strategy=GenerationType.IDENTITY) // this AUTO_COMPLETED new entries created with an ID number
    @Column(name="id") // tells SQL to create a column with this name
    private long model_id; // Primary Key (PK)

    // TITLE
    @Column(name="title")
    private String model_title;

    // DESCRIPTION
    //??????? @Size(min=0, max=40) why cant I use this here, is the dependency not included for this annotation ???????
    @Column(name="description")
    private String model_description;

    // PUBLISHED
    @Column(name="published")
    private boolean model_published;
    // FIELDS END

    // NO ARGS/ALL ARGS CONSTRUCTORS START
//    public Tutorial(){
//
//    }

//    public Tutorial(long model_id, String model_title, String model_description, boolean model_published) {
//        this.model_id = model_id;
//        this.model_title = model_title;
//        this.model_description = model_description;
//        this.model_published = model_published;
//    }
    // NO ARGS/ALL ARGS CONSTRUCTORS END

    // GETTERS/SETTERS START
    public long getModel_id() {
        return model_id;
    }

    public void setModel_id(long model_id) {
        this.model_id = model_id;
    }

    public String getModel_title() {
        return model_title;
    }

    public void setModel_title(String model_title) {
        this.model_title = model_title;
    }

    public String getModel_description() {
        return model_description;
    }

    public void setModel_description(String model_description) {
        this.model_description = model_description;
    }

    public boolean isModel_published() {
        return model_published;
    }

    public void setModel_published(boolean model_published) {
        this.model_published = model_published;
    }
    // GETTERS/SETTERS END

    // TO STRING METHOD
    @Override
    public String toString() {
        return "Tutorial{" +
                "model_id=" + model_id +
                ", model_title='" + model_title + '\'' +
                ", model_description='" + model_description + '\'' +
                ", model_published=" + model_published +
                '}';
    }
}
