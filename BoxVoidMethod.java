/**
 * This code includes a void method inside the BoxVoidMethod class
 * @author Laura Bullock
 * 11/17/2017
 */
public class BoxVoidMethod {
 
    double width; // width of the box
    double height; // height of the box
    double depth; // depth of the box
    
    // Display the volume method of BoxVoidMethod class
    void volume() {
        System.out.println("Volume is " + width * height * depth);
    }
}

class BoxDemo3 {
    public static void main(String args[]) {
        
        BoxVoidMethod mybox1 = new BoxVoidMethod();
        BoxVoidMethod mybox2 = new BoxVoidMethod();
        
        // assign values to mybox1's instance variables
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        
        // assign different values to mybox2's instance variables
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        
        // display volume of first box
        mybox1.volume();
        
        // display volume of second box
        mybox2.volume();
    }
}
