package com.company;
import java.util.*;

public class FindIfArrayPerm {
    public static void main(String[] args) {
        int arrLen = 8, i = 0;
        Integer[] arr = new Integer[arrLen];
        //Integer[] arr = {1,4,6,2,8,8,0,3};
        Scanner scan = new Scanner(System.in);

        //Get the length of the array
        arrLen = scan.nextInt();
        //Get elements of the array
        for (i = 0; i < arrLen; i++) {
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr); //sort the array
        if (arr[arrLen - 1] > arrLen) System.out.println("The array is not a permutation");
        else {
            //convert the array into a set
            Set<Integer> targetSet = new HashSet<>(Arrays.asList(arr));
            Integer[] newArr = new Integer[targetSet.size()];
            //System.out.println("Set: "+targetSet);
            //System.out.print("Array: "+Arrays.toString(targetSet.toArray(newArr)));
            Arrays.toString(targetSet.toArray(newArr));
            for (i = 0; i < newArr.length - 1; i++) {
                if (newArr[i + 1] - newArr[i] != 1)
                    System.out.print("The array is not a permutation");
                break;
            }
            if (i == newArr.length) {
                System.out.print("The array is a permutation");
            }
            // }
        }
    }
}

