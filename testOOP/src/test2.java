package testOOP.src;
import java.util.Scanner;

public class test2 {
    static String userArray[][];
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Create Username and Password");
        createUser();
        showUser();
        loginTest();
        scan.close();
    }

    public static void createUser(){
        //Scanner scan = new Scanner(System.in);
        int userNum=0;
        
        System.out.print("How many User : ");
        userNum = scan.nextInt();
        userArray = new String[userNum][2];
        
        for(int i = 0 ; i < userArray.length; i++){
            System.out.print("Enter Username for User:["+(i+1)+"] : " );
            userArray[i][0] = scan.next().toString();
            System.out.print("Enter Password for User:["+(i+1)+"] : " );
            userArray[i][1] = scan.next().toString();
        }    
        
    }

    public static void showUser() {
        for(int i = 0 ; i < userArray.length; i++){
            System.out.print("User["+(i+1) +"] : User is " +userArray[i][0]);
            System.out.println(" : Password is " +userArray[i][1]);
        }
    }

    public static void loginTest(){
        String userName,passWord;
        boolean chkUser=false,chkPass=false;
        System.out.println("Login");

        System.out.print("Enter Username : ");
        userName = scan.next().toString();

        System.out.print("Enter Password : ");
        passWord = scan.next().toString();

        for(int j = 0 ; j <userArray.length ; j++){

            //if(userName.equals(userArray[j][0]) && passWord.equals(userArray[j][1])){
            if(userName.equals(userArray[j][0])){
                chkUser = true;
                if(passWord.equals(userArray[j][1])){
                    System.out.println("Login Success");
                }else{
                    System.out.println("Invalid Password");
                }
                break;
            }else{
                chkUser = false;
               
            }
        }
        if(!chkUser){
            System.out.println("Invalid Username");
        }


    }

}
