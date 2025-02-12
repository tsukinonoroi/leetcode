package org.example;

import java.util.*;

public class LC_263 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.println(uglyNumber(num));
    }

    public static boolean uglyNumber(int num) {
        Set<Integer> staticUglyPrimeNumbers = new HashSet<>(Arrays.asList(num, 1, 2, 3, 5));
        ArrayList<Integer> arrOfNumbers = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            if (num % i == 0) {
                arrOfNumbers.add(i);
            }

        }
        if (arrOfNumbers.stream().allMatch(staticUglyPrimeNumbers::contains)) {
            printArr(arrOfNumbers);
            return true;
        }
        else {
            printArr(arrOfNumbers);
            return false;
        }
    }

    public static void printArr(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i) + " ");
        }
    }
}
// <-- https://leetcode.com/problems/ugly-number/description/ -->
