/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurabullock
 */
public class DynInit {
    
    public static void main(String[] args){
        double volume = 3.1416;                     //declares variable named volume; sets equal to 3.1416
        double radius = 4;                          //declares variable named radius; sets equal to 4
        double height = 5;                          //declares variable name height; sets equal to 5
        double radSq = radius * radius;             //declares variable named radSq; sets equal to the variable radius times itself
        double volOfCyl = volume * radSq * height;  //declares variable named volOfCyl; computes volume of a cylnder
        String arithExp = "multiplication";         //declares string named arithExp; set equal to the word "multiplication"
        
        System.out.println("      Volume is " + volOfCyl); //prints string and appends volume of a cylinder
        System.out.println();
        System.out.println("Numerical number(s) used in code:  ");
        System.out.println("      volume = " + volume);
        System.out.println("      radius = " + radius);
        System.out.println("      height = " + height);
        System.out.println();
        System.out.println("Arithmetic expression used in code:  ");
        System.out.println("      " + arithExp);
    }
}