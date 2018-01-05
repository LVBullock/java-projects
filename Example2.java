/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurabullock
 */
public class Example2 {
    
    public static void main (String[] args){
        int var1;
        int var2;
        
        var1 = 1024;
        var2 = var1 / 2; // compute result of 1024/2
        
        String arithExp = "Division";
        
        System.out.println("   var1 contains " + var1);
        System.out.println("   var2 contains var1 / 2:  " + var2);  //print 
        System.out.println();
        System.out.println("Numerical number(s) used in code:  ");
        System.out.println("   " + var1);
        System.out.println();
        System.out.println("Arithmetic expression used in code:  ");
        System.out.println("   " + arithExp);
    }
    
}
