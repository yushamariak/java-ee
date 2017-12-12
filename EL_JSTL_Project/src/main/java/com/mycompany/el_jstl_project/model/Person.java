/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.el_jstl_project.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yusha
 */
public class Person {
    private String name;
    private String adress;
    private String sex;
    private String birthDate;
    private List<String> phones;
    private List<String> emails;
    private Dog dog;

    public Person() {
        name = "no name";
        adress = "sem adress";
        sex = "sem sex";
        birthDate = "sem birthDate";
        phones = new ArrayList<>();
        emails = new ArrayList<>();
        dog = new Dog();
    }

    public Person(String name, String adress, String sex, String birthDate) {
        this.name = name;
        this.adress = adress;
        this.sex = sex;
        this.birthDate = birthDate;
        phones = new ArrayList<>();
        emails = new ArrayList<>();
        dog = new Dog();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<String> phones) {
        this.phones = phones;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(ArrayList<String> emails) {
        this.emails = emails;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void addPhone(String phone) {
        phones.add(phone);
    }

    public void addEmail(String email) {
        emails.add(email);
    }

}
