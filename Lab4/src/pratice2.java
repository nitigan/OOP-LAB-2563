package Lab4.src;
import java.util.Scanner;

public class pratice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long number;
        int checkNum,odd=0,even=0,zero=0;
        System.out.print("Enter positive Number : ");
        number = scan.nextLong();
     
        while(number>0){
            checkNum = (int)(number%10);
            if(checkNum%2 == 0 && checkNum > 0){
                    even++;
            }else if(checkNum%2 != 0 && checkNum>0){
                    odd++;
            }else{
                zero++;
            }
            number = number/10;
        }

        System.out.println("Odd digit = "+odd);
        System.out.println("Even digit = "+even);
        System.out.println("Zero digit = "+zero);
        scan.close();
    }
}
