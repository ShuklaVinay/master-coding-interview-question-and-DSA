//prime number checker
import java.util.Scanner;
public class PrimeNumChecker {
    public static void main(String[] args) {
        int n,counter=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no for prime checker");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i ==0)
            {
                counter++;
            }
        }
        if(counter==2)
        {
            System.out.println(n +" "+"is a prime no.");
        }
        else {
            System.out.println(n+ " "+"is not a prime no.");
        }
    }

}
