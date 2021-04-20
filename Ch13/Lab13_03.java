//package Ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab13_03 extends JFrame implements ActionListener {
    private Clock time;
    private JButton playBtn, stopBtn,setTimeBtn;
    private JTextField tHour, tMin , tSec;
    private JLabel lHour,lMin,lSec;
    private int hour,min,sec;

    public Lab13_03() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JPanel panel=new JPanel();
        panel.setBounds(300,50,100,20);   
        panel.setBackground(Color.gray);
        panel.setLayout(new FlowLayout());

        playBtn = new JButton("Start Time");
        playBtn.addActionListener(this);
        stopBtn = new JButton("Stop Time");
        stopBtn.addActionListener(this);
        setTimeBtn = new JButton("Set Time");
        setTimeBtn.addActionListener(this);
        time = new Clock();
        
       // panel.add(playBtn);
       // panel.add(stopBtn);
       // panel.add(setTimeBtn);
        
        lHour = new JLabel(" Hour ");
        lMin = new JLabel(" Min ");
        lSec = new JLabel(" Sec ");
         
        tHour = new JTextField(2);
        tMin = new JTextField(2);
        tSec = new JTextField(2);
        panel.add(lHour);
        panel.add(tHour);

        panel.add(lMin);
        panel.add(tMin);
        panel.add(lSec);
        panel.add(tSec);

        //panel.add(time);
        c.add(playBtn);
        c.add(stopBtn);
        c.add(setTimeBtn);
        c.add(panel);
        c.add(time);
        
    }
    public void paint(Graphics g) {
        super.paint(g);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == playBtn) {
            time.start();
            playBtn.setEnabled(false);
            setTimeBtn.setEnabled(false);
        }
        else if (e.getSource() == stopBtn) {
            time.stop();
            playBtn.setEnabled(true);
            setTimeBtn.setEnabled(true);
        }
        else if (e.getSource() == setTimeBtn) {
            hour= Integer.parseInt(tHour.getText());
            min = Integer.parseInt(tMin.getText());
            sec = Integer.parseInt(tSec.getText());
            time.setTime(hour,min,sec);
            playBtn.setEnabled(true);
        }
    }
    public static void main(String[] args) {
        Lab13_03 window = new Lab13_03();
        window.setSize(350,420);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}