import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Question2 {
    public static void main(String[] args) {
        double[] temperatures = {21.5, 19.8, 25.0, 30.2, 18.4};

        try {
            PrintWriter writer = new PrintWriter(new FileWriter("temperatures.txt"));

            for (int i = 0; i < temperatures.length; i++) {
                writer.println(temperatures[i]);
            }

            writer.close();
            System.out.println("Wrote " + temperatures.length + " value(s) to temperatures.txt");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}