/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t2q2;

/**
 *
 * @author acer
 */
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("contact: ");
        String contact = input.nextLine();
        System.out.print("diameter: ");
        double diameter = input.nextDouble();
        double circumference = Math.PI * diameter;
        System.out.printf("circumference = %.3f\n", circumference);
        
        System.out.print("Enter value in inch: ");
        double inch = input.nextDouble();
        double meter = inch / 39.37 ; 
        System.out.printf(meter + "inches = %.2f\n", meter);


        
        input.close();
    }
   
    
}
