package Lab5;

import javax.swing.JOptionPane;
public class Lab5_2 {
    public static void main(String[] args) {
                
        Lab5_2 obj = new Lab5_2();

        double number1, number2, number3;
        String s1, s2, s3;
        String output;
        s1 = JOptionPane.showInputDialog("Enter first floating-point value" );
        s2 = JOptionPane.showInputDialog("Enter second floating-point value" );
        s3 = JOptionPane.showInputDialog("Enter third floating-point value" );
        // convert user input to double values
        number1 = Double.parseDouble( s1 );
        number2 = Double.parseDouble( s2 );
        number3 = Double.parseDouble( s3 );
        double max = obj.maximum( number1, number2, number3 ); // เรียกใช้ method ของ obj
        double min = obj.minimum( number1, number2, number3 ); // เรียกใช้ method ของ obj
        output = "number1: " + number1 + "\nnumber2: " + number2 ;
        output += "\nnumber3: " + number3 + "\nmaximum is: " + max;
        output += "\nminimum is: " + min;
        JOptionPane.showMessageDialog( null, output);
        System.exit(0);
    }
    //public static double maximum( double x, double y, double z )
    public double maximum( double x, double y, double z )
    {
        return Math.max( x, Math.max( y, z ) );
    } // end method maximum

    //public static double minimum( double x, double y, double z )
    public double minimum( double x, double y, double z )
    {
        return Math.min( x, Math.min( y, z ) );
    } // end method minimum
}