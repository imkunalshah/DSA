package com.kunalshah.dsa.Arrays_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i< arr.length; i++){
                if (sc.hasNextInt()){
                    arr[i] = sc.nextInt();
                }
            }
            sort012(arr,n);
        }
    }
    public static void sort012(int a[], int n)
    {
        ArrayList<Integer> list = new ArrayList<>(a.length);
        for(int i = 0;i<a.length;i++){
            list.add(a[i]);
        }
        list.sort(Collections.reverseOrder());
        for(int i = a.length ;i>0;i--){
            System.out.print(list.get(i-1)+" ");
        }
    }
}
