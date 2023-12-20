
//How to Take Input from Users?
//two types take input from user - we use 1- Scanner class & 2- BufferedReader class
//in this program use Scanner class for user input
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name:");
        name=sc.nextLine();
        System.out.println("enter your age:");
        age=sc.nextInt();
        System.out.println("Hello! your Name :"+name+" "+"Age:"+" "+"and"+age);
    }


}
