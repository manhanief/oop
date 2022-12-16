import java.util.Scanner;


public class Login {
    public static void main (String[] args)
    {
        String name,password;
        
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Enter Name:");
        name = myObj.nextLine();

        System.out.print("Enter Password:");
        password = myObj.nextLine();
        
        User user = new User(name,password);
        
        user.Admin();
        
        myObj.close();
    }
}
