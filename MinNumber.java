package com.LinearSearch;

public class MinNumber {
    public static void main(String[] args) {
        int[] arr={21,1,4,7,9,96,54};
        System.out.println(Minimum(arr));
    }

    static int Minimum(int[] arr) {
         int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
}
