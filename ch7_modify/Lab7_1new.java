//package ch7-modify;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab7_1new extends JFrame{
JLabel numberLabel, resultLabel,blankLabel;
JTextField numberField,blankField;
JTextArea resultArea;

public Lab7_1new() {
    // title bar in window
    super("Program display value n");
    // obtain content pane and set its layout to FlowLayout
    Container container = getContentPane();
    container.setLayout( new FlowLayout() );
    // create numberLabel and attach it to content pane
    numberLabel = new JLabel("Enter integer and press Enter : ");
    container.add( numberLabel );
    // create numberField and attach it to content pane
    numberField = new JTextField( 10 );
    container.add( numberField );
    numberField.addActionListener(
        new ActionListener() {
            public void actionPerformed( ActionEvent event )
            {
                int number , blankNum;
                String blank = " ";
                number = Integer.parseInt( numberField.getText());
                blankNum = Integer.parseInt(blankField.getText());
                for(int j=1 ; j<=blankNum ; j++){
                    blank += " ";
                }

                // clear value in TextArea
                resultArea.setText("");
                // add data in textarea
                for (int n = 1 ; n <= number ; n++) {
                    resultArea.append( blank + Integer.toString(n));
                    if (n % 5 == 0) resultArea.append("\n");
                }
                // clear value in numberField
                numberField.setText("");
                blankField.setText("");
            } // end method actionPerformed
        }
    );

    blankLabel = new JLabel("Enter integer of Blank : ");
    container.add( blankLabel );
    // create numberField and attach it to content pane
    blankField = new JTextField( 10 );
    container.add( blankField );
    // register this applet as numberFields ActionListener
    blankField.addActionListener(
        // create inner class
        new ActionListener() {
            public void actionPerformed( ActionEvent event )
            {
                int number , blankNum;
                String blank = " ";
                number = Integer.parseInt( numberField.getText());
                blankNum = Integer.parseInt(blankField.getText());
                for(int j=1 ; j<=blankNum ; j++){
                    blank += " ";
                }

                // clear value in TextArea
                resultArea.setText("");
                // add data in textarea
                for (int n = 1 ; n <= number ; n++) {
                    resultArea.append( blank + Integer.toString(n));
                    if (n % 5 == 0) resultArea.append("\n");
                }
                // clear value in numberField
                numberField.setText("");
                blankField.setText("");
            } // end method actionPerformed
        }
    );
    // create display
    resultArea = new JTextArea( 20,30 );
    resultArea.setEditable( false );
    //container.add( resultArea );
    JScrollPane scrollPane = new JScrollPane(resultArea);
    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    container.add(scrollPane);
}
    public static void main(String[] args) {
        Lab7_1new window = new Lab7_1new();
        window.setSize( 440,440);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
