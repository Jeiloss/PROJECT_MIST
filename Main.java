import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        gettext.fromInput();

        String file = "test1.txt";
        String alpha = gettext.fromTxtFile(file);

        System.out.println(alpha);
    }
}
