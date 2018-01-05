/**
 * @author Laura Bullock
 * November 6, 2017
 * Java Developer 1 - Introduction to Java Programming - Part 5.1
 * Exercise:  Creating Objects
 */
class Rectangle {
    int width;
    int height;

}

class myRect {
    public static void main(String[] args) {
        
        Rectangle rectWidth = new Rectangle();
        Rectangle rectHeight = new Rectangle();
    
        int area;
        
        rectWidth.width = 40;
        rectHeight.height = 50;
        
        area = rectWidth.width * rectHeight.height;
        
        System.out.println("myRect's area is " + area);
    }    
}
