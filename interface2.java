interface work {
    void info(int id, double salary, String name);
}

class worker implements work {
    public void info(int id, double salary, String name) {
        System.out.println("The id is " + id);
        System.out.println("The salary is :" + salary);
        System.out.println("The name is :" + name);
    }
}

class employee implements work {
    public void info(int id, double salary, String name) {
        System.out.println("The id is " + id);
        System.out.println("The salary is :" + salary);
        System.out.println("The name is :" + name);

    }
}

public class interface2 {
    public static void main(String args[]) {
        System.out.println("******************************************");
        worker obj = new worker();
        obj.info(111, 12000.6789, "Abhi");
        System.out.println("******************************************");
        employee obj2 = new employee();
        obj2.info(112, 70345.78, "Tushar");
        System.out.println("*********************************************");
    }

}
