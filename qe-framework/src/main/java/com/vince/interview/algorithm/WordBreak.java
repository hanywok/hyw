package com.vince.interview.algorithm;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * http://blog.csdn.net/linhuanmars/article/details/22358863/
 * http://blog.csdn.net/worldwindjp/article/details/18987825
 * Created by Vincent Han
 * on Date: 2017/12/8
 * on Time: 19:52
 **/
public class WordBreak {

    public boolean wordBreak(String s, Set<String> dict) {
        if (dict.size() == 0) {
            return false;
        }
        Iterator<String> it = dict.iterator();
        while (it.hasNext()) {
            String str = it.next();
            if (s.equals(str)) {
                return true;
            }

            if (s.indexOf(str) == 0) {
                if (wordBreak(s.substring(str.length()), dict) == true) {
                    return true;
                }
            }
        }
        return false;
    }

    /***
     * 动态规划主要用来解决如下技术问题：

     通过较小的子例来解决一个实例；
     对于一个较小的实例，可能需要许多个解决方案；
     把较小实例的解决方案存储在一个表中，一旦遇上，就很容易解决；
     附加空间用来节省时间。
     * @param s
     * @param dict
     * @return
     */


    public static boolean wordBreak2(String s, Set<String> dict) {
        if (dict.size() == 0)
            return false;
        if (s.length() == 0)
            return true;
        boolean[] state = new boolean[s.length() + 1];//状态数组：state[s.length()+1]，state[i]代表：string[0,i-1] 可被字典中的单词分割
        state[0] = true;
        //状态转移方程：state[i] = {state[j]&&string[i,j]在字典中，0=<j<i}。
        for (int i = 1; i <= s.length(); i++) {
            int k = 0;
            for (int j = k; j < i; j++) {
                if (state[j] && dict.contains(s.substring(j, i))) {
                    System.out.println(s.substring(j, i));
                    state[i] = true;
                    k = j;
                    break;
                }
            }
        }
        if (state[s.length()])
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        String s = "abcd";
        Set<String> dict = new HashSet<String>();
        dict.add("ab");
        //   dict.add("b");
        dict.add("cd");
        System.out.print(wordBreak2(s, dict));
    }

}


