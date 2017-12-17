package com.vince.interview.algorithm;

public class ReverseString {

    public static String reverse(String s){
        return new  StringBuilder(s).reverse().toString();
    }

    public static String reverseString(String s) {
        char[] re = s.toCharArray();
        int len = s.length();
        if(len==0) return re.toString();
        int i = 0, j =len-1;
        while(i<j)
        {
            char tmp = re[i];
            re[i] = re[j];
            re[j] = tmp;
            i++;
            j--;
        }
        return new String(re);
    }
    public static void main(String[] args){
      System.out.print(reverse("abc"));
        System.out.print(reverseString("abc"));

    }
}
