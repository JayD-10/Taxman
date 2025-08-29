package com.example.demo.jpa;

import jakarta.persistence.*;
 
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Lob //large object- now it will be able to 
    //extract & display the whole data on H2 Console
    private String form16Data;
    public Long getId() {
        return id;
    }
   
    public void setId(Long id) {
        this.id = id;
    }
    public String getForm16Data() {
        return form16Data;
    }
    public void setForm16Data(String form16Data) {
        this.form16Data = form16Data;
    }
     @Override
    public String toString() {
        return "Customer [id=" + id + ", form16Data=" + form16Data + ", getId()=" + getId() + ", getForm16Data()="
                + getForm16Data() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }

}