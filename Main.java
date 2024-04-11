package week4backend;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1.
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        System.out.println(ages[ages.length - 1] - ages[0]);  // a.

        int[] ages2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};  // b.i.
        System.out.println(ages2[ages2.length - 1] - ages2[0]);  // b.ii.

        double averageAge = Arrays.stream(ages).average().getAsDouble();  // c.
        System.out.println(averageAge);

        // 2.
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        double averageLetters = Arrays.stream(names).mapToInt(String::length).average().getAsDouble();  // a.
        System.out.println(averageLetters);

        String concatenatedNames = String.join(" ", names);  // b.
        System.out.println(concatenatedNames);

        // 3.
        int lastElement = ages[ages.length - 1];
        System.out.println(lastElement);

        // 4.
        int firstElement = ages[0];
        System.out.println(firstElement);

        // 5.
        int[] nameLengths = Arrays.stream(names).mapToInt(String::length).toArray();

        // 6.
        int sumOfLengths = Arrays.stream(nameLengths).sum();
        System.out.println(sumOfLengths);

        // 7.
        System.out.println(repeatWord("Hello", 3));

        // 8.
        System.out.println(fullName("John", "Doe"));

        // 9.
        System.out.println(isSumGreaterThan100(ages));

        // 10.
        double[] arr = {1.0, 2.0, 3.0, 4.0, 5.0};
        System.out.println(average(arr));

        // 11.
        double[] arr1 = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] arr2 = {6.0, 7.0, 8.0, 9.0, 10.0};
        System.out.println(isFirstAverageGreater(arr1, arr2));

        // 12.
        System.out.println(willBuyDrink(true, 20.00));

        // 13.
        System.out.println(isPrime(17));

        // Check if a number is a palindrome
        int num = 121;
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }

    // 7.
    public static String repeatWord(String word, int n) {
        return word.repeat(n);
    }

    // 8.
    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // 9.
    public static boolean isSumGreaterThan100(int[] arr) {
        return Arrays.stream(arr).sum() > 100;
    }

    // 10.
    public static double average(double[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }

    // 11.
    public static boolean isFirstAverageGreater(double[] arr1, double[] arr2) {
        return average(arr1) > average(arr2);
    }

    // 12.
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }

    // 13.
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}