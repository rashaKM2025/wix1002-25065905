/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q1;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class L2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fahrenheit degree: ");
        double Fahrenheit = input.nextDouble();
        double Celsius = (Fahrenheit - 32) / 1.8 ;
        System.out.printf("Celsius = %.2f\n", Celsius);
        
        // TODO code application logic here
    }
    
}
