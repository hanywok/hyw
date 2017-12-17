package com.vince.interview.algorithm;

public class BinarySort {
    //二分法（折半）插入排序算法
    public static void binaryInsertionSort(int[] array) {
     //   printArray("原数组：", array);
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int right = i - 1;
            int left = 0;
            int mid;
            // 定位
            while (left <= right) {
                mid = (left + right) / 2;
                if (array[mid] > temp) {
                    right = mid - 1;
                } else if (array[mid] < temp) {
                    left = mid + 1;
                }
            }
            // 移动数组
            for (int j = i; j > left; j--) {
                array[j] = array[j - 1];
            }
            // 在找到的位置插入
            array[left] = temp;
          //  printArray("第" + time++ + "次循环排序结果: ", array);
        }
    }

    public void binarySortPractice(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int right=i-1;
            int left=0;
            int mid;
            while(left<=right){
                mid=(right+left)/2;
                if (temp > arr[mid]) {
                    left=mid+1;
                }else if(temp<arr[mid]){
                    right=mid-1;
                }
            }
            for(int j=i;j>left;j--){
                arr[j]=arr[j-1];
            }
            arr[left]=temp;
        }
    }
    public static void main(String[] args) {
        int array[] = {10,5,3,1,7,2,8};
        System.out.println("排序之前：");
        for(int element : array){
            System.out.print(element+" ");
        }

        binaryInsertionSort(array);

        System.out.println("\n排序之后：");
        for(int element : array){
            System.out.print(element+" ");
        }

    }
}
