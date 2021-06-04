package com.kunalshah.dsa;

public class Arrays {
    public static void main(String[] args) {
        int[] A = new int[5];
        A[0]= 1;
        A[1]= 2;
        A[2]= 3;
        A[3]= 4;
        A[4]= 5;

        for(int i = 0;i<A.length;i++){
            System.out.println(A[i]);
        }

        int[] B = new int[]{6, 7, 8, 9, 10};

        for (int i =0;i<B.length;i++){
            System.out.println(B[i]);
        }
    }
}
