// File Name : RectangleJFrame.java
import javax.swing.*;
import java.awt.*;
public class RectangleJFrame extends javax.swing.JFrame {
    int x, y ,w ,h;
    Rectangle r[] ;
    public RectangleJFrame(int num)
    {
        super("Program Inheritance Rectangle");
        String input; // user's input
        r = new Rectangle[num];
        for(int i=0 ; i<r.length ; i++){
            // obtain user's choice
            input = JOptionPane.showInputDialog("Enter value x of left point : " );
            x = Integer.parseInt( input ); // convert input to int
            input = JOptionPane.showInputDialog("Enter value y of left point : " );
            y = Integer.parseInt( input ); // convert input to int
            //int w = 10 + (int) (Math.random() * 280);
            //int h = 10 + (int) (Math.random() * 180);
            input = JOptionPane.showInputDialog("Enter width : " );
            w = Integer.parseInt( input ); 
            input = JOptionPane.showInputDialog("Enter height : " );
            h = Integer.parseInt( input ); 
            r[i] = new Rectangle(x, y, w, h);  
        }
    } // end method init
    public void paint( Graphics g )
    {
        super.paint( g ); //call paint method inherited
        // set color
        for(int i=0 ; i<r.length ; i++){
            g.setColor( Color.ORANGE );
            g.drawRect(r[i].getX(),r[i].getY(),r[i].getWidth(), r[i].getHeight());
            g.setColor( Color.BLUE );
            g.drawString( "Point Left : " + r[i].getX() + ", " + r[i].getY(),r[i].getX(), r[i].getY());
            g.drawString( "Width : " + r[i].getWidth() , r[i].getX(),r[i].getY() + 15);
            g.drawString( "Height : " + r[i].getHeight() , r[i].getX(),r[i].getY() + 30);
            g.drawString("Area : "+r[i].getArea(),r[i].getX(),r[i].getY()+45);
        }
        
    } // end method paint
    public static void main(String[] args) {
        int NumOfRec;
        NumOfRec = Integer.parseInt(JOptionPane.showInputDialog("Enter Num of Rec : " ));
        RectangleJFrame test = new RectangleJFrame(NumOfRec);
        test.setSize(640, 480);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }
}