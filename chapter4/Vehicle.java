//package chapter4;

public class Vehicle
{
    //declare class variables
    int passengers; //number of passengers
    int fuelcap; //fuel capacity in gallons
    int mpg; //fuel consumption in miles per gallon
    //declare class variables, or called static variables
    static boolean hasEngine = true;
    //Declare instance methods.
    void range()
    { //use class variable without dot operator within class method.
        System.out.println(hasEngine);
        System.out.println("Range is " + fuelcap*mpg + " miles.");
    }
    //Declare class methods, or called static methods.
    static int calcRange(int fuelCap, int mpg)
    {
        int theRange = fuelCap * mpg;
        return theRange;
    }
    static Vehicle passByValue(int i, Vehicle v)
    {
        System.out.println("Inside method, passByValue(..)");
        i += 1; //This will not passed back to method caller.
        System.out.println("Within passByValue(..): i+=1="+i);
        v.mpg +=1; //You can modify the data within the object, which will be passed back
        System.out.println("Inside passByValue(..) method, change the original object data,v.mpg+=1="+v.mpg);
        //Instantiate a new Vehicle object
        System.out.println("Within passByValue(..): instantiating a new object, vehicle");
        Vehicle vehicle = new Vehicle();
        vehicle.passengers = 5;
        vehicle.mpg = 50;
        vehicle.fuelcap = 20;
        v = vehicle;//inside the method, the parameter v is now point to vehicle
        //however, argument of the caller will not change its reference
        //to the new object.
        System.out.println("\nInside Method passByValue(..): After v=vehicle, parameter v is pointing to new object vehicle");
        System.out.println("v.passenger=vehicle.passengers="+v.passengers+"v.mpg=vehicle.mpg="+v.mpg+" v.fuelcap=vehicle.fuelcap="+v.fuelcap);
        return vehicle;
    }
    // My test program for class Vehicle
    public static void main(String[] args)
    {
        //Access class variable with dot operator outside class declaration.
        //You can access a class variable, or class method without
        //instantiating an object.
        System.out.println("You can access a class variable, or class method without instantiating an object");
        System.out.println("Access class variable using dot operator: Vehicle.hasEngine=" + Vehicle.hasEngine);
        System.out.println("Access class method using dot operator:");
        int range1 = Vehicle.calcRange(18,33);
        System.out.println("Vehicle.calcRange(18,33)="+range1);
        //Object instantiation
        //create a new object through operator new, which will allocate a
        //block of memory. Also assemble the object in the allocated
        //memory space using a constructor.
        System.out.println("\nInstantiate minivan object");
        Vehicle minivan = new Vehicle();
        minivan.passengers = 7; //set the variable value
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        //compute the range assuming a full tank of gas
        System.out.println("\naccess minivan's instance variables and calculate range");
        int range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan can carry " + minivan.passengers + " passengers with a range of " + range + " miles.");
        //Instantiate a second Vehicle object
        System.out.println("\nInstantiate a second vehicle object");
        Vehicle sedan = new Vehicle();//create a second object
        sedan.passengers = 4;
        sedan.fuelcap = 10;
        sedan.mpg = 35;
        range = sedan.fuelcap * sedan.mpg;
        System.out.println("Sedan can carry " + sedan.passengers + " passengers with a range of " + range + " miles.");
        //Reference variable assignment
        System.out.println("\nReference variable assignment.");
        System.out.println("Creating a third object v");
        Vehicle v = new Vehicle();
        v.passengers=6;
        v.fuelcap=20;
        v.mpg = 12;
        v = minivan;//now v reference the memory block where minivan
        //object reference to.
        //What will happen to the memory block v was
        //reference to? It will be garbage collected.
        //meaning, the memory will be freed and recycled
        //for future allocation.
        System.out.println("after assign object reference minivan to v, v reference the same memory block as minivan reference to");
        System.out.println("v.passengers=minivan.passengers="+v.passengers);
        System.out.println("v.fuelcap=minivan.fuelcap="+v.fuelcap);
        System.out.println("v.mpg=minivan.mpg="+v.mpg);
        //call instance method of the object minivan to calculate the range of minivan
        System.out.println("\nCalling minivan's method:");
        minivan.range();
        //Java method call passes everything by VALUE
        System.out.println("\nJava method passes everything by value");
        System.out.println("Before calling the method, passByValue(..),");
        int j = 10;
        System.out.println("j="+j);
        System.out.println("sedan.passengers=" + sedan.passengers+"sedan.mpg="+sedan.mpg+" sedan.fuelcap="+sedan.fuelcap);
        System.out.println("Calling method passByValue(..)");
        Vehicle v1 = passByValue(j, sedan);
        System.out.println("Now the control is returned to the caller method.");
        System.out.println("Primitive variable is not changed: j="+j);
        System.out.println("sedan references to the same object (memory block), however the value of variable, mpg, in that object changes");
        System.out.println("sedan.passenger="+sedan.passengers+"sedan.mpg="+sedan.mpg+" sedan.fuelcap="+sedan.fuelcap);
    }
}
