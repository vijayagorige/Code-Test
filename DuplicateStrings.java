package projects;

import java.util.Scanner;

public class DuplicateStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        //entering elements length
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] array = new int[length];
      //entering elements
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Print the duplicate elements
        System.out.println("Duplicate elements in the array are:");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                    break;  // To avoid printing the same duplicate multiple times
                }
            }
        }

        scanner.close();

    }
}
