import java.io.*;
import mypackage.*;
public class Second {
    public static void main(String args[]) throws IOException
    {
    
             BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter the user name");
             String user_name1 = obj.readLine();
             System.out.println("Enter the password");
             String password1 = obj.readLine();
             Package1 obj2 = new Package1();
             obj2.user(user_name1,password1);

    }
    }
    

