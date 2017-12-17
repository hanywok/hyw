package com.vince.interview.algorithm;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] { 2, 3, 2 }));
//        System.out.println(singleNumber(new int[] { 1, 1, 2, 3, 2,3,4 }));
//        System.out.println(singleNumber(new int[] { 4,3,1, 1, 2, 3, 2 }));
//        System.out.println(singleNumber(new int[] { 3, 1, 2, 3, 2 }));
    }

    public static int singleNumber(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[0] = nums[0] ^ nums[i];//两个相同的数字异或得0，一个数字与0异或结果是它本身。
            //new int[] { 2, 3, 2 }  2跟3异或得1，3再跟2异或又得3：一个数与另外一个数异或2次是它本身。
        }
        return nums[0];

    }
}
