/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package com.pbo1.week2;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class Circle {
    
    private double radius;
    private double area;
    
    public void setRadius(double rad){
        radius=rad;
    }
    
    public double getArea(){
        return area;
    }
    
    public void calcArea(){
        area=Math.PI*Math.pow(radius, 2);        
    }
    
    public void print(double print){
        System.out.println(print);
    }
}
