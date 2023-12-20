//prime number generator
import java.util.Scanner;
public class PrimeNumGenerator {
    public static void main(String[] args) {
        int n;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit for prime no. generate");
        n=sc.nextInt();
        for (int i=2;i<=n;i++)
        {
           // System.out.println(i+"i");
            boolean isPrime=true;

            for(int j=2;j<=i/2;j++)
            {
                //System.out.println(j+"j");
                if (i % j == 0)
                {
                    isPrime=false;
                    break;
                }

            }
            if(isPrime)
            {
                System.out.println(i);
            }
        }

    }
}
