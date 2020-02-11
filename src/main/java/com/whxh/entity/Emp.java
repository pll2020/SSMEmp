package com.whxh.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Emp {
    private int id;
    private String name;
    private int age;
    private String address;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String grade;

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", grade='" + grade + '\'' +
                '}';
    }

    public Emp(String name, int age, String address, Date birthday, String grade) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.birthday = birthday;
        this.grade = grade;
    }

    public Emp(int id, String name, int age, String address, Date birthday, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.birthday = birthday;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Emp() {
    }
}
