package ch12;

// File Name : Lab12_03.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Lab12_03 extends JFrame implements ActionListener,MouseListener {
    int x1, y1, x2,y2 ,x,y;
    JButton btnLine, btnRect, btnCircle, btnClear;
    JTextField text1, text2;
    Color oldColor1, oldColor2;
    char typeShape = 'L';
    int color;
    public Lab12_03() {
        super("");
        Container c = getContentPane();
        c.setLayout( new FlowLayout() );
        c.add(new JLabel("                          "));
        c.add(new JLabel("                          "));
        c.add(new JLabel("                          "));
        c.add(new JLabel("                          "));
        c.add(new JLabel("                          "));
        c.add(new JLabel("                          "));
        c.add(new JLabel("                          "));
        c.add(new JLabel("                          "));
        c.add(new JLabel("                          "));
        c.add(new JLabel("                          "));
        c.add(new JLabel("                          "));
        c.add(new JLabel("                          "));
        c.add(new JLabel("                          "));
        c.add(new JLabel("                          "));
        c.add(new JLabel("                          "));
        c.add(new JLabel("                          "));
        
        
        

        btnLine = new JButton("Line");
        btnLine.addActionListener( this );
        //c.add(btnLine);
        btnRect = new JButton("Rectangle");
        btnRect.addActionListener( this );
        //c.add(btnRect);
        btnCircle = new JButton("Circle");
        btnCircle.addActionListener( this );
       // c.add(btnCircle);
        btnClear = new JButton("Clear");
        btnClear.addActionListener( this );
        //c.add(btnClear);
        text1 = new JTextField(12);
        text1.setEditable( false );
        c.add( text1 );
        text2 = new JTextField(12);
        text2.setEditable( false );
        c.add( text2 );
        addMouseListener(this);
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.YELLOW);
        g.fillRect(30,60,50,20);
        g.setColor(Color.RED);
        g.drawRect(30,60,50,20);
        g.drawString("LINE", 42, 75);

        g.setColor(Color.YELLOW);
        g.fillRect(90,60,50,20);
        g.setColor(Color.RED);
        g.drawRect(90,60,50,20);
        g.drawString("RECT", 102, 75);

        g.setColor(Color.YELLOW);
        g.fillRect(150,60,70,20);
        g.setColor(Color.RED);
        g.drawRect(150,60,70,20);
        g.drawString("CIRCLE", 162, 75);

        g.setColor(Color.YELLOW);
        g.fillRect(230,60,50,20);
        g.setColor(Color.RED);
        g.drawRect(230,60,50,20);
        g.drawString("CLEAR", 232, 75);

        g.setColor(Color.BLACK);
        g.fillRect(20,90,20,20);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(20,90,20,20);

        g.setColor(Color.BLUE);
        g.fillRect(45,90,20,20);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(45,90,20,20);

        g.setColor(Color.CYAN);
        g.fillRect(70,90,20,20);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(70,90,20,20);

        g.setColor(Color.DARK_GRAY);
        g.fillRect(95,90,20,20);
        g.setColor(Color.BLACK);
        g.drawRect(95,90,20,20);

        g.setColor(Color.GRAY);
        g.fillRect(120,90,20,20);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(120,90,20,20);

        g.setColor(Color.GREEN);
        g.fillRect(145,90,20,20);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(145,90,20,20);

        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(170,90,20,20);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(170,90,20,20);

        g.setColor(Color.MAGENTA);
        g.fillRect(195,90,20,20);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(195,90,20,20);

        g.setColor(Color.ORANGE);
        g.fillRect(220,90,20,20);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(220,90,20,20);

        g.setColor(Color.PINK);
        g.fillRect(245,90,20,20);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(245,90,20,20);

        g.setColor(Color.RED);
        g.fillRect(270,90,20,20);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(270,90,20,20);

        g.setColor(Color.WHITE);
        g.fillRect(295,90,20,20);
        g.setColor(Color.DARK_GRAY);
        g.drawRect(295,90,20,20);

        switch(color){
            case 1 : g.setColor(Color.BLACK);
                break;
            case 2 : g.setColor(Color.BLUE);
                break;
            case 3 : g.setColor(Color.CYAN);
                break;
            case 4 : g.setColor(Color.DARK_GRAY);
                break;
            case 5 : g.setColor(Color.GRAY);
                break;
            case 6 : g.setColor(Color.GREEN);
                break;
            case 7 : g.setColor(Color.LIGHT_GRAY);
                break;
            case 8 : g.setColor(Color.MAGENTA);
                break;
            case 9 : g.setColor(Color.ORANGE);
                break;
            case 10 : g.setColor(Color.PINK);
                break;
            case 11 : g.setColor(Color.RED);
                break;
            case 12 : g.setColor(Color.WHITE);
                break;
        }

        switch (typeShape) {
            case 'L' :
                g.drawLine(x1, y1, x2, y2);
                break;
            case 'R' :
                g.drawRect(x1, y1, x2-x1, y2-y1);
                break;
            case 'C' :
                g.drawOval(x1, y1, x2-x1, y2-y1);
                break;
        }
    }
    public void mousePressed(MouseEvent event) {

        if (event.getButton() == 1) { // Mouse Left
            x = event.getX();
            y = event.getY();
            boolean isLine = isInside(20,60,50,20,x, y) ;
            boolean isRect = isInside(80,60,50,20,x, y) ;
            boolean isCircle = isInside(140,60,70,20,x, y) ;
            boolean isClear = isInside(220,60,50,20,x, y) ;
            boolean isBLACK = isInside(20,90,20,20,x, y) ;
            boolean isBLUE = isInside(45,90,20,20,x, y) ;
            boolean isCYAN = isInside(70,90,20,20,x, y) ;
            boolean isDARKGRAY = isInside(95,90,20,20,x, y) ;
            boolean isGRAY = isInside(120,90,20,20,x, y) ;
            boolean isGREEN = isInside(145,90,20,20,x, y) ;
            boolean isLIGHTGRAY = isInside(170,90,20,20,x, y) ;
            boolean isMAGENTA = isInside(195,90,20,20,x, y) ;
            boolean isORANGE = isInside(220,90,20,20,x, y) ;
            boolean isPINK = isInside(245,90,20,20,x, y) ;
            boolean isRED = isInside(270,90,20,20,x, y) ;
            boolean isWHITE = isInside(295,90,20,20,x, y) ;



            if(isLine){
               typeShape = 'L';
            }
            if(isRect){
                typeShape = 'R';
            }
            if(isCircle){
                typeShape = 'C';
            }
            if(isClear){
                x1 = y1 = x2 = y2 = 0;
                text1.setText("");
                text2.setText(""); 
            }
            if(isBLACK){
                color=1;
            }
            if(isBLUE){
                color=2;
            }
            if(isCYAN){
                color=3;
            }
            if(isDARKGRAY){
                color=4;
            }
            if(isGRAY){
                color=5;
            }
            if(isGREEN){
                color=6;
            }
            if(isLIGHTGRAY){
                color=7;
            }
            if(isMAGENTA){
                color=8;
            }
            if(isORANGE){
                color=9;
            }
            if(isPINK){
                color=10;
            }
            if(isRED){
                color=11;
            }
            if(isWHITE){
                color=12;
            }
            

            //text1.setText("(X1 = "+x1+",Y1 = "+y1+")" );
        }
        else if (event.getButton() == 2) { // Mouse Left
            x1 = event.getX();
            y1 = event.getY();
            text1.setText("(X1 = "+x1+",Y1 = "+y1+")" );
        }
        else if (event.getButton() == 3) { // Mouse Right
            x2 = event.getX();
            y2 = event.getY();
            text2.setText(" (X2 = "+x2+",Y2 = "+y2+")" );
        }
    }
    public void mouseReleased(MouseEvent event) { }
    public void mouseClicked(MouseEvent event) {
        repaint();
    }
    public void mouseEntered( MouseEvent event ) {
        repaint();
    }
    public void mouseExited(MouseEvent event) {
        repaint();
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLine) typeShape = 'L';
        else if (e.getSource() == btnRect) typeShape = 'R';
        else if (e.getSource() == btnCircle) typeShape = 'C';
        else if (e.getSource() == btnClear) {
            x1 = y1 = x2 = y2 = 0;
            text1.setText("");
            text2.setText("");
        }
        repaint();
    }
    public static void main(String[] args) {
        Lab12_03 window = new Lab12_03();
        window.setSize(360, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    boolean isInside(int x1,int y1,int width, int height,int posx,int posy) {
        int x2 = x1 + width;
        int y2 = y1 + height;
        if (posx >= x1 && posx <= x2)
        if (posy >= y1 && posy <= y2) return true;
        return false;
    }

}