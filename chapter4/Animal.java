//package chapter4;

import java.io.*;//importing java I/O package
public class Animal
{
    File imageFile; //The filename storing the image of the animal
    String food; //"meat" or "grass"
    int hunger;//hunger level of the animal. It changes depending on
    //when and how much the animal eats
    int locationX;//X coordinate of the animal in space
    int locationY; //Y coordinate of the animal in space
    public void makeNoise()
    {
        System.out.println("A generic animal sound.");
    }
    public void eat()
    {
        System.out.println("A generic food for animal.");
    }
    public void sleep()
    {
        System.out.println("Animal Sleeps.");
    }
    public void roam()
    {
        System.out.println("Animal roams.");
    }
}