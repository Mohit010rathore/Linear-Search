package com.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
         int[][] arr={
            {3,6,1},
            {12,40,21,22},
            {78,45,32,11,87},
                 {41,66,99} ,
         };
         int target=66;
        int[] ans=search(arr,target);//format of return value {row,col}
        System.out.println(Arrays.toString(ans));//The string representation consists of a list of the array’s elements, enclosed in square brackets (“[]”)
        System.out.println(max(arr));//maximum in 2D array
    }

    static int[] search(int[][] arr, int target) {
         for(int row=0;row<arr.length;row++)
         {
             for(int col=0;col<arr[row].length;col++)
             {
                 if(arr[row][col]==target)
                 {
                     return new int[]{row,col};//we will return another array which will contain another array containing row and col
                 }//we will create object bcoz we havn't initialized earlier
             }
         }
         //if not able to find it
        return new int[]{-1,-1};
    }
    static int max(int[][]arr)
    {
        int max=Integer.MIN_VALUE;
        for(int[] ints:arr){
            for(int element:ints){
                if(element>max){
                    max=element;
                }
            }
        }
        return max;
    }
}
