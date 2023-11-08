import mypackage.algo;
import java.util.Scanner;
public class sortusingpac {
public static void main(String[] args) {
    Scanner obj= new Scanner(System.in);
    int a[] = new int[10];
    for(int i=0;i<10;i++)
     {
        a[i] = obj.nextInt();
     }
    algo b = new algo();
    b.sort(a);

    obj.close();
}    
}
