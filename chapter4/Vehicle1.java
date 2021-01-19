//package chapter4;

public class Vehicle1
{
    //declare instance variables
    private int id;//ID for this vehicle
    private int passengers; //number of passengers
    private int fuelCap; //fuel capacity in gallons
    private int mpg; //fuel consumption in miles per gallon
    //Add constructor. This constructor with parameter list
    //initialized all the instance data members. So
    //after the "new" operator use this constructor,
    //a well constructed object of class Vehicle is created.
    public Vehicle1(int id, int passengers, int fuelCap, int mpg)
    {
        this.id = id;
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.mpg = mpg;
    }
    //Add public access method for instance variable id.
    public int getID() //getter method
    {
        return id;
    }
    //Expose this method by declaring it public. Other object can
    //interact with this object by calling method and get the result.
    //Other object doesn't care how Vehicle1's range() method calculates
    //the range of a vehicle. They don't care how many variables a
    //Vehicle1 object has. These are implementation details of a
    //Vehicle object and should be encapsulated within this class/object
    //and hidden from other class/object.
    public int range()
    {
        return fuelCap*mpg;
    }
    // My test program for class Vehicle
    public static void main(String[] args)
    {
        Vehicle1 v1 = new Vehicle1(1, 4, 17, 25);
        int range = v1.range();
        System.out.println("The range of the vehicle is "+range+".");
    }
}