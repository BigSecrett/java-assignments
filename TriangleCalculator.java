package ai.dv.ui;

import java.util.Scanner;

public class TriangleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the lengths of the three sides
        System.out.print("Enter the length of side a:");
        double sideOne = scanner.nextDouble();

        System.out.print("Enter the length of side b:");
        double sideTwo = scanner.nextDouble();

        System.out.print("Enter the length of side c:");
        double sideThree = scanner.nextDouble();

        // Calculate the semi-perimeter
        double semiPerimeterOfTriangle = (sideOne + sideTwo + sideThree) / 2;

        // Calculate the area using Heron's formula
        double area = Math.sqrt(semiPerimeterOfTriangle * (semiPerimeterOfTriangle - sideOne) * (semiPerimeterOfTriangle - sideTwo) * (semiPerimeterOfTriangle - sideThree));

        // Display the result
        System.out.println("The area of the triangle is: " + area);

        // Close the scanner
        scanner.close();
    }
}
