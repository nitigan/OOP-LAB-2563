//package chapter4;

public class Cat extends Animal
{
    public void makeNoise()
    {
        System.out.println("I am a cat, meow.");
    }
    public void eat()
    {
        System.out.println("I am a cat. I eat meat");
    }
    //my testing program for class Cat
    public static void main(String[] args)
    {
        Cat cat = new Cat(); //I am creating an object of subclass, Cat
        cat.food = "meat";//I am accessing its inherited instance variable.
        cat.hunger = 10;//I am accessing its inherited instance variable.
        cat.makeNoise();//I am accessing its overriden method.
        cat.eat();//I am accessing its overriden method.
        cat.sleep();//I am accessing its inherited method.
        cat.roam();//I am accessing its inherited method.
    }
}
