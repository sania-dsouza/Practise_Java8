package com.company;

import java.util.Scanner;

public class CountOddOneOut {
    public static void main(String[] args) {
        System.out.println("Enter length of the array to be entered:");
        Scanner scan = new Scanner(System.in);
        int arrLen = scan.nextInt();
        int arr[] = new int[arrLen];
        System.out.println("Enter some numbers for an array");

        for(int i = 0;i<arrLen; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i<arr.length; i++){
            int count = 0;
            for(int j = 0; j<arr.length; j++)
                if (arr[i] == arr[j]) count++;
            if (count % 2 != 0)
                System.out.format("The odd number in the array is %d", arr[i]);
        }
    }
}
