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
public class Circle1 {
    
    private double radius;
    
    public Circle1(double rad){
        radius=rad;
    }

    public void setRadius(double rad){
        radius=rad;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double getArea(){
        double area=Math.PI*Math.pow(radius, 2);
        return area;
    }  
  
    public void printAttribute(){
        System.out.println("Atribut");
        System.out.println("Jari-jari\t\t:"+radius);
    }
}

