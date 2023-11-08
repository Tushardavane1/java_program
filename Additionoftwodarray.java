import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Additionoftwodarray {
    public static void main(String args[]) throws IOException {
        int add[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int minus[][] = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

        int c[][] = new int[3][3];
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int choice = Integer.parseInt(obj.readLine());
        switch (choice) {

            case 1:
                for (int i = 0; i < add.length; i++) {
                    for (int j = 0; j < minus.length; j++) {
                        c[i][j] = add[i][j] + minus[i][j];
                    }
                }
                for (int k = 0; k < c.length; k++) {
                    for (int i = 0; i < c[k].length; i++) {
                        System.out.print(c[k][i] + " ");
                    }
                }
                break;


            case 2:
                for (int i = 0; i < add.length; i++) {
                    for (int j = 0; j < minus.length; j++) {
                        c[i][j] = add[i][j] * minus[i][j];
                    }
                }
                for (int k = 0; k < c.length; k++) {
                    for (int i = 0; i < c[k].length; i++) {
                        System.out.print(c[k][i] + " ");
                    }
                }
                break;
                default:
                System.out.println("Wrong Input");
                
        }

    }

}
