package com.example.testapis.model;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

//Mapping fields with the table in Database
@Entity
@Table(name = "master_student")

public class Student {

    @NotNull //can not null
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // use for generate id automatically
    @Column(name ="student_id") // column name ib database
    private Integer StudentId;

    @NotNull
    @Column(name="student_name")
    private String StudentName;

    @Column(name="phone")
    private Integer Phone;

    @Column(name="email")
    private String Email;

    @Column(name="address")
    private String Address;

    @NotNull
    @Column(name="user")
    private String User;

    @NotNull
    @Column(name="password")
    private String Password;


    public Student() {}
    // use to create a new Student object with specific values will call this to parameterized directly
    public Student(Integer id, String name, Integer phone, String email, String address, String user, String password) {
        this.StudentId = id;
        this.StudentName = name;
        this.Phone = phone;
        this.Email = email;
        this.Address = address;
        this.User = user;
        this.Password = password;
    }

    public Integer getStudentId() {
        return StudentId;
    }

    public void setStudentId(Integer studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public Integer getPhone() {
        return Phone;
    }

    public void setPhone(Integer phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
