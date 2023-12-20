//Grade Calculator suing if else condition
import java.util.Scanner;
public class GradeCal {
    public static void main(String[] args) {
        int score;
        char grade='A';
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter score between 1 to 100 for the grade");
        score=sc.nextInt();
        if(score>=90 && score<=100)
        {
            grade='A';
        }
        else if(score>=80 && score<=89)
        {
            grade='B';
        }
        else if (score>=70 && score<=79)
        {
            grade='C';
        }
        else if (score>=60 && score<=69)
        {
            grade='D';
        }
        if (score>=0 && score<=59)
        {
            grade='F';
        }
        System.out.println("Your Grade is :"+" "+grade);

    }
}
