//Reverse String

import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any string to reverse");
        s=sc.nextLine();
        StringBuilder name=new StringBuilder(s);
        for(int i=0;i<=name.length()/2;i++)
        {
            int front=i;
            int back=name.length()-1-i;
            char frontChar=name.charAt(front);
            char backChar= name.charAt(back);
            name.setCharAt(front,backChar);
            name.setCharAt(back,frontChar);
        }
        System.out.println(name+" "+"reverse string");
    }
}
