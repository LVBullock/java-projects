/**
 * This code includes a return method inside the BoxReturnMethod class
 * @author Laura Bullock
 * 11/17/2017
 */
public class BoxReturnMethod {
    
    double width; // width of the box
    double height; // height of the box
    double depth; // depth of the box
    
    // Display the volume method of BoxReturnMethod class (does not begin with "void")
    double volume() {
        return width * height * depth;
    }  
}

class BoxDemo4 {
    public static void main(String args[]) {
       BoxReturnMethod mybox1 = new BoxReturnMethod();
       BoxReturnMethod mybox2 = new BoxReturnMethod();
       
       double vol1, vol2;
       
       //assign values to mybox1's instance variables
       mybox1.width = 10;
       mybox1.height = 20;
       mybox1.depth = 15;
       
       // assign different values to mybox2's instance variables
       mybox2.width = 3;
       mybox2.height = 6;
       mybox2.depth = 9;
        
       //get volume of first and second box
        
       vol1 = mybox1.volume();
       vol2 = mybox2.volume();
        
       System.out.println("Volume is " + vol1);
        
       System.out.println("Volume is " + vol2);
        
    }
}