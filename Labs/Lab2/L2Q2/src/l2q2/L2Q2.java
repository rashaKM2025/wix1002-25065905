/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q2;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class L2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("The price of the car: ");
        double P = input.nextDouble();
        System.out.print("Down Payment: ");
        double D = input.nextDouble();
        System.out.print("Interest rate in %: ");
        double R = input.nextDouble();
        System.out.print("Loan duration in year: ");
        int Y = input.nextInt();
        double M =  (P - D) * (1 + R*Y/100) / (Y *12);
        System.out.printf("Monthly payment = %.2f\n", M);
        // TODO code application logic here
    }
    
}
