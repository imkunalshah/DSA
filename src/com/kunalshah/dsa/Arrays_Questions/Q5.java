package com.kunalshah.dsa.Arrays_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//Move all negative numbers to beginning and positive to end with constant extra space
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i<n; i++){
                if (sc.hasNextInt()){
                    arr[i] = sc.nextInt();
                }
            }

            getAns(arr);
        }
    }

    private static void getAns(int[] arr) {
        ArrayList<Integer> nos = new ArrayList<>(arr.length);

        for (int i = 0; i<arr.length; i++){
            nos.add(arr[i]);
        }

        nos.sort(Collections.reverseOrder());

        int counter = nos.size()-1;
        for (int i = 0; i<nos.size(); i++){
            System.out.print(nos.get(counter)+" ");
            counter--;
        }
    }
}
