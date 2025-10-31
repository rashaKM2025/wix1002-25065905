/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2q7;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class T2Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.print("Enter value in inch: ");
double inch = input.nextDouble();
double meter = inch / 39.37 ; 
System.out.printf(inch + "inches = %.2f meters\n", meter);

        // TODO code application logic here
    }
    
}
