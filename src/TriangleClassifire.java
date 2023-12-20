//Triangle classifier program
import java.util.Scanner;
public class TriangleClassifire {
    public static void main(String[] args) {
        int side1,side2,side3;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the triangle length of first side ");
        side1=sc.nextInt();
        System.out.println("enter the triangle length of second side ");
        side2=sc.nextInt();
        System.out.println("enter the triangle length of third side");
        side3=sc.nextInt();
        if(side1 == side2 && side2 == side3)
        {
            System.out.println("Equilateral Triangle");
        }
        else if (side1 == side2 || side1 == side3 || side2 == side3)
        {
            System.out.println("Isosceles Triangle");
        }
        else
        {
            System.out.println("Scalable Triangle ");
        }
    }
}
