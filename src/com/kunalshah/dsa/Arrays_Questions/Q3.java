package com.kunalshah.dsa.Arrays_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// Kth smallest element and Kth largest element
public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int arr_size = sc.nextInt();
            int[] arr = new int[arr_size];
            for (int i = 0;i<arr.length;i++){
                if (sc.hasNextInt()){
                    arr[i] = sc.nextInt();
                }
            }
            if (sc.hasNextInt()){
                int k = sc.nextInt();
                int kthSmallest = kthSmallest(arr,k);
                int kthLargest = kthLargest(arr,k);
                System.out.println("kth Smallest:"+kthSmallest);
                System.out.println("kth Largest:"+kthLargest);
            }

        }
    }
    public static int kthSmallest(int[] arr, int k)
    {
        ArrayList<Integer> list = new ArrayList<>(arr.length);

        for(int i = 0;i<arr.length;i++){
            int no = arr[i];
            list.add(no);
        }

        list.sort(Collections.reverseOrder());
        return list.get(arr.length-k);
    }

    public static int kthLargest(int[] arr,int k){

        ArrayList<Integer> list = new ArrayList<>(arr.length);

        for(int i = 0;i<arr.length;i++){
            int no = arr[i];
            list.add(no);
        }

        list.sort(Collections.reverseOrder());
        return list.get(k-1);

    }
}
