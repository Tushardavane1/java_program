class employee {

    public int work( int w) {
        System.out.println("Work is employee"+w);

        return 0;
    }
   public int getsalary(int sal){
    System.out.println(sal);
    return 0;
   }
}

class hrmanager extends employee
{
    @Override
    public int work(int w){
       System.out.println("Work is done"+w);
       return 0;
    }

    public int addemployee(){
        System.out.println("New employee is added");
        return 0;
    }
}
public class employeequestions {
    public static void main(String[] args) {
        hrmanager obj = new hrmanager();
        obj.work(2);
        obj.getsalary(1234);
        obj.addemployee();
    }
}
