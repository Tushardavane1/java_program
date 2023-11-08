 abstract class Bank
 {
   abstract int  get_balance();
 } 
 class A extends Bank
 {
    int banlance;
    A(int banlance)
    {
        this.banlance = banlance;
    }
    public int get_balance()
    {
        return banlance; 
    }
 }

class B extends Bank
{
    int banlance1;
    B(int banlance1)
    {
        this.banlance1 = banlance1;
    }
public int get_balance()
{
    return banlance1;
}
}

class C extends Bank
{
 int banlance3;
 C(int banlance3)
 {
    this.banlance3 = banlance3;
 }
   public int get_balance()
   {
    return banlance3;
   } 
}
class infobank 
{
    public static void main(String[] args) {

   A obj = new A(100);
   System.out.println("Bank A Balance"+obj.get_balance());


    B obj1 = new B(150);
   System.out.println(obj1.get_balance());

    C obj2 = new C(200);
   System.out.println(obj2.get_balance());
}
}