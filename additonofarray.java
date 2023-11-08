public class additonofarray {
    public static void main(String args[])
    {
        int []a = {1,2,34,5,6};
        int []b = {5,6,7,8,7};
        int []c = new int[a.length];

        for(int i=0;i<a.length;i++)
        {
            c[i] = a[i] + b[i];
        }
        for(int j=0;j<c.length;j++)
        {
            System.out.print(c[j]+" ");
        }
    }
    
}
