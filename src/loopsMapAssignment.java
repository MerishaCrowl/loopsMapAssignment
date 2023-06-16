//Import java utilities

import java.util.ArrayList;
import java.util.Scanner;

//Declare class loopsMapAssignment and method main
public class loopsMapAssignment {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

//Ask the user for 5 numbers and store them in the ArrayList

for(int i = 0; i < 5; i++) {
    System.out.print("Enter number " + (i + 1) + ": ");
    double num = scanner.nextDouble();
    numbers.add(num);
}


//Calculate the sum, product, largest, and smallest of the numbers

double sum = 0;
double product = 1;
double largest = Double.MIN_VALUE;
double smallest = Double.MAX_VALUE;

for (double number : numbers) {
    sum += number;
    product *= number;
    largest = Math.max(largest, number);
    smallest = Math.min(smallest, number);
}

//Print the results

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);

        scanner.close();

    }
}