package chapter6.src;
import javax.swing.JOptionPane; 
public class lab6_4 {
    public static void main(String[] args) {
        int data[][]; 
        int row, col;

        row = Integer.parseInt( JOptionPane.showInputDialog("Enter number row : "));
        col = Integer.parseInt( JOptionPane.showInputDialog("Enter number column : "));
        data = new int [row][col];

        setData(data);
        displayData(data); 

    }

    public static void setData(int data[][])
    {
        for(int i = 0 ; i < data.length ; i++)
            for(int j = 0 ; j < data[i].length ; j++)
                data[i][j] = rnd(10,20);
    }
    public static void displayData(int data[][])
    {
        for(int i = 0 ; i < data.length ; i++)
        {
            for(int j = 0 ; j < data[i].length ; j++)
                System.out.print( data[i][j] + " ");
            System.out.println();
        }
    }

    public static int rnd(int st, int ed)
    {
        int offset = ed - st +1;
        return (st + (int) (Math.random() * offset));
    } 
}
