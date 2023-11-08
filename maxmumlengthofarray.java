public class maxmumlengthofarray {
    public static void main(String[] args) {
        int arr[] = { 12, 34, 34, 3, 2, 1, 12345, 21, 12 };
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
               max = arr[i];
            }
        }
        System.out.println(max);
    }

}
