package com.example.Ex_ValidateForm.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonForm {
    // SETUP: fields
    @NotNull
    @Size(min=2, max = 40)
    private String name;
    //
    @NotNull
    @Min(18) // minimum age to get the discount is 18
    private Integer age;

    public PersonForm() {
    }

    public PersonForm(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonForm{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
