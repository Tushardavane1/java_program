import java.util.Scanner;

public class twodarray {
    public static void main(String Args[]){
        int or[][] = new int[3][3];
        int tr[][] = new int [3][3];
    Scanner obj = new Scanner(System.in);
    for(int i=0;i<or.length;i++)
    {
        for(int j=0;j<or[i].length;j++)
        {
           or[i][i] = obj.nextInt();
        }
    }
    for(int i=0;i<or.length;i++)
    {
        for(int j=0;j<or[i].length;j++)
        {
            tr[i][j] = or[j][i];

        }
    }

    for(int i=0;i<tr.length;i++)
    {
        for(int j=0;j<tr[i].length;j++){

        }
    }
    obj.close();
    }
    
}
