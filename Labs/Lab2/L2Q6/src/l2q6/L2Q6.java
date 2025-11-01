/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q6;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class L2Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in gram: ");
        double M = input.nextInt();
        double MInKg = M / 1000;
        
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double IF = input.nextDouble();
        double IC = (IF - 32) / 1.8;
        
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double FF = input.nextDouble();
        double FC = (FF - 32) / 1.8;
        
        double Q = MInKg * (FC - IC) * 4184;
        
        System.out.println("The energy needed is: " + Q);
        // TODO code application logic here
    }
    
}
