/**
 * Java Developer I
 * Course Subject:  Java
 * Exercise:  Math Operators
 * Objective:  This program will show how to use basic arithmetic operators,
 *             declare and add values to variables, then add, subtract,
 *             multiply, divide, and use modulus to show what's left over
 * Jan 11, 2018
 * @author Laura V. Bullock
 */
import java.util.Scanner;

class MathOperators {
    public static void main(String[] args) {
        Scanner addition = new Scanner(System.in);
        
        int seedBeads, bicones, rondelles, totalBeads;  //delcares whole number variables
        seedBeads = 50;                                 //gives a value to the variable
        bicones = 25;                                   //gives a value to the variable
        rondelles = 15;                                 //gives a value to the variable
        totalBeads = seedBeads + bicones + rondelles;   //calcuation formula uses + (addition) operator
        
        System.out.println("ADDITION:");
        System.out.println("The total count of beads needed for this pattern is:  " + totalBeads);
        System.out.println("  - 11o seed beads:  " + seedBeads);
        System.out.println("  - Swarovski bicones:  " + bicones);
        System.out.println("  - Swarovski rondelles:  " + rondelles);
        System.out.println();                          //prints a blank line
        
        Scanner subtraction = new Scanner(System.in);
        
        int apples, eaten, totalFruit;               //delcares whole number variables
        apples = 50;                                 //gives a value to the variable
        eaten = 25;                                  //gives a value to the variable
        totalFruit = apples - eaten;                 //calcuation formula uses - (subtraction) operator
                
        System.out.println("SUBTRACTION:");
        System.out.println("We have " + totalFruit + " apples remaining.");
        System.out.println("  - purchased:  " + apples);
        System.out.println("  - ate:  " + eaten);
        System.out.println();                         //prints a blank line
        
        Scanner multiplication = new Scanner(System.in);
        
        int boats, multiplyBy, totalBoats;            //delcares whole number variables
        boats = 50;                                   //gives a value to the variable
        multiplyBy = 2;                               //gives a value to the variable
        totalBoats = boats * multiplyBy;              //calcuation formula uses * (multiplication) operator
                
        System.out.println("MULTIPLICATION:");
        System.out.println("There are currently " + boats + " boats in stock.  We want to double the inventory.");
        System.out.println("We have to multiply by " + multiplyBy + ", so can have:  " + totalBoats + " boats.");
        System.out.println();                          //prints a blank line
        
        Scanner division = new Scanner(System.in);
        
        int stock, divideBy, totalInventory;            //delcares whole number variables
        totalInventory = 1500;                          //gives a value to the variable
        divideBy = 3;                                   //gives a value to the variable
        stock = totalInventory / divideBy;              //calculation uses / (division) operator
                
        System.out.println("DIVISION:");
        System.out.println("There are currently " + totalInventory + " boats in stock.  We sold triple the inventory to Joe's company.");
        System.out.println("We have to divide by " + divideBy + ", to show the remaining inventory of:  " + stock + " boats.");
        System.out.println();                          //prints a blank line
        
        Scanner modulus = new Scanner(System.in);
        
        int apples2;                                     //delcares whole number variable
        double eaten2, totalFruit2;                      //if using a decimal, declare using double
        apples2 = 50;                                    //whole number value
        eaten2 = 43.5;                                   //decimal value
        totalFruit2 = apples2 % eaten2;                  //calcuation formula uses % (modulus) returns only the REMAINDER, DO NOT CONFUSE WITH division or subtraction
                
        System.out.println("MODULUS:");
        System.out.println("There are " + totalFruit2 + " apples left over.");
        System.out.println("  - purchased:  " + apples2);
        System.out.println("  - ate:  " + eaten2);
        System.out.println();                           //prints a blank line
 
    }

}

/**
 * NOTES/COMMENTS:  
 * - Each variable can be declared on a separate line with the correct data type
 * - Whenever using 2 integers/whole numbers the result will also be an int  -  
 *   If you use a decimal, then you must declare the variables as double
 * - When using an whole number (int) with a decimal (double), as with the modulus in this exercise, the result will be a decimal
 * - Basic Java Arithmetic operators:
 *   - addition         = +
 *   - subtraction      = -
 *   - multiplication   = *
 *   - division         = /
 *   - modulus          = % (returns the remainder)
 */