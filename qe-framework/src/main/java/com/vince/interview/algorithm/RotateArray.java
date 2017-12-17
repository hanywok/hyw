package com.vince.interview.algorithm;

/**
 * https://www.programcreek.com/2015/03/rotate-array-in-java/
 * Rotate an array of n elements to the right by k steps.
 * <p>
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * Created by Vincent Han
 * on Date: 2017/12/10
 * on Time: 15:13
 **/
public class RotateArray {

    public static void rotate(int[] arr, int order) {
        if (arr == null || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        for (int i = 0; i < order; i++) {//要挪几个数
            for (int j = arr.length - 1; j > 0; j--) {//从最后一个数开始一个一个的向前挪到最前面
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }

    }

    public static void main(String args[]) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(arr, 3);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

    }
}
