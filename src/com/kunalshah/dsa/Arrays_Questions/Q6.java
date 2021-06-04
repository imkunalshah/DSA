package com.kunalshah.dsa.Arrays_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;
import java.util.stream.Collectors;

// Union of two arrays
public class Q6 {
    public static void main(String[] args) {
        int m = 0;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<2;i++){
            if (sc.hasNextInt()){
                if (i == 0){
                    m = sc.nextInt();
                }
                else {
                    n = sc.nextInt();
                }
            }
        }
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        for (int j = 0; j<m; j++){
            if (sc.hasNextInt()){
                arr1[j] = sc.nextInt();
            }
        }
        for (int k = 0; k<n; k++){
            if (sc.hasNextInt()){
                arr2[k] = sc.nextInt();
            }
        }

        getAns(arr1,arr2);
    }

    private static void getAns(int[] arr1, int[] arr2) {
        ArrayList<Integer> list1 = new ArrayList<>(arr1.length);
        ArrayList<Integer> list2 = new ArrayList<>(arr2.length);

        for (int i = 0; i<arr1.length; i++){
            list1.add(arr1[i]);
        }
        for (int i = 0; i<arr2.length; i++){
            list2.add(arr2[i]);
        }

        list1.stream().distinct().collect(Collectors.toList());
        list2.stream().distinct().collect(Collectors.toList());
        //System.out.println(list2);
        int count = 0;
        for (int i = 0; i<list1.size(); i++){
            int no = list1.get(i);
            if (list2.contains(no)){

            }
            else {
                count++;
            }
        }
        int count1 = 0;
        for (int i = 0; i<list2.size(); i++){
            int no = list2.get(i);
            if (list1.contains(no)){

            }
            else {
                count1++;
            }
        }
        list1.retainAll(list2);


        int final_count = list1.size()+count+count1;
        System.out.println(final_count);
    }
}
