package org.example;

import java.util.*;

public class LC_283 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = scan.nextInt();
        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter the numbers in arr");
        for (int i = 0; i < size; i++) {
            arr.add(scan.nextInt());
        }
        moveZeroes(arr);
    }

    public static void moveZeroes(List<Integer> arr) {
        Collections.sort(arr);
        int temp = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) != 0) {
                arr.set(temp, arr.get(i));
                temp++;
            }
        }
        for (int i = temp; i < arr.size(); i++) {
            arr.set(i, 0);
        }
        printArr(arr);
    }

    public static void printArr(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }

}

// <-- https://leetcode.com/problems/move-zeroes/description/ -->