class emp {
    int id;
    String name;
    String deptname;
    double salary;
    
    int count_object() {
        System.out.println("Object created::"+objectCount);
        return 0;
    }

    emp() {
        id = 101;
        name = "";
        deptname = "";
        salary = 34000;
    }

    emp(int id, String name, String deptname, double salary) {
        this.id = id;
        this.name = name;
        this.deptname = deptname;
        this.salary = salary;
        objectCount+=1;
    }
    private static int objectCount = 0;


    public static int getObjectCount() {
        return objectCount;
    }
}

class Emmployee {
    public static void main(String args[]) {
        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter the employee id:");
        // int id = s.nextInt();
        // s.nextLine();
        // System.out.println("Enter the employee name:");
        // String name = s.nextLine();
        // System.out.println("Enter the employee Department:");
        // String deptname = s.nextLine();
        // System.out.println("Enter the employee salary:");
        // double salary = s.nextDouble();

        emp obj = new emp(234,"tushar","computer",1235.3);
        emp obj1 = new emp(123,"Abhi","Computer",12323);
        System.out.println("Object "+emp.getObjectCount());
    }
}