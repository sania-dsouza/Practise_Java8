package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryGap {

    public static int solution(int N) {
        // write your code in Java SE 8
        //convert to binary first
        String bin = Integer.toBinaryString(N);
        int longest = 0;
        List<Integer> onesList = new ArrayList(); // explicitly declare

        for(int i =0; i<bin.length(); i++){
            if(bin.charAt(i) == '0') {
                continue;
            }
            onesList.add(i);  //add the index to the list of '1' indices
        }

        for(int i = 0; i<onesList.size()-1; i++){
            int diffOnes = onesList.get(i+1) - onesList.get(i) - 1;
            longest = Math.max(longest, diffOnes);
        }
        return longest;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter a number:");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int result = solution(N);
        System.out.format("The result is %d", result);
    }
}
