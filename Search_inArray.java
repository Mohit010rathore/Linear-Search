package com.LinearSearch;

public class Search_inArray {
    public static void main(String[] args) {
         int[] arr={54,66,21,-33,12,34,65};
         int target=41;
//         int ans=Linearsearch(arr,target);
        int ans=Linearsearch2(arr,target);
        System.out.println(ans);

         //Time Complexity:
         //Best case-O(1)
         //worst case-O(N)

    }
    static int Linearsearch(int[] arr,int target)
    {
        if(arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++)
        //check for element at every index if it is= target
        {
            int element=arr[i];
            if(element==target){
                return i;
            }

        }
        //thisline will execute if none of the return statements have executed
        //hence target no found
        return -1;

    }

    //search the target and return the element
    static int Linearsearch2(int[] arr,int target)
    {
        if(arr.length==0){
            return -1;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE; //no -1 bcoz it can be a element in the array

    }
}
