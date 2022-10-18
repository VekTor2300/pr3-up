package com.inf1r.pract2.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Prepod {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String surname, name;
    private Boolean checkstay;
    private Integer hours;
    private Double salary;

    public Prepod(String Surname, String Name, Boolean CheckStay, Integer Hours, Double Salary) {
        this.surname = Surname;
        this.name = Name;
        this.checkstay = CheckStay;
        this.hours = Hours;
        this.salary = Salary;
    }

    public Prepod() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Boolean getCheckstay() {
        return checkstay;
    }

    public void setCheckstay(Boolean checkstay) {
        this.checkstay = checkstay;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
