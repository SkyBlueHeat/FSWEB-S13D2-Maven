package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");



    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number = -number;
        }
        int reversed = 0;
        int original = number;
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return original == reversed;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }
        StringBuilder wordString = new StringBuilder();
        while (number > 0) {
            int digit = number % 10;
            switch (digit) {
                case 0:
                    wordString.insert(0, "Zero ");
                    break;
                case 1:
                    wordString.insert(0, "One ");
                    break;
                case 2:
                    wordString.insert(0, "Two ");
                    break;
                case 3:
                    wordString.insert(0, "Three ");
                    break;
                case 4:
                    wordString.insert(0, "Four ");
                    break;
                case 5:
                    wordString.insert(0, "Five ");
                    break;
                case 6:
                    wordString.insert(0, "Six ");
                    break;
                case 7:
                    wordString.insert(0, "Seven ");
                    break;
                case 8:
                    wordString.insert(0, "Eight ");
                    break;
                case 9:
                    wordString.insert(0, "Nine ");
                    break;
                default:
                    break;
            }
            number /= 10;
        }
        return wordString.toString().trim();
    }
}

