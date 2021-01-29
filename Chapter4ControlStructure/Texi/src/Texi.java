import java.util.Scanner;

public class Texi{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double distance , Hours , MoneyOfDis = 0.0 , Pay;
        System.out.print("Enter Distance(km) : ");
        distance = scan.nextDouble();
        System.out.print("Enter Hours : ");
        Hours = scan.nextDouble();
        if(distance >= 0 && distance<= 1){
            MoneyOfDis = 35.0;
        }
        else if(distance>1.0 && distance <=12.00){
            MoneyOfDis = 35.0 + ((distance-1)*5);
        }
        else if(distance>12.0 && distance <=20.00){
            MoneyOfDis = 35.0 + (11*5) + ((distance-12)*5.5);
        }
        else if(distance>20.0 && distance <=40.00){
            MoneyOfDis = 35.0 + (11*5) + ((8)*5.5) + ((distance-20)*6);
        }

        Pay = MoneyOfDis+(Math.round(Hours)*2);

        System.out.println("Your Pay = " + Pay);


    }
}