//2nd type - use BufferedReader class for user input
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class UserInput2 {
    public static void main(String[] args) throws IOException
    {
        String name;
        int age;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter name:");
        name=br.readLine();
        System.out.println("enter age:");
        age=Integer.parseInt(br.readLine());
        System.out.println("Your name:"+name+" "+age);
    }
}
