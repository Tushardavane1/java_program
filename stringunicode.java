import java.lang.String;;

public class stringunicode {
    public static void main(String[] args) {
        String str = "Tushra";
        int str1 = str.codePointAt(2);
        System.out.println(str1);
        int str2 = str.codePointCount(1, 5);
        System.out.println(str2);

    }

}
