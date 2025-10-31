/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2q5;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class T2Q5 {

    /**
     * @param args the command line arguments
     */
            
    public static void main(String[] args) {
        // answer a
        double AMOUNT = 32.5 ;
        AMOUNT += 10;
        System.out.println("The amount is " + AMOUNT);
        
        // answer b
        String chapter = "Summary" ;
        System.out.println(chapter);
        
        // answer c
        int num = 0 ; // input any int number
        num++; // post increment: increases the num after use
        int num1= num;
    
        int num2 = 0;
        ++num; // pre increment: increases before use
        int num3 = num2;

        // answer d
        double numb = 3000; 
        System.out.printf("%4.2f\n", numb);
        
        // answer e
        Scanner input = new Scanner(System.in);
        System.out.print("contact: ");
        String contact = input.nextLine();
        // TODO code application logic here
    }
    
}
