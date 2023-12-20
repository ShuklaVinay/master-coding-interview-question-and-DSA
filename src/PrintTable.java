//print table
import java.util.Scanner;
public class PrintTable {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.printf("enter the number for print table");
        n=sc.nextInt();
        for (int i=1;i<=10;i++)
        {
            System.out.println( i +"x"+n+"="+n*i);
        }
    }
}
