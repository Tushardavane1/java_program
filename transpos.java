import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class transpos {
    public static void main(String args[])throws IOException
    {
    BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of row ");
    int n = Integer.parseInt(obj.readLine());
    System.out.println("Enter the number of columns");
    int m =  Integer.parseInt(obj.readLine());
    int or[][] = new int[n][m];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
           or[i][j] = Integer.parseInt(obj.readLine());
        }
    }
    
    int tr[][] = new int[or.length][or.length];

    for(int i=0;i<or.length;i++)
    {
        for(int j=0;j<or[i].length;j++)
        {
            tr[i][j] = or[j][i];
        }
       
    }

 for(int i=0;i<tr.length;i++)
    {
        for(int j=0;j<tr[i].length;j++)
        {
           System.out.print(tr[i][j]+" ");
        }
        System.out.println();
       
    }
    
    

    }
    
}
