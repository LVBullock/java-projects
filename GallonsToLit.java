/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurabullock
 */
public class GallonsToLit {
    
    public static void main (String[] args){
        
        double litersPerGal = 3.7854;
        double galCount = 10;
        double numOfLiters = litersPerGal * galCount; //calculates and converts the gallons to liters
        
        System.out.println("   " + galCount + " gallons is " + numOfLiters + " liters");         
        
    }
    
}
