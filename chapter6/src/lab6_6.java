package chapter6.src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 


public class lab6_6 {
    public static void main(String[] args) {
        JFrame window = new JFrame(" Student Score ");
        JTextArea textArea[] = new JTextArea[3];
        JLabel label[] = new JLabel[3];
        Font newfont = new Font("Tamaho",Font.BOLD,14);
        int data[][] = new int[20][3];
        // create GUI
        Container c = window.getContentPane();
        c.setLayout(new FlowLayout());
        for(int n = 0 ; n < label.length ; n++) {
            if (n == 0)
                label[n] = new JLabel(" Midterm Score ");
            else if (n == 1)
                label[n] = new JLabel(" Final Score ");
            else
                label[n] = new JLabel(" Home Work Score ");
            label[n].setFont(newfont);
            c.add(label[n]);
        } 
        for(int n = 0 ; n < textArea.length ; n++) {
            textArea[n] = new JTextArea(1,10);
            textArea[n].setEditable(false);
            textArea[n].setFont(newfont);
            c.add(textArea[n]);
        }
        window.setSize( 450,240);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        //window.show();
        getData(data);
        displayData(data,textArea);
        System.exit(0); 

    }
    public static void getData(int data[][])
    {
        for(int r = 0 ; r < data.length ; r++) {
            for(int c = 0 ; c < data[r].length ; c++) {
                data[r][c] = rnd(0, 100);
            }
        }
    }

    public static void displayData(int data[][], JTextArea text[])
    {
        boolean done = true;
        String numStr;
        do {
            numStr = JOptionPane.showInputDialog(
            "Enter student number : ");
            if (numStr != null) {
                int num = Integer.parseInt(numStr);

                if (num >= 1 && num <= data.length) {
                    num--;
                    for(int n = 0 ; n < text.length ; n++)
                        text[n].setText( data[num][n] + "");
                }
            else if (num == -1) done = false;
            }
        }while (done);
    }

    public static int rnd(int st, int ed)
    {
        int offset = ed - st +1;
        return (st + (int) (Math.random() * offset));
    } 
    
}
