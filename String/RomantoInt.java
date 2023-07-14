package String;

import java.util.Scanner;

public class RomantoInt {
    public static void main(String[] args) {
        // create scanner class object
        Scanner sc = new Scanner(System.in);
        // take input from user
        System.out.print("Enter a roman number: ");
        String roman = sc.nextLine();
        // convert roman to integer
        int result = romanToInt(roman);
        // print result
        System.out.println("Integer value: " + result);
    }

    // romanToInt() user defined method to convert roman number to integer
    private static int romanToInt(String roman) {
        // declare variables
        int result = 0;
        int prev = 0;
        int curr = 0;

        // convert roman to integer
        for (int i = roman.length() - 1; i >= 0; i--) {
            // get current and previous character
            curr = getValue(roman.charAt(i));
            if (curr < prev) {
                result -= curr;
            } else {
                result += curr;
            }

            prev = curr;
        }
        return result;
    }

    static int getValue(char charAt) {
        switch (charAt) {
            case 'I':
            case 'i':
                return 1;
            case 'V':
            case 'v':
                return 5;
            case 'X':
            case 'x':
                return 10;
            case 'L':
            case 'l':
                return 50;
            case 'C':
            case 'c':
                return 100;
            case 'D':
            case 'd':
                return 500;
            case 'M':
            case 'm':
                return 1000;
            default:
                return 0;
        }
    }

}
