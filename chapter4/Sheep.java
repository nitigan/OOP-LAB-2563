//package chapter4;

public class Sheep extends Animal
{
    public void makeNoise()
    {
        System.out.println("I am a sheep: meeeeeier");
    }
    public void eat()
    {
        System.out.println("I am a sheep. I eat grass");
    }
    //my testing program for class Sheep
    public static void main(String[] args)
    {
        Sheep sh = new Sheep();//I am creating an object of subclass, Sheep
        sh.food = "grass";//I am accessing its inherited instance variable.
        sh.hunger = 5;//I am accessing its inherited instance variable.
        sh.locationX = 100;//I am accessing its inherited instance variable.
        sh.locationY = 105;//I am accessing its inherited instance variable.
        sh.eat();//I am accessing its overriden method.
        sh.makeNoise();//I am accessing its overriden method.
        sh.sleep();//I am accessing its inherited method.
        sh.roam();//I am accessing its inherited method.
    }
}