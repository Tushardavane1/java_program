import java.util.Arrays;
public class reversethenumber {
public static void main(String[] args) {
    int num=12233;
    int reverse=0 , remainder;
    while(num>0)
    {
        remainder=num%10;
        reverse= reverse*10+remainder;
        num=num/10;
    }
    if(reverse == num)
    {
        System.out.println("NUMBER IS THE PALIDRAME");

    }
    else{
        System.out.println("Number is not palidram");
    }
    }
}    

