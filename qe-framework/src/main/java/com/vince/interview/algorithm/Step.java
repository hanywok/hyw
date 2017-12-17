package com.vince.interview.algorithm;

public class Step {

    public static int step2(int s){
        if(s<=0){
            return 0;
        }
        if(s<=2){
            return s;
        }
       return step2(s-1)+step2(s-2);

    }

    public static int step3(int s){
        if(s<=0)
            return 0;
        if(s<=2)
            return s;
        if(s==3)
            return 4;
        return step3(s-1)+step3(s-2)+step3(s-3);

    }
    public static void main(String[] args){
       System.out.print( step2(4));

    }
}
