import java.util.Scanner;

public class exceptino1 {
    public static void main(String[] args) {
        try {
            Scanner obj = new Scanner(System.in);
            int age = obj.nextInt();
            obj.close();
        }

        catch (ArithmeticException e) {
            System.out.println("Enter the is nagative" + e);
        }

    }

}
