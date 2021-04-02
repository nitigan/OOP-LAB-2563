// File Name : Lab11_03.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
 
public class Lab11_03 extends JFrame implements ActionListener {
    Timer swTimer;
    JTextField tField = new JTextField(20);
    JLabel label = new JLabel(" Enter Shape [fillOval , drawOval , fillRect , drawRect, drawString ] :  ");
    Container c = new Container();
    String shape, chk;
    public Lab11_03 () {
        super("Program Using Timer");
        c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(label);
        tField.addActionListener(this);
        c.add(tField);

        swTimer = new Timer(1000, this);
        swTimer.start();
    }
    public void paint(Graphics g) {
        super.paint(g);

        int x = 20 + (int) (Math.random() * 450);
        int y = 20 + (int) (Math.random() * 270);
        int Red = (int) (Math.random() * 256);
        int Green = (int) (Math.random() * 256);
        int Blue = (int) (Math.random() * 256);
        
        g.setColor(new Color(Red, Green, Blue) );

        
        if(shape.equals("fillOval")){
            g.fillOval( x, y,(int) (Math.random() * 256)+ 20,(int) (Math.random() * 256)+ 20); 
            chk = "fillOval";
        }else if(shape.equals("drawOval")){
            g.drawOval( x, y,(int) (Math.random() * 256)+ 20,(int) (Math.random() * 256)+ 20); 
            chk = "drawOval";
        }
        else if(shape.equals("drawRect")){
            g.drawRect( x, y,(int) (Math.random() * 256)+ 20,(int) (Math.random() * 256)+ 20); 
            chk = "drawRect";
        }
        else if(shape.equals("fillRect")){
            g.fillRect( x, y,(int) (Math.random() * 256)+ 20,(int) (Math.random() * 256)+ 20);
            chk = "fillRect"; 
        }else if(shape.equals("drawString")){
            g.drawString( "drawString",x, y); 
            chk = "drawString";
        }else{
            if(chk.equals("fillOval")){
                g.fillOval( x, y,(int) (Math.random() * 256)+ 20,(int) (Math.random() * 256)+ 20); 
                 
            }else if(chk.equals("drawOval")){
                g.drawOval( x, y,(int) (Math.random() * 256)+ 20,(int) (Math.random() * 256)+ 20); 
                 
            }
            else if(chk.equals("drawRect")){
                g.drawRect( x, y,(int) (Math.random() * 256)+ 20,(int) (Math.random() * 256)+ 20); 
                 
            }
            else if(chk.equals("fillRect")){
                g.fillRect( x, y,(int) (Math.random() * 256)+ 20,(int) (Math.random() * 256)+ 20);
                 
            }else if(chk.equals("drawString")){
                g.drawString( "drawString",x, y); 
                 
            }
        }
        
        //g.fillOval( x, y, 20,  20); 
        
    }
    public void actionPerformed(ActionEvent event) {
        
        if(event.getSource() == tField){
            shape = tField.getText();
        }
        else if(event.getSource() == swTimer){
            repaint();
        }
    
        //repaint();
    }
    public static void main(String[] args) {
        Lab11_03 test = new Lab11_03();
        test.setSize(680, 600);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }
}