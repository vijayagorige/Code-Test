package projects;

import java.util.Arrays;
import java.util.Scanner;

public class anargrams {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        //enter first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
      //enter second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        //checking the strings
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }

        scanner.close();
    }

    // Function to check if two strings are anagrams
    static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths are the same
        if (str1.length() != str2.length()) {
        	 return false;
        }

        // Convert strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted character arrays
        return Arrays.equals(charArray1, charArray2);

        }


}
