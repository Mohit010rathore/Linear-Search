package com.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={12,3,34,21,67,43};
        int target=34;
//        System.out.println(Linearsearch(arr,target,1,4));
        //or this
        int ans=Linearsearch(arr,target,1,4);
        System.out.println(ans);

    }
    static int Linearsearch(int[] arr,int target,int start,int end)
    {
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++)
        {
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}
