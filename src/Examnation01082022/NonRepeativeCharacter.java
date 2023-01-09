package Examnation01082022;


/*
 Find out the first non-repetative character from the given String.
Ex: subhendu        First non-repeated character is -s          */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeativeCharacter {

    public static char findFirstNonRepeatingChar(String str) {
        // Create a LinkedHashMap to store the character and its count
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Iterate through the string and for each character,
        // increment its count in the LinkedHashMap
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Iterate through the LinkedHashMap and return the first
        // character whose count is 1
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        // If no non-repeating character is found, return '0'
        return '0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        char firstNonRepeatingChar = findFirstNonRepeatingChar(str);
        if (firstNonRepeatingChar == '0') {
            System.out.println("There are no non-repeating characters in the string.");
        } else {
            System.out.println("The first non-repeating character in the string is: " + firstNonRepeatingChar);
        }
    }
}