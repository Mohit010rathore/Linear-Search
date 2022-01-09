package com.LinearSearch;

public class Question2 {
    //Max Wealth
    public static void main(String[] args) {
        int[][] accounts={
                {1,2,3},
                {1,5,4},
                {5,1,2},
        };
        System.out.println(maximumWealth(accounts));
    }
     static public int maximumWealth(int[][] accounts)
    {
        //person=row
        //account=col
        //for every person in accounts
        int ans=Integer.MIN_VALUE;
        for (int person=0;person<accounts.length;person++)
        {
            int rowsum=0;
            //for every bank account
            //every col of the each row
            for(int account=0; account< accounts[person].length ;account++){
                 rowsum=rowsum+accounts[person][account];
            }
            //now we have sum of accounts of person
            //check with overall ans
            if (rowsum > ans) {

                ans=rowsum;
            }
        }
        return ans;
    }
}
