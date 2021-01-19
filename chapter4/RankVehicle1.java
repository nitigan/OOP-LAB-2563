//package chapter4;

public class RankVehicle1
{
// identify the vehicle with higher range, return that Vehicle1 object
    public Vehicle1 compareRange(Vehicle1 v1, Vehicle1 v2)
    {
        // //delegate the calculating of range to each Vehicle1 object.
        //I don't know how to calculate the range of a vehicle.
        //I don't care about it, either. It is not my problem.
        //It is a problem of each Vehicle1 object.
        int range1 = v1.range();
        int range2 = v2.range();
        //I know how to compare! That is all what I do, and I do it very well!
        if (range1>range2)
            return v1;
        else
            return v2;
    }
    public static void main(String[] args)
    {
        //Instantiate two vehicle1 objects using constructor with parameters
        Vehicle1 vehicle1 = new Vehicle1(1, 4, 16, 22);
        Vehicle1 vehicle2 = new Vehicle1(2, 4, 17, 21);
        //Instantiate a RankVehicle1 object who knows how to rank vehicles.
        RankVehicle1 rv = new RankVehicle1();
        //Delegate the ranking effort to object rv.
        Vehicle1 vHigh = rv.compareRange(vehicle1, vehicle2);
        //Print out some result.
        System.out.println("Vehicle "+ vHigh.getID() + " has higher range.");
    }
}