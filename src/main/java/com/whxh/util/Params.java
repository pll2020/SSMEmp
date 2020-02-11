package com.whxh.util;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Params {
    private int pageNum;//当前页
    private int pageSize=3;//每条页数

    private String name;
    private int ageFrom;
    private int ageTo;
    private String address;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthdayFrom;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthdayTo;
    private String grade;


    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Params() {
    }

    @Override
    public String toString() {
        return "Params{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                '}';
    }


    public Params(String name, int ageFrom, int ageTo, String address, Date birthdayFrom, Date birthdayTo, String grade) {
        this.name = name;
        this.ageFrom = ageFrom;
        this.ageTo = ageTo;
        this.address = address;
        this.birthdayFrom = birthdayFrom;
        this.birthdayTo = birthdayTo;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeFrom() {
        return ageFrom;
    }

    public void setAgeFrom(int ageFrom) {
        this.ageFrom = ageFrom;
    }

    public int getAgeTo() {
        return ageTo;
    }

    public void setAgeTo(int ageTo) {
        this.ageTo = ageTo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthdayFrom() {
        return birthdayFrom;
    }

    public void setBirthdayFrom(Date birthdayFrom) {
        this.birthdayFrom = birthdayFrom;
    }

    public Date getBirthdayTo() {
        return birthdayTo;
    }

    public void setBirthdayTo(Date birthdayTo) {
        this.birthdayTo = birthdayTo;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
