/**
 * @author Laura Bullock
 * October 23, 2017
 * Java Developer 1 - Introduction to Java Programming - Part 5
 * Exercise:  Instantiating a class
 */
class Vehicle2 {
  
    //instance variables below:
    //members
    int passengers; // number of passengers
    int fuelcap;    //capacity of fuel
    int mpg;        //fuel consumption in miles per gallon
}

class TwoVehicles{
    public static void main(String args[]){
        
        /** instances of the class Vehicle2 (each time you create an instance of the class, you are creating an object that contains
         * it's own copy of the instance variable defined by the class)
         */
        Vehicle2 minivan = new Vehicle2();
        Vehicle2 sportscar = new Vehicle2();
        Vehicle2 FourWheelTruck = new Vehicle2();
       
        //Variables for range of gas mileage for each vehicle
        int range1;
        int range2;
        int range3;
        
        //assigns values to the variables for minivan
        minivan.passengers = 8;
        minivan.fuelcap = 16;
        minivan.mpg = 22;
        
        //assigns values to the variables for sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        //assigns values to the variables for FourWheelTruck
        FourWheelTruck.passengers = 5;
        FourWheelTruck.fuelcap = 16;
        FourWheelTruck.mpg = 18;
        
        //compute the ranges for each type of vehicle assuming it has a full tank of gas
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;
        range3 = FourWheelTruck.fuelcap * FourWheelTruck.mpg;
        
        String mileageMessage = "A minivan can carry " + minivan.passengers + " passengers, with a range of " + range1 + " miles on a full tank of gas.\n"
                + "A sports car can carry " + sportscar.passengers + " passengers, with a range of " + range2 + " miles on a full tank of gas.\n"
                + "A four wheel truck can carry " + FourWheelTruck.passengers + " passengers, with a range of " + range3 + " miles on a full tank of gas.";
                        
        System.out.println(mileageMessage);
     
    }
}
