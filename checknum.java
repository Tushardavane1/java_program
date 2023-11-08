import java.util.Scanner;

class MyNumber {
    private int data;

    MyNumber() {
        data = 0;
    }

    MyNumber(int data) {
        this.data = data;
    }

    int isnegative(int num) {
        if (num < 0) {
            System.out.println("Number is Negative");
        }
        return 0;
    }

    int ispositive(int num) {
        if (num > 0) {
            System.out.println("Number is the positive");
        }
        return 0;
    }

    int isZero(int num) {
        if (num == 0) {
            System.out.println("Number is Zero");
        }
        return 0;
    }

    int isEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Number is Even:");
        }
        return 0;
    }

    int isodd(int num) {
        if (num % 2 != 0) {
            System.out.println("Number is odd");
        }
        return 0;
    }
}

class checknum {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number ::::");
        int num = s.nextInt();
       // MyNumber obj1 = new MyNumber();
        MyNumber obj = new MyNumber(num);
        obj.isnegative(num);
        obj.ispositive(num);
        obj.isZero(num);
        obj.isEven(num);
        obj.isodd(num);
        s.close();
    }
}
