package com.vince.interview.algorithm;

public class BubbleSort {
    static void bubble_sort(int[] unsorted)
    {
        for (int i = 0; i < unsorted.length; i++)
        {
            for (int j = 0; j < unsorted.length; j++)
            {
                if (unsorted[i] > unsorted[j])
                {
                    int temp = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[] x = { 6, 2, 4, 1, 5, 9 };
        bubble_sort(x);
        for(int i=0;i<x.length;i++) {
        System.out.print(x[i]);

        }
    }
}
