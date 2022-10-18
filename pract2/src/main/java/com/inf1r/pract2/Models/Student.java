package com.inf1r.pract2.Models;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String surname, name;
    private Double Scholarship;
    private Integer groups;
    @Temporal(TemporalType.DATE)
    private Date birthday;


    public Student(String Surname, String Name, Double Scholarship, Integer Groups, Date Birthday) {
        this.surname = Surname;
        this.name = Name;
        this.Scholarship = Scholarship;
        this.groups = Groups;
        this.birthday = Birthday;
    }

    public Student() {

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScholarship() {
        return Scholarship;
    }

    public void setScholarship(Double Scholarship) {
        this.Scholarship = Scholarship;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getGroups() {
        return groups;
    }

    public void setGroups(Integer groups) {
        this.groups = groups;
    }



    public Date getBirthday() {

        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getBirthdayString(){
        return new SimpleDateFormat("yyyy-MM-dd").format(this.getBirthday());
    }
}
