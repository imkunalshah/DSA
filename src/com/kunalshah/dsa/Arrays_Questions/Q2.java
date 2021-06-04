package com.kunalshah.dsa.Arrays_Questions;
import java.util.*;
import java.lang.*;
//Maximum and minimum of an array using minimum number of comparisons
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int arr_size = sc.nextInt();
            int[] arr = new int[arr_size];
            for (int i = 0 ; i < arr.length ; i++){
                if (sc.hasNextInt()){
                    arr[i] = sc.nextInt();
                }
            }
            int max = Integer.MAX_VALUE;
            int min = Integer.MIN_VALUE;
            for (int i = 0 ; i < arr.length ; i++){
                int no = arr[i];
                if (i==0){
                    max = no;
                    min = no;
                }
                else {
                    if (no>max){
                        max = no;
                    }
                    else if (no<min){
                        min = no;
                    }
                }
            }
            System.out.println("Max:"+max);
            System.out.println("Min:"+min);
        }
    }
}
