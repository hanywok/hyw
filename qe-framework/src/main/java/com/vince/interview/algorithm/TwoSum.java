package com.vince.interview.algorithm;

//https://www.cnblogs.com/grandyang/p/4130379.html
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution.
//
//Example:
//
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSumSolution(int[] nums, int target){
        HashMap<Integer,Integer> m=new HashMap<Integer, Integer>();
        int[] res=new int[2];
        for (int i = 0; i < nums.length; ++i) {
            if (m.containsKey(target - nums[i])) {
                res[0] = i;
                res[1] = m.get(target - nums[i]);
                break;
            }
            m.put(nums[i], i);
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums=new int[]{1,2,3,4};
       int[] result=twoSumSolution(nums,3);
      for(int i=0;i<result.length;i++){
          System.out.println(result[i]+",");
      }
    }
}
