/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q4;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class L2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of Second: ");
        int second = inp.nextInt();
        
        int hour = second / 3600;
        int remain = second % 3600;
        
        int minute = remain / 60;
        int sec = remain % 60;
        System.out.println(hour + " hours, " + minute + " minutes and " + sec + " seconds ");
    } 
    
}
