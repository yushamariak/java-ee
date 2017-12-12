/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.el_jstl_project.model;

/**
 *
 * @author yusha
 */
public class Dog {
    private String name;
    private String breed;
    private String sex;

    public Dog() {
        name = "no name";
        breed = "no breed";
        sex = "no sex";
    }

    public Dog(String name, String breed, String sex) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
