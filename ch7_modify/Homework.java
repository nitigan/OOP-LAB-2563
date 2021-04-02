package ch7_modify;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Homework implements ActionListener {
    JLabel numberLabel;
    JTextField numberField;
    JButton btn1, btn2, btn3,btn4, btn5, btn6,btn7, btn8, btn9,btn0,btnadd,btnsub,btnmul,btndiv,btnsum,btnC;
    JFrame window;
    String num1,num2;
    String operator;
    public Homework() {

        window = new JFrame("Calculator");
        Container container = window.getContentPane();
        container.setLayout(new FlowLayout());
    
        numberLabel = new JLabel("Show Number : ");
        container.add(numberLabel);
        numberField = new JTextField(10);
        numberField.setEditable( false );
        numberField.setText("0");
        container.add( numberField );

        btn1 = new JButton(" 1 ");
        btn1.addActionListener(this);
        container.add(btn1);
        btn2 = new JButton(" 2 ");
        btn2.addActionListener(this);
        container.add(btn2);
        btn3 = new JButton(" 3 ");
        btn3.addActionListener(this);
        container.add(btn3);
        btn4 = new JButton(" 4 ");
        btn4.addActionListener(this);
        container.add(btn4);
        btn5 = new JButton(" 5 ");
        btn5.addActionListener(this);
        container.add(btn5);
        btn6 = new JButton(" 6 ");
        btn6.addActionListener(this);
        container.add(btn6);
        btn7 = new JButton(" 7 ");
        btn7.addActionListener(this);
        container.add(btn7);
        btn8 = new JButton(" 8 ");
        btn8.addActionListener(this);
        container.add(btn8);
        btn9 = new JButton(" 9 ");
        btn9.addActionListener(this);
        container.add(btn9);
        btn0 = new JButton(" 0 ");
        btn0.addActionListener(this);
        container.add(btn0);
        btnC = new JButton(" C ");
        btnC.addActionListener(this);
        container.add(btnC);
        btnadd = new JButton(" + ");
        btnadd.addActionListener(this);
        container.add(btnadd);
        btnsub = new JButton(" - ");
        btnsub.addActionListener(this);
        container.add(btnsub);
        btnmul = new JButton(" * ");
        btnmul.addActionListener(this);
        container.add(btnmul);
        btndiv = new JButton(" / ");
        btndiv.addActionListener(this);
        container.add(btndiv);
        btnsum = new JButton(" = ");
        btnsum.addActionListener( this);
        container.add( btnsum );
        window.setSize(200,280);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    public void actionPerformed(ActionEvent event)
    {
        String str = numberField.getText();

        if (event.getSource() == btn1) {
            if(str.equals("0")){
                str = "1";
            }else{
                str += "1";
            }
            numberField.setText( str );
        }
        else if (event.getSource() == btn2) {
            if(str.equals("0")){
                str = "2"; 
            }else{
               str += "2"; 
            }
            numberField.setText( str );
        }
        else if (event.getSource() == btn3) {
            if(str.equals("0")){
                str = "3"; 
            }else{
               str += "3"; 
            }
            numberField.setText( str );
        }
        else if (event.getSource() == btn4) {
            if(str.equals("0")){
                str = "4"; 
            }else{
               str += "4"; 
            }
            numberField.setText( str );
        }
        else if (event.getSource() == btn5) {
            if(str.equals("0")){
                str = "5"; 
            }else{
               str += "5"; 
            }
            numberField.setText( str );
        }
        else if (event.getSource() == btn6) {
            if(str.equals("0")){
                str = "6"; 
            }else{
               str += "6"; 
            }
            numberField.setText( str );
        }
        else if (event.getSource() == btn7) {
            if(str.equals("0")){
                str = "7"; 
            }else{
               str += "7"; 
            }
            numberField.setText( str );
        }
        else if (event.getSource() == btn8) {
            if(str.equals("0")){
                str = "8"; 
            }else{
               str += "8"; 
            }
            numberField.setText( str );
        }
        else if (event.getSource() == btn9) {
            if(str.equals("0")){
                str = "9"; 
            }else{
               str += "9"; 
            }
            numberField.setText( str );
        }
        else if (event.getSource() == btn0) {
            if(str.equals("0")){
                str = "0"; 
            }else{
               str += "0"; 
            }
            numberField.setText( str );
        }
        else if (event.getSource() == btnC) {
            numberField.setText("0");
            operator = "";
        }
        else if(event.getSource() == btnadd) {
            num1 = numberField.getText();
            operator = "+";
            numberField.setText("");
        }
        else if (event.getSource() == btnsub) {
            num1 = numberField.getText();
            operator = "-";
            numberField.setText("");
        }
        else if (event.getSource() == btnmul) {
            num1 = numberField.getText();
            operator = "*";
            numberField.setText("");
        }
        else if (event.getSource() == btndiv) {
            num1 = numberField.getText();
            operator = "/";
            numberField.setText("");
        }
        else if (event.getSource() == btnsum) {
            double result;
            if(operator.equals("+")) result = Double.parseDouble(num1) + Double.parseDouble(str);
            else if(operator.equals("-")) result = Double.parseDouble(num1) - Double.parseDouble(str);
            else if(operator.equals("*")) result = Double.parseDouble(num1) * Double.parseDouble(str);
            else result = Double.parseDouble(num1) / Double.parseDouble(str);
            numberField.setText(Double.toString(result));

    }
    }        
    public static void main(String[] args) {
        Homework gui = new Homework();
    }
}
