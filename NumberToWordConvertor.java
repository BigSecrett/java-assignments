package ai.dv.ui;
import java.util.Scanner;

public class NumberToWordConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (up to 9999): ");
        int number = scanner.nextInt();

        // Handling thousands
        int thousands = number / 1000;
        if (thousands > 0) {
            System.out.print(getWord(thousands) + " Thousand ");
        }

        // Handling hundreds
        int hundreds = (number % 1000) / 100;
        if (hundreds > 0) {
            System.out.print(getWord(hundreds) + " Hundred ");
        }

        // Handling tens and units
        int tensAndUnits = number % 100;
        if (tensAndUnits > 0) {
            if (tensAndUnits < 10) {
                System.out.print(getWord(tensAndUnits));
            } else if (tensAndUnits < 20) {
                System.out.print(getTeensWord(tensAndUnits));
            } else {
                int tens = tensAndUnits / 10;
                int units = tensAndUnits % 10;
                System.out.print(getTensWord(tens) + " " + getWord(units));
            }
        }

        scanner.close();
    }

    // Function to get word for a digit (0-9)
    private static String getWord(int digit) {
        String[] words = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        return words[digit];
    }

    // Function to get word for teens (11-19)
    private static String getTeensWord(int number) {
        String[] words = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        return words[number - 10];
    }

    // Function to get word for tens (20, 30, ..., 90)
    private static String getTensWord(int tens) {
        String[] words = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        return words[tens];
    }
}

