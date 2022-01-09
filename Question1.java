package com.LinearSearch;

public class Question1 {
    //Find Numbers with Even Number of Digits
    //Given an array nums of integers,return how many of them
    //contains even number of digits
    public static void main(String[] args) {
          int[] nums={12,345,2,6,7896};
 //       System.out.println(digits(0));
 //       System.out.println(findNumbers(nums));
        System.out.println(digits2(7787654));
    }
    static int findNumbers(int[] nums)
    {
        int count=0;
        for(int num:nums)
        {
            if(even(num))
            {
                count++;
            }

        }
        return count;
    }

    //function to check whether a number contains even digits or not
    static boolean even(int num) {
        int numberofDigits=digits(num);
        if(numberofDigits % 2==0){
            return true;
        }
        return false;
    }

    //count number of digits in a number
    static int digits(int num){
        //if number is negative we will make it positive
        if(num<0){
            num=num*-1;
        }
        if(num==0)
        {
            return 1;
        }
        int count=0;

        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }

    //shortcut value to find number of digits
    static int digits2(int num)
    {
        return (int)(Math.log10(num)) + 1;//very optimized
    }
}
