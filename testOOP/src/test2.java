package testOOP.src;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class test2 {
    static String userArray[][],output="";
    static Scanner scan = new Scanner(System.in);
    static boolean chkUser=false,chkPass=false;
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to KMUTNB", "KLOGIC", JOptionPane.INFORMATION_MESSAGE);
        //System.out.println("Create Username and Password");
        createUser();
        showUser();
        do{
            loginTest();
        }while(!chkUser || !chkPass);
        scan.close();
    }

    public static void createUser(){
        //Scanner scan = new Scanner(System.in);
        int userNum=0;
        String userNumString;
        
        //System.out.print("How many User : ");
        //userNum = scan.nextInt();
        userNumString = JOptionPane.showInputDialog(null,"How many User :","Create User",JOptionPane.QUESTION_MESSAGE);
        userNum = Integer.parseInt(userNumString);
        userArray = new String[userNum][2];
        
        for(int i = 0 ; i < userArray.length; i++){
            /*System.out.print("Enter Username for User:["+(i+1)+"] : " );
            userArray[i][0] = scan.next().toString();
            System.out.print("Enter Password for User:["+(i+1)+"] : " );
            userArray[i][1] = scan.next().toString();
            */
            userArray[i][0] = JOptionPane.showInputDialog("Enter USERNAME for User:["+(i+1)+"] : ");
            userArray[i][1] = JOptionPane.showInputDialog("Enter PASSWORD for User:["+(i+1)+"] : ");
        }    
    }

    public static void showUser() {
        for(int i = 0 ; i < userArray.length; i++){
           output += "User["+(i+1) +"] : User is " +userArray[i][0];
           output += " : Password is " +userArray[i][1]+"\n";
        }
        JOptionPane.showMessageDialog(null, output, "Show Username and Password", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void loginTest(){
        String userName,passWord;
        
        //System.out.println("Login");

        //System.out.print("Enter Username : ");

        userName = JOptionPane.showInputDialog(null,"Username:","Login",JOptionPane.QUESTION_MESSAGE);
        passWord = JOptionPane.showInputDialog(null,"Password:","Login",JOptionPane.QUESTION_MESSAGE);
        //System.out.print("Enter Password : ");
        //passWord = scan.next().toString();

        
        for(int j = 0 ; j <userArray.length ; j++){
            if(userName.equals(userArray[j][0])){
                chkUser = true;
                if(passWord.equals(userArray[j][1])){
                    //System.out.println("Login Success");
                    chkPass = true; 
                    JOptionPane.showMessageDialog(null, "Login Success\n Hello "+userName, "Welcome to KLOGIC", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Password", "You are can't login", JOptionPane.ERROR_MESSAGE);
                    //System.out.println("Invalid Password");
                }
                break;
            }else{
                chkUser = false;               
            }
        }
        if(!chkUser){
            //System.out.println("Invalid Username");
            JOptionPane.showMessageDialog(null, "Invalid Username", "You are can't login", JOptionPane.ERROR_MESSAGE);
        }
    }
}
