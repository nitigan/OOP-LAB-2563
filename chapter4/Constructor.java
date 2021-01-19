//package chapter4;

public class Constructor
{
    //Declare data member, or called member variable.
    private int i;
    private boolean b;
    //Constructor that takes no parameters
    public Constructor()
    {
        //i = 100;
        //b = false;
    }
    //Constructor that takes parameter
    public Constructor(int i, boolean b)
    {
        this.i = i;
        this.b = b;
    }
    //public access methods, getters and setters
    public void setI(int i)
    {
        this.i = i;
    }
    public int getI()
    {
        return i;
    }
    public boolean getB()
    {
        return b;
    }
    public void setB(boolean b)
    {
        this.b = b;
    }
    //my testing method for Constructor class
    public static void main(String[] args)
    {
        System.out.println("Instantiate an object using constructor without parameters");
        Constructor c = new Constructor();
        c.setI(30);
        c.setB(false);
        System.out.println("c.i="+c.getI()+" c.b="+c.getB());
        System.out.println("\nInstantiate an object using constructor with parameters");
        Constructor d = new Constructor(50, true);
        System.out.println("d.i="+d.getI()+" d.b="+d.getB());
    }
}
