package chapter5.src;

import javax.swing.JOptionPane;

public class countDigit {
    
public static int count=0;

    public static void main(String [] args) {
        String num1,result="";
        long numDigit; 

        num1 = JOptionPane.showInputDialog("Enter Number : ");
        numDigit = Long.parseLong(num1);
        result = "Number digit of "+num1+ " is "+countD(numDigit)+" digits";

        JOptionPane.showMessageDialog(null, result , "Result",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

    public static int countD(Long num) {
        

        if(num > 0){
            count++;
            return countD(num/10);
        }else{
            return count;
        }
    }
}
