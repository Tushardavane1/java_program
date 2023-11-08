public class secondsmallestnumber {
    public static void main(String[] args) {
        int a[] = { 12, 34, 35, 6, 5, 4, 3, 2 };
        sort(a);
    }

    private static void sort(int[] a) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[j] = a[i];
                    a[j] = temp;
                }
            }
        }
        for (int k = 0; k < 1; k++) {
            System.out.print("     " + a[1]);
        
        }

    }

}
