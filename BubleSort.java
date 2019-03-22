package sort_algorithms;

import java.util.Scanner;

public class BubleSort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers you want to sort: ");
        int size = input.nextInt();

        int numbers[] = new int[size];

        System.out.println("Enter " + size + " numbers");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        int sortedNumbers[] = sort(numbers);

        for (int num : sortedNumbers) {
            System.out.println(num);
        }
    }

    private static int[] sort(int[] numbers) {

        int swap = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {

                if (numbers[j] > numbers[j + 1]) {
                    swap = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = swap;
                }
            }
        }

        return numbers;
    }
}
