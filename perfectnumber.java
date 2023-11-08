public class perfectnumber {
    public static void main(String[] args) {
        int n=6;
        int sum=0;
        for(int i=1;i<n;i++)
        {
           if(n%i == 0)
           {
            sum+=i;
           }
        }
        if(sum == n)
        {
            System.out.println("This is the perfect number");
        }
        else{
            System.out.println("This is not perfect number");
        }
    }
    
}
