/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2q6;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class T2Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.print("Enter diameter: ");
double diameter = input.nextDouble();
double circumference = Math.PI * diameter;
System.out.printf("The circumference of the circle is: %.3f\n", circumference);        
        // TODO code application logic here
    }
    
}
