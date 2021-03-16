//package ch7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab7_3 implements ActionListener {
    JLabel numberLabel;
    JTextField numberField;
    JButton btn1, btn2, btn3,btn4, btn5, btn6,btn7, btn8, btn9,btn0,btnc,btnP,btnE,btnM,btnD,btnS,btnMOD;
    JFrame window;
    double num1=0,num2=0,total=0;
    String opertor="";
    public Lab7_3() {
        // obtain content pane and set its layout to FlowLayout
        window = new JFrame("Programm Show Text");
        Container container = window.getContentPane();
        container.setLayout( new FlowLayout() );
        // create numberLabel and attach it to content pane
        numberLabel = new JLabel( "Show Number : " );
        container.add( numberLabel );
        numberField = new JTextField( 10 );
        //numberField.setEditable( false );
        numberField.setHorizontalAlignment(SwingConstants.RIGHT);
        container.add( numberField );
        btn1 = new JButton(" 1 ");
        btn1.addActionListener( this);
        container.add( btn1 );
        btn2 = new JButton(" 2 ");
        btn2.addActionListener( this);
        container.add( btn2 );
        btn3 = new JButton(" 3 ");
        btn3.addActionListener( this);
        container.add( btn3 );
        btn4 = new JButton(" 4 ");
        btn4.addActionListener( this);
        container.add( btn4 );
        btn5 = new JButton(" 5 ");
        btn5.addActionListener( this);
        container.add( btn5 );
        btn6 = new JButton(" 6 ");
        btn6.addActionListener( this);
        container.add( btn6 );
        btn7 = new JButton(" 7 ");
        btn7.addActionListener( this);
        container.add( btn7 );
        btn8 = new JButton(" 8 ");
        btn8.addActionListener( this);
        container.add( btn8 );
        btn9 = new JButton(" 9 ");
        btn9.addActionListener( this);
        container.add( btn9 );
        btn0 = new JButton(" 0 ");
        btn0.addActionListener( this);
        container.add( btn0 );
        btnP = new JButton(" + ");
        btnP.addActionListener( this);
        container.add( btnP );
        
        btnS = new JButton(" - ");
        btnS.addActionListener( this);
        container.add( btnS );
        
        btnM = new JButton(" * ");
        btnM.addActionListener( this);
        container.add( btnM );

        btnD = new JButton(" / ");
        btnD.addActionListener( this);
        container.add( btnD );

        btnMOD = new JButton(" % ");
        btnMOD.addActionListener( this);
        container.add( btnMOD );

        btnE = new JButton(" = ");
        btnE.addActionListener( this);
        container.add( btnE );

        btnc = new JButton(" c ");
        btnc.addActionListener( this);
        container.add( btnc );

        window.setSize( 240,420);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    public void actionPerformed( ActionEvent event )
    {
        
        String str = numberField.getText();
        if (event.getSource() == btn1) {
            str += "1";
            numberField.setText( str );
        }
        else if (event.getSource() == btn2) {
            str += "2";
            numberField.setText( str );
        }
        else if (event.getSource() == btn3) {
            str += "3";
            numberField.setText( str );
        }
        else if (event.getSource() == btn4) {
            str += "4";
            numberField.setText( str );
        }
        else if (event.getSource() == btn5) {
            str += "5";
            numberField.setText( str );
        }
        else if (event.getSource() == btn6) {
            str += "6";
            numberField.setText( str );
        }
        else if (event.getSource() == btn7) {
            str += "7";
            numberField.setText( str );
        }
        else if (event.getSource() == btn8) {
            str += "8";
            numberField.setText( str );
        }
        else if (event.getSource() == btn9) {
            str += "9";
            numberField.setText( str );
        }
        else if (event.getSource() == btn0) {
            str += "0";
            numberField.setText( str );
        }
        else if (event.getSource() == btnc) {
            str = "";
            numberField.setText( str );
        }
        
        else if (event.getSource() == btnP) {
            opertor="+";
            num2 = num1;
            num1 = Double.parseDouble(numberField.getText()) ;
            str = "";
            numberField.setText( str );
            
        }
        else if (event.getSource() == btnS) {
            opertor="-";
            num2 = num1;
            num1 = Double.parseDouble(numberField.getText()) ;
            str = "";
            numberField.setText( str );
            
        }
        else if (event.getSource() == btnM) {
            opertor="*";
            num2 = num1;
            num1 = Double.parseDouble(numberField.getText()) ;
            str = "";
            numberField.setText( str );
            
        }
        else if (event.getSource() == btnD) {
            opertor="/";
            num2 = num1;
            num1 = Double.parseDouble(numberField.getText()) ;
            str = "";
            numberField.setText( str );
            
        }
        else if (event.getSource() == btnMOD) {
            opertor="%";
            num2 = num1;
            num1 = Double.parseDouble(numberField.getText()) ;
            str = "";
            numberField.setText( str );
            
        }
        else if (event.getSource() == btnE) {
            num2 = num1;
            num1 = Double.parseDouble(numberField.getText()) ;
            switch(opertor){
                case "+":   total = num1+num2;
                    break;
                case "-":   total = num2-num1;
                    break;
                case "*":   total = num1*num2;
                    break;
                case "/":   total = num2/num1;
                    break;
                case "%":   total = num2%num1;
                    break;
            }
            
            
            str = Double.toString(total);
            numberField.setText( str );
        }

    } // end method actionPerformed
    public static void main(String[] args) {
        Lab7_3 gui = new Lab7_3();
    }
}