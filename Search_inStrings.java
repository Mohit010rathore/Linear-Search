package com.LinearSearch;

import java.util.Arrays;

public class Search_inStrings {
    public static void main(String[] args) {
        String name="Mohit";
        char target='h';

        //converting string to character array
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search2(name,target));

    }

    static boolean search(String str,char target)
    {
        if(str.length()==0)
        {
            return false;
        }
        for(int i=0;i<str.length();i++)
        {
            if(target==str.charAt(i))
            {
                return true;
            }
        }
        return false;
    }
    //for each function
    static boolean search2(String str,char target)
    {
        if(str.length()==0)
        {
            return false;
        }
        for(char ch: str.toCharArray())//converted into a character array
        {
           if(ch==target)
           {
               return true;
           }
        }
        return false;
    }
}
