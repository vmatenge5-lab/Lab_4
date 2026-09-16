import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int number = scanner.nextInt();
        int original = number;

        String binary = "";

        if (number == 0) {
            binary = "0";
        }

        while (number > 0) {
            int remainder = number % 2;
            binary = remainder + binary;
            number = number / 2;
        }

        System.out.println(original + " in binary is " + binary);

        scanner.close();
    }
}