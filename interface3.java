import java.io.*;

abstract class staff {
    String name, address;
}

class Fullstaff extends staff {
    String department;
    double salary;

    public void accept() throws IOException {
        System.out.println("Enter the name,address,department,salary");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        name = br.readLine();
        address = br.readLine();
        department = br.readLine();
        salary = Double.parseDouble(br.readLine());

    }

    public void display() {
        System.out.println("The name is ::" + name);
        System.out.println("The address is: :" + address);
        System.out.println("The department::" + department);
        System.out.println("The salary is::" + salary);
        System.out.println("********************************");
    }
}

class parttimestaff extends staff {
    int hours, rate;

    public void accept() throws IOException {
        System.out.println("Enter the name,address,no of working hoursand rate per hours ");
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        name = br2.readLine();
        address = br2.readLine();
        hours = Integer.parseInt(br2.readLine());
        rate = Integer.parseInt(br2.readLine());
    }

    public void display() {
        System.out.println("The name is :" + name);
        System.out.println("The address is :" + address);
        System.out.println("THe hours of working is :" + hours);
        System.out.println("The rate is :" + rate);
        System.out.println("**********************************");
    }
}

public class interface3 {
    public static void main(String agrs[]) throws IOException {
        int i;
        System.out.println("Select Any One");
        BufferedReader or = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1.Full Time Staff ");
        System.out.println("2.Part time Staff");
        int ch = Integer.parseInt(or.readLine());
        switch (ch) {
            case 1:
                System.out.println("Enter the number of the full time Staff:");
                int n = Integer.parseInt(or.readLine());
                Fullstaff[] l = new Fullstaff[n];
                for (i = 0; i < n; i++) {
                    l[i] = new Fullstaff();
                    l[i].accept();

                }
                for (i = 0; i < n; i++) {
                    l[i].display();
                }
                break;

            case 2:
                System.out.println("Enter the number of part Time staff");
                int m = Integer.parseInt(or.readLine());
                parttimestaff[] h = new parttimestaff[m];
                for (i = 0; i < m; i++) {
                    h[i] = new parttimestaff();
                    h[i].accept();

                }
                for (i = 0; i < m; i++) {
                    h[i].display();
                }
                break;
        }
    }
}
