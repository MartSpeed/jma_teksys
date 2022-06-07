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
    @GeneratedValue(strategy=GenerationType.AUTO) // this AUTO_COMPLETED new entries created with an ID number
    //@Column(name="id") // tells SQL to create a column with this name
    private long modelId; // Primary Key (PK)

    // TITLE
    @Column(name="title")
    private String modelTitle;

    // DESCRIPTION
    //??????? @Size(min=0, max=40) why cant I use this here, is the dependency not included for this annotation ???????
    @Column(name="description")
    private String modelDescription;

    // PUBLISHED
    //@Column(name="published")
    private boolean modelPublished;
    // FIELDS END

    // GETTERS/SETTERS START
    public long getModelId() {
        return modelId;
    }

    public void setModelId(long modelId) {
        this.modelId = modelId;
    }

    public String getModelTitle() {
        return modelTitle;
    }

    public void setModelTitle(String modelTitle) {
        this.modelTitle = modelTitle;
    }

    public String getModelDescription() {
        return modelDescription;
    }

    public void setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
    }

    public boolean isModelPublished() {
        return modelPublished;
    }

    public void setModelPublished(boolean modelPublished) {
        this.modelPublished = modelPublished;
    }
    // GETTERS/SETTERS END

    // TO STRING METHOD
    @Override
    public String toString() {
        return "Tutorial{" +
                "modelId=" + modelId +
                ", modelTitle='" + modelTitle + '\'' +
                ", modelDescription='" + modelDescription + '\'' +
                ", modelPublished=" + modelPublished +
                '}';
    }
}
