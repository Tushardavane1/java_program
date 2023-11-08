public class perfectandabundant {
    public static void main(String[] args) {
        for(int i=0;i<10000;i++)
        {
            if(i%2 ==0)
            {
                if(i%3 == 0)
                {
                    if(i%4 == 0)
                    {
                        if(i%6 == 0)
                        {
                            System.out.println(i+"    ");
                        }
                    }
                }
            }
            
        }
        
    }
    
}
