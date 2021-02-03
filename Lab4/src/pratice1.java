package Lab4.src;
import java.util.Scanner;

public class pratice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startNum=0,endNum=0,count=0;
        System.out.print("Enter Start Number : ");
        startNum = scan.nextInt();
        System.out.print("Enter End Number : ");
        endNum = scan.nextInt();

        for(int i = startNum ; i<=endNum ; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.print(i+"\t");
                count++;
                if(count%5 == 0){
                    System.out.println();
                }
            }
        }
        scan.close();
    }
    
}
