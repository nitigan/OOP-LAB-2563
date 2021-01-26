// File Name : Lab4_1.java
import java.util.Scanner;
public class Lab4_1 {
    private int score;
    private String grade;

    public Lab4_1(){

    }
    public Lab4_1(int score){
        this.score = score;
    }

    public void setScore(int score){
        this.score = score;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Program Calculate grade.");
        System.out.print("Enter student score : ");

        Lab4_1 obj = new Lab4_1();
        obj.setScore(scan.nextInt());
        obj.calGrade();
    }

    public void calGrade() {
        if ((score >= 0) && (score <= 100)) {

            if (score >= 80) grade = "A";
                else if (score >= 75) grade = "B+";
                else if (score >= 70) grade = "B";
                else if (score >= 65) grade = "C+";
                else if (score >= 60) grade = "C";
                else if (score >= 55) grade = "D+";
                else if (score >= 50) grade = "D";
                else grade = "F";
            System.out.println("Student gradde is " + grade );
        }
        else {
            System.out.println("Invalid student score.");
        }
        System.out.println("End Program.");
    }
    
}