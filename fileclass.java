import java.io.File;;
public class fileclass {
    public static void main(String args[])
    {
        File f = new File("sample.txt");
        System.out.println(f.isFile());
        System.out.println(f.getName());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.length());
        System.out.println(f.isHidden());
        System.out.println(f.getParent());
    }
}
