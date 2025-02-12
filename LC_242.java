package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LC_242 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String str1 = scan.next();

        System.out.println(isAnagram(str, str1));
    }

    public static boolean isAnagram(String str, String str1) {

        if (str.length() != str1.length()) {
            return false;
        }

        List<Character> strArr = str.chars()
                .mapToObj(c -> (char) c)
                .toList();

        List<Character> str1Arr = str1.chars()
                .mapToObj(c -> (char) c)
                .toList();

        if (str1Arr.containsAll(strArr)) {
            return true;
        }
        else {
            return false;
        }
    }
}
