package Lab5;

import java.security.interfaces.ECKey;

import javax.swing.JOptionPane;

// File Name : Lab5_3.java
public class Lab5_3_edit {
    public static void main(String[] args) {
        Lab5_3_edit obj = new Lab5_3_edit();
        int value, startNum,endNum;

        String output = "",sNum,sEnd;

        sNum = JOptionPane.showInputDialog("Enter start Int value" );
        sEnd = JOptionPane.showInputDialog("Enter End Int value" );
        
        startNum = Integer.parseInt(sNum);
        endNum = Integer.parseInt(sEnd);

        

        // loop 20 times
        for ( int counter = 1; counter <= 20; counter++ ) {
             
            if(startNum < endNum){
                value =obj.randomNumber(startNum, endNum);
            }else{
                value=obj.randomNumber(endNum, startNum);
            }
            output += value + " "; // append value to output
            // if counter divisible by 5, append newline to String output
            if ( counter % 5 == 0 )
            output += "\n";
        } // end for
        JOptionPane.showMessageDialog( null, output,"20 Random Numbers ",JOptionPane.INFORMATION_MESSAGE );
        System.exit( 0 ); // terminate application
    }


    public int randomNumber(int sNum,int eNum){
        int ranNumber=0;
        //ranNumber =    1 + (int)( Math.random() * 100 );
        //ranNumber =   20 + (int)( Math.random() * ((100-20)+1) ); // 20 ถึง 100;
        //sNum = 20 ; eNum = 100;
        ranNumber = sNum + (int)( Math.random() * ((eNum-sNum)+1) ); 
        return ranNumber;
    }
}