package com.kunalshah.dsa.Arrays_Questions;
import java.util.*;
import java.lang.*;
//Write a program to reverse an array or string
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int arr_size = sc.nextInt();
            int[] arr = new int[arr_size];
            int[] rev_arr = new int[arr_size];
            for (int i = 0 ; i< arr.length ; i++){
                if (sc.hasNextInt()){
                    arr[i] = sc.nextInt();
                }
            }
            int counter = arr_size-1;
            for (int i = 0 ; i<rev_arr.length ; i++){
                rev_arr[i] = arr[counter];
                counter--;
            }
            for (int i = 0 ; i < rev_arr.length ; i++){
                System.out.println(rev_arr[i]);
            }
        }

        if(sc.hasNext()){
            String str = sc.next();
            String rev_str = "";
//            System.out.println(str.length());
//            System.out.println(str.substring(1,2));
            int counter = str.length()-1;
            for (int i = 0 ; i < str.length() ; i++){
                char last_char = str.charAt(counter);
                counter--;
                rev_str=rev_str.concat(String.valueOf(last_char));
            }
            System.out.println(rev_str);
        }


    }
}
