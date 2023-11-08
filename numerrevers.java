public class numerrevers {
 public static void main(String[] args) {
    int num= 1233333567;
    int rever=0,rema;
    while(num>0)
    {
        rema=num%10;
        rever=rever*10+rema;
        num=num/10;
    }
    System.out.println(rever);
    }
 }   

