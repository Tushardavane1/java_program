import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class optional {
 
    public static void main(String[] args) throws IOException{
 
      
        int arr1[] = { 4, 5, 1, 6, 4, 15 };
 
        // 2nd Array
        int arr2[] = { 3, 5, 6, 1, 9, 6 };
 
        // 3rd Array to store the Sum
        int arr3[] = new int[6];
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in ));
        int choice = Integer.parseInt(obj.readLine());
     switch(choice)
     {
        case 1:
        // Adding arr1 and arr2 and storing into arr3
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i] + arr2[i];
        }
 
        // Print the arr3 elements
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

        case 2:
          for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i] * arr2[i];
        }
 
        // Print the arr3 elements
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
    }
 
}