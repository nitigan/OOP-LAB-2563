package Lab5;

// File name : Lab5_4.java
import javax.swing.JOptionPane;
public class Lab5_4 {
    public static void main(String[] args) {
        int num;
        String s1;
        s1 = JOptionPane.showInputDialog("Enter last number :" );
        num = Integer.parseInt(s1);
        int sum = Sumation(num);
        String output = " Sum of 1 to " + num + " is " + sum;
        JOptionPane.showMessageDialog( null, output,"Sumation", JOptionPane.INFORMATION_MESSAGE );
        System.exit(0);
    }
    public static int Sumation(int n){
        if (n > 1)
            return ( n + Sumation(n -1));
        else return (1);
    }
}
