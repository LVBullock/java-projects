/**
 * Java Developer I
 * Course Subject:  Java
 * Exercise:  User Input
 * Objective:  This program will import the scanner, ask the user to enter something; 
 *             the user's message will be stored and printed to the screen when enter.
 * Jan 9, 2018
 * @author Laura V. Bullock
 */

import java.util.Scanner;  //Scanner is a built-in function of Java.

public class UserInput {
    public static void main(String[] args) {
        System.out.print("Enter your message here and press enter when you are done -->  "); //prints a line asking for user input
        Scanner userInput = new Scanner(System.in);  //System.in gets user input and stores what is entered in a placeholder
        System.out.println(userInput.nextLine());   //must first enter Scanner variable userInput before the .; nextLine() pauses for input
        
    }

}

/**
 * NOTES/COMMENTS:  
 * - Must import the Scanner before you can get user input
 * - The Scanner takes information that user types and stores it in a variable
 * - When user hits enter, will only print the message entered
 * - Note:  if entering a long stream of text, it does not time out, nor does not go to a new line automatically 
 */