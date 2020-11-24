package com.company;

public class CountOddOneOut {
    public static void main(String[] args) {
        int arr[] = {1,2,31,1,1,1,2,2,3,3,5};

        for (int i = 0; i<arr.length; i++){
            int count = 0;
            for(int j = 0; j<arr.length; j++){
                if (arr[i] == arr[j]) count++;
            if (count % 2 != 0){
                System.out.format("%d", arr[i]);
            }
            }
        }
    }
}
