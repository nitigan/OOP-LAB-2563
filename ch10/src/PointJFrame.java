// File Name : PointJFrame.java
import javax.swing.*;
import java.awt.*;
public class PointJFrame extends javax.swing.JFrame {
    int size;
    Point p[] ;
    JTextField shObject;
    Container container;
    public PointJFrame()
    {
        super("Program Inheritance Point");

        container = getContentPane();
        container.setLayout(new FlowLayout());
        shObject = new JTextField(20);
        shObject.setEditable(false);
        container.add(shObject);

        String input; // user's input
        // obtain user's choice
        input = JOptionPane.showInputDialog("Enter number of point : " );
        size = Integer.parseInt( input ); // convert input to int
        p = new Point[size];
        for(int n = 0 ; n < p.length ; n++) {
            int x = 5 + (int) (Math.random() * 640);
            int y = 5 + (int) (Math.random() * 480);
            p[n] = new Point(x, y);
        }
    } // end method init
    // draw shapes on applet's background
    public void paint( Graphics g )
    {
        super.paint( g ); //call paint method inherited
        int red ,green ,blue;
        for ( int n = 0; n < p.length; n++ ) {
        // set color
            red=(int)(Math.random()*256);
            green=(int)(Math.random()*256);
            blue=(int)(Math.random()*256);
            g.setColor(new Color(red,green,blue));
            // plot point
            g.drawLine( p[n].getX(), p[n].getY(), p[n].getX(), p[n].getY() );
        } // end for
        //showStatus("จำนวน Object : "+ Point.getCount());
    } // end method paint
    public static void main(String[] args) {
        PointJFrame test = new PointJFrame();

        test.shObject.setText("Num of Point : "+ Point.getCount());

        test.setSize(640, 480);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }
}