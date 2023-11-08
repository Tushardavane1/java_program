import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import mypackage.squre1;
public class calculate_squre {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        squre1 obj = new squre1();
        obj.squre(n);

    }
    
}
