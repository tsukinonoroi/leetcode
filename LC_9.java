package org.example;

import java.util.Scanner;

public class LC_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(isPalindrome(num));
    }

    public static boolean isPalindrome(int num) {
        String s = Integer.toString(num);
        StringBuilder sb = new StringBuilder(s);
        if (s.contentEquals(sb.reverse())) {
            return true;
        }
        else {
            return false;
        }
    }
}

// <-- https://leetcode.com/problems/palindrome-number/description/ -->