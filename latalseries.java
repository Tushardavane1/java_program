public class latalseries
{
    public static void main(String[] args) {
        int n1 ;
        int n2= 1;
        int n3 = 2;
        int num=12;
        System.out.println(n3);
        for(int i=0;i<num;i++)
        {
          System.out.println(n2);
          n1=n2;
          n2 = n3;
          n3 = n1 + n2;   
        }
    }
}