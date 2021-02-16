package chapter5.src;
import javax.swing.JOptionPane;

public class Lab5_4Edit {
    public static void main(String[] args) {
        int num1,num2;
        String s1,s2;

        s1 = JOptionPane.showInputDialog("Enter first number :" );
        num1 = Integer.parseInt(s1);

        s2 = JOptionPane.showInputDialog("Enter last number :" );
        num2 = Integer.parseInt(s2);

        int sum = Sumation(num1,num2);
        String output = " Sum of "+ num1 + " to " + num2 + " is " + sum;
        JOptionPane.showMessageDialog( null, output,
        "Sumation", JOptionPane.INFORMATION_MESSAGE );
        System.exit(0);
    }

    public static int Sumation(int n1 , int n2){
        if (n2 > n1)
            return ( n2 + Sumation(n1,n2-1));
        else return (n1);
    }
}
