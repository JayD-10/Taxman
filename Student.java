package com.example.demo;

public class Student {
    private String fname;
    private String lname;
    private String email_id;
    private String address;
    private String mob_no;
    private String date;

    public Student(String fname, String lname, String email_id, String address, String mob_no, String date) {
        this.fname = fname;
        this.lname = lname;
        this.email_id = email_id;
        this.address = address;
        this.mob_no = mob_no;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMob_no() {
        return mob_no;
    }

    public void setMob_no(String mob_no) {
        this.mob_no = mob_no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email_id='" + email_id + '\'' +
                ", address='" + address + '\'' +
                ", mob_no='" + mob_no + '\'' +
                '}';
    }
}
