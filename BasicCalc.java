/**
 * Independent Study
 * Course Subject:  Java
 * Exercise:  Basic Calculator
 * Objective:  This program is developing a basic calculator using variables,
 *             get user input for 2 numbers, add the numbers and display the result.
 * Jan 9, 2018
 * @author Laura V. Bullock
 */
import java.util.Scanner; //Scanner is a built-in function of Java.

public class BasicCalc {
    
    //main method
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        
        //declare variables with double data type for decimals
        double num1, num2, result; 
        
        //Ask user for first number
        System.out.print("Enter first number here and hit enter --> ");
        //assign value for first number and pause for user input
        num1 = calc.nextDouble();
        
        //Ask user for second number   
        System.out.print("Enter second number here and hit enter --> ");
        //assign value for second number and pause for user input
        num2 = calc.nextDouble(); 
        
        //calculate the result of first and second numbers
        result = num1 + num2; 
        //display the result
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}

/**
 * NOTES/COMMENTS:  
 * - data types:  double = decimals, int = whole numbers
 * - .next____() should be the same data type used in variable
 * - In order to get + and = to print as text, they must be placed between quotes
 */