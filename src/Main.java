import java.io.File;
import java.util.Arrays;

public class Main {

    public static String[] splitPath(String pathString) {
        return pathString.split(File.separator, 5);
    }

    public static void main(String[] args) {
//        System.out.println(File.separator);
        String pathString = "C:/Users/Joe/AppData/Local/Temp/file.txt";
        System.out.println(pathString);
        String[] paths = splitPath(pathString);
        System.out.println(Arrays.toString(paths));
    }
}
