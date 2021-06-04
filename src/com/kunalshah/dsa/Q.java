package com.kunalshah.dsa;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

class Q
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{2, 7, 8, 50, 100, 0, 5, 1};
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int[] sorted_arr = new int[arr.length];

        ArrayList<Integer> list = new ArrayList<>(arr.length);
        for (int i = 0;i<arr.length;i++){
            list.add(arr[i]);
        }
        list.sort(Collections.reverseOrder());
        int counter = list.size()-1;
        for (int i = 0;i<list.size();i++){
            sorted_arr[i] = list.get(counter);
            counter--;
        }

        System.out.println(Arrays.toString(sorted_arr));
//
//        for (int i = 0;i<arr.length;i++){
//            int no = arr[i];
//            if (i == 0){
//                max = no;
//                min = no;
//            }
//            else {
//                if (no > max){
//                    max = no;
//                }
//                else if (no < min){
//                    min = no;
//                }
//            }
//        }
//
//        System.out.println("Max:"+max);
//        System.out.println("Min:"+min);
//        if (sc.hasNextInt()){
//            int t_c = sc.nextInt();
//            if (t_c>10 || t_c<1){
//
//            }
//            else{
//                HashMap<Integer, ArrayList<Integer>> map = new LinkedHashMap<>();
//                ArrayList<Integer> sol = new ArrayList<>();
//                for (int i = 0;i<t_c ;i++ ){
//                    int[] arr = new int[3];
//                    for (int j = 0;j<3 ;j++ ){
//                        if (sc.hasNextInt()){
//                            int no = sc.nextInt();
//                            if (j == 0 || j == 1){
//                                if (no>100000 || no <0){
//
//                                }
//                                else{
//                                    arr[j] = no;
//                                }
//                            }
//                            else{
//                                if(no > 100000 || no < 1){
//
//                                }
//                                else{
//                                    arr[j] = no;
//                                }
//                            }
//                        }
//                    }
//                    int[] ls = new int[arr[2]];
//                    for (int k = 0;k < arr[2] ;k++ ){
//                        int n_m_sum = arr[0]+arr[1];
//                        if (sc.hasNextInt()){
//                            int no = sc.nextInt();
//                            if (no > n_m_sum || no < 1){
//
//                            }
//                            else{
//                                ls[k] = no;
//                            }
//                        }
//                    }
//                    sol = getAns(arr,ls);
//                    map.put(i,sol);
//                }
//
//                for (int i = 0;i<map.size() ;i++ ){
//                    ArrayList<Integer> list = map.get(i);
//                    for (int j = 0;j<list.size() ;j++ ){
//                        if (j == (list.size()-1)){
//                            //System.out.print(list.get(i)+"\n");
//                        }
//                        else{
//                            System.out.print(list.get(i));
//                        }
//
//                    }
//                }
//            }
//        }
    }

    public static ArrayList<Integer> getAns(int[] arr,int[] ls){
        int N = arr[0];
        int M = arr[1];
        int K = arr[2];


        ArrayList<Integer> ls_list = new ArrayList<>(ls.length);


        for (int i =0;i<ls.length ;i++ ){
            int no = ls[i];
            ls_list.add(no);
        }
        List<Integer> distinct_list = ls_list.stream().distinct().collect(
                Collectors.toList());
        ArrayList<Integer> candidates = new ArrayList<>();
        System.out.println(distinct_list);
        for(int i = 0;i<ls_list.size();i++){
            int no = ls_list.get(i);
            if (no >= (N+1) || no <= (N+M)){

            }
            else{
                if (distinct_list.contains(no)){
                    candidates.add(no);
                }
            }
        }

        List<Integer> distinct_ans = candidates.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct_ans);
        ArrayList<Integer> ans_list = new ArrayList<>();
        ans_list.add(distinct_list.size());
        ans_list.addAll(distinct_ans);

        return ans_list;
    }
}
