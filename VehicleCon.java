/*
 * Intro to Java Programming Part 5.4 - Constructors
 * 12/8/2017
 *
 * @author laurabullock
 */

class VehicleCon {
    //int passengers; 
    double x, y;
      
    VehicleCon(double fuel, double mpg) {
        x = fuel;
        y = mpg;
    }

    //Compute fuel needed for a given distance
    double fuelneeded(double miles) {
       return (double) miles / y;
    }
}
class VehConsDemo {
    public static void main(String args[]){
        //create constructor
        VehicleCon minivan = new VehicleCon(16, 21);
        VehicleCon sportscar = new VehicleCon(14, 12);
        
        double gallons;
        double dist = 252;
        
        //assign value to fields in minivan
        //minivan.passengers = 7;
        minivan.x = 16;
        minivan.y = 21;
        
        //assign value to fields in sportscar
        //sportscar.passengers = 2;
        sportscar.x = 14;
        sportscar.y = 12;

        gallons = minivan.fuelneeded(dist);
        System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");

        gallons = sportscar.fuelneeded(dist);
        System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");
    }
}
