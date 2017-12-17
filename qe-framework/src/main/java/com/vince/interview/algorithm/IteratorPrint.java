package com.vince.interview.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Vincent Han
 * on Date: 2017/12/10
 * on Time: 9:12
 **/
public class IteratorPrint {

    public static void printer(Stack<String> arr){
        if(arr.size()==0)
            return;
        else{
            String temp=arr.pop();
            System.out.print(temp);
            printer(arr);
            System.out.print(temp);
        }
    }
    public static void main(String[] args){
        Stack<String> sk=new Stack<>();
        sk.push("A");
        sk.push("B");
        sk.push("C");

        printer(sk);

    }
}
