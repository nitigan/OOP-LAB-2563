package Lab4.src;
import java.util.Scanner;

public class pratice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number=0 ;
        System.out.print("Enter positive Number : ");
        number = scan.nextInt();
        
        int k = 2;                  // ลองหารด้วย k = 2, 3, ..., n-1
        while (true) {
            if (k >= number) break;        // หลุดจากวงวนเมื่อลองหารครบทุกตัวแล้ว 
            if ((number % k) == 0) break;  // หลุดจากวงวนเมื่อพบ k ที่หาร n ลงตัว 
                k++;
        }
        if(k == number){    // ถ้า k เท่ากับ n แสดงว่า n เป็นจำนวนเฉพาะ 
            System.out.println("Number "+ number +" is Prime number "); 
        }else{
            System.out.println("Number "+ number +" is Not Prime number "); 
        }
        

        scan.close();
    }
}