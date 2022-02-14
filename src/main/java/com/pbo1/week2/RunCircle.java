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

import java.util.Scanner;

public class RunCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        Circle circle1=new Circle();
        Circle circle2=new Circle();
        
        
        System.out.println("Masukkan radius lingkaran: ");
        circle1.setRadius(input.nextInt());
        
        circle1.calcArea();
        System.out.println("Area:"+circle1.getArea());
        
    }

}
class newclass{
    
}
