package org.ming.sorting;

public class SelectionSort {

    public static void selectionSort(int array[],int n){
        for (int i = 0; i < n ; i++) {
            //存储最小元素下标
            int minIndex = i;
            for (int j = i + 1; j < n ; j++) {
               if(array[j]<array[minIndex]){
                   minIndex = j;
               }
            }
            swap(array,i,minIndex);
        }
    }
// 以下代码交换数组元素有bug
//    public static void swap(int a , int b){
//        int temp = a;
//        a = b;
//        b = temp;
//    }
        public static void swap(int arr[],int a , int b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

}
