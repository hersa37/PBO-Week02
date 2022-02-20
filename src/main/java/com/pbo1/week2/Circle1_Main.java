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

public class Circle1_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        Circle1 circle1=new Circle1(0);
        
        System.out.print("Masukkan jari-jari lingkaran\t: ");
        circle1.setRadius(input.nextDouble());

        System.out.println("Luas dari lingkaran adalah\t: "
                +circle1.getArea()+"\n");
        
        circle1.printAttribute();
        
    }

}

