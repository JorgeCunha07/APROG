import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Z {
    static final String FILE1 = "textFile.txt";
    static final String FILE2 = "textFile2.txt";
    static final int MAX_WORDS = 20;
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in1 = new Scanner(System.in);
        String[] arr = new String[MAX_WORDS];
        String str = in1.next();
        readFromFile(arr, FILE1, str);
        writeToFile(arr, FILE2);
    }
    public static void readFromFile(String[] arr, String file, String str)
            throws FileNotFoundException {
        Scanner in2 = new Scanner(new File(file));
        int words = 0;
        while (in2.hasNext() && words < MAX_WORDS) {
            String word = in2.next();
            if (word.startsWith(str)) {
                arr[words++] = word;
            }
        }
        in2.close();
    }
    public static void writeToFile(String[] arr, String file)
            throws FileNotFoundException {
        PrintWriter out = new PrintWriter(new File(file));
        for (int i = 0; arr[i] != null; i++) {
            out.println(arr[i]);
        }
        out.close();
    }
}