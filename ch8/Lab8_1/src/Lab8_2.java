import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab8_2 extends JFrame implements ActionListener{
    JLabel textLabel;
    JTextField textField;
    JButton saveBtn, clearBtn, showBtn;
    Container container;
    Number obj;

    public Lab8_2() {
        container = getContentPane();
        container.setLayout( new FlowLayout() );

        textLabel = new JLabel("Enter number :");
        textLabel.setFont(new Font("Courier New",Font.BOLD,20));
        container.add( textLabel );

        textField = new JTextField( 10 );
        textField.setFont(new Font("Courier New",Font.BOLD,24));
        container.add( textField );

        saveBtn = new JButton(" Save ");
        saveBtn.setFont(new Font("Courier New",Font.BOLD,20));
        saveBtn.addActionListener( this);
        container.add( saveBtn );

        clearBtn = new JButton(" Clear ");
        clearBtn.setFont(new Font("Courier New",Font.BOLD,20));
        clearBtn.addActionListener( this);
        container.add( clearBtn );

        showBtn = new JButton(" Show ");
        showBtn.setFont(new Font("Courier New",Font.BOLD,20));
        showBtn.addActionListener( this);
        container.add( showBtn );

        setSize(340,120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        Lab8_2 test = new Lab8_2();
        test.obj = new Number();
        test.textField.setText(test.obj.toString());
    }
    public void actionPerformed( ActionEvent event )
    {
        if (event.getSource() == saveBtn){
            if(textField.getText() != ""){
                int value = Integer.parseInt(textField.getText());
                obj.setValue(value);
                textField.setText("");
            }
            
        }
        else if (event.getSource() == clearBtn){
            obj.setValue( 0 );
            textField.setText("");
        }
        else if (event.getSource() == showBtn){
            textField.setText(obj.toString());
        }
    }
}
