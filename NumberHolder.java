/**
 * @author Laura Bullock
 * November 6, 2017
 * Java Developer 1 - Introduction to Java Programming - Part 5.1
 * Exercise:  Creating Objects - question 3
 */

class NumberHolder {
    
    //defining the variables
    int integer;
    double decimal;
}

class holder {
    public static void main(String args[]) {
        
        NumberHolder holdInt = new NumberHolder();
        NumberHolder holdDouble = new NumberHolder();

        holdInt.integer = 48;
        holdDouble.decimal = 9.25;
        
        System.out.println("This number is an integer:  " + holdInt.integer);
        System.out.println("This number is a double:  " + holdDouble.decimal);
        
    }
}
