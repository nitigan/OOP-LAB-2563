import java.util.Scanner;
public class Restuarant {
    public static void main(String[] args) {
        int customer  ;
        Double amountFood , discount=0.0 , price ,result;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num of Customer : ");
        customer = scan.nextInt();

        System.out.print("Enter Money of Food : ");
        amountFood = scan.nextDouble();

        if(customer <= 2){
            discount = 0.0 ;
        }else if(customer >=3 && customer <=5){
            discount = 0.05 ; // 5%
        }else if(customer >=6 && customer <=10){
            discount = 0.12 ; // 12%
        }else if(customer >=11 && customer <=14){
            discount = 0.13 ; // 13%
        } 
        
        price = amountFood - (amountFood * discount); // discount
        result = price + (price * 0.07); // vat

        System.out.println("Your amount Food price = " + amountFood );  // before discount
        System.out.println("Your discount = " + (amountFood * discount));
        System.out.println("Your price Before Vat= " + price);
        System.out.println("Your pay price + vat = " + result); // Net price + Vat
        
    }
}
