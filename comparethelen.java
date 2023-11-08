import java.lang.String;
public class comparethelen {
    public static void main(String[] args) {
        String str1="Tushardavane";
        String str2 = "Tushardavne12345";

        int len1= str1.length();
        int len2 = str2.length();
        if(len1 > len2)
        {
            System.out.println(str1+"This string big tha str2");

        }
        else{
            System.out.println(str2+"This is the big than str1");
        }
        //concate the string 

        String str3 = str1.concat(str2);
        System.out.println(str3);



        String str5 = "PHP Exercises and Python Exercises";
        String str4 = "and";
        System.out.println("Original String: " + str5);
        System.out.println("Specified sequence of char values: " + str4);
        System.out.println(str1.contains(str4));



        
    String str6 = "example.com", str7 = "Example.com";
    StringBuffer strbuf = new StringBuffer(str1);
    
    System.out.println("Comparing "+str6+" and "+strbuf+": " + str6.contentEquals(strbuf));
    
    System.out.println("Comparing "+str6+" and "+strbuf+": " + str7.contentEquals(strbuf));




    //Character array with data.
        char[] arr_num = new char[] { '1', '2', '3', '4' };

        // Create a String containig the contents of arr_num
        // starting at index 1 for length 2.
        String str = String.copyValueOf(arr_num, 1, 3);

        // Display the results of the new String.
        System.out.println("\nThe book contains " + str +" pages.\n");

    }
    
}
