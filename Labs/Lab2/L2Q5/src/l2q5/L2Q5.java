/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q5;

/**
 *
 * @author acer
 */
import java.util.Random;
public class L2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Random rnd = new Random();
int number = rnd.nextInt(10001);
System.out.println("Random number: " + number);
int sum = 0;
int temp = number;

while (temp > 0) {
    sum += temp % 10;
    temp /= temp;
}
       System.out.println("The sum of the number: " + sum);
        // TODO code application logic here
    }
    
}
