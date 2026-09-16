import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        String[] names = new String[20];
        int count = 0;

        try {
            File inputFile = new File("names.txt");
            Scanner fileReader = new Scanner(inputFile);

            while (fileReader.hasNext() && count < names.length) {
                names[count] = fileReader.next();
                count++;
            }

            fileReader.close();

            System.out.println("Read " + count + " word(s) from names.txt:");
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + names[i]);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Could not find names.txt. Make sure it is in the same folder as this program.");
        }
    }
}