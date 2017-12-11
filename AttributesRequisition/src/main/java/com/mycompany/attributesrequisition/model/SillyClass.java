/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.attributesrequisition.model;

/**
 *
 * @author yusha
 */
public class SillyClass {
    private String colour;
    private double weight;

    public SillyClass() {
        colour = "Blue";
        weight = 2.4;
    }

    public String getcolour() {
        return colour;
    }

    public void setcolour(String colour) {
        this.colour = colour;
    }

    public double getweight() {
        return weight;
    }

    public void setweight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "SillyClass{" + "colour=" + colour + ", weight=" + weight + '}';
    }

}
