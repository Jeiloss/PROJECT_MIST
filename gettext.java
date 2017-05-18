import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**Queries the user for text.*/

public class gettext {

    // public static void main(String[] args) {
    //
    //     Scanner scanner = new Scanner (System.in);
    //     System.out.println("Please, type something.");
    //     // String txt = scanner.nextLine();
    //     System.out.pirntln(System.in());
    //
    //
    // }

    /**Returns what the user types.
    */
    public static String fromInput() {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please, type something.");

        String txt = scanner.nextLine();
        System.out.println(txt);

        return txt;
    }

    /** Takes a text file, and returns the contents as a String.
    */
    public static String fromTxtFile(String x) throws FileNotFoundException {

        File file = new File (x);
        String txt= "";

        if (file.exists()) {
            Scanner fromFile = new Scanner (file);
            while (fromFile.hasNext()) {
                txt += fromFile.nextLine();
            }
        }
        // fromFile.close();
        return txt;
    }
}
