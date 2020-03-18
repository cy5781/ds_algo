package org.ming.search;

public class RecursionBinarySearch {

    public static int recursionBinarySearch(int arry[],int n,int value){
        return binarySearch(arry,0,n-1,value);
    }
    public static int binarySearch(int arry[], int low , int high ,int value){
        if(low > high) return -1;
        // mid  = (low + high)/2 有可能会溢出
        // 这样写也可以 mid = low +(high - low) / 2
        // 效率最高的是位移 mid = low + ((high - low) >> 1)
        int mid = low + ((high - low) >> 1);
        if(arry[mid] == value){
            return arry[mid];
        }
        else if(arry[mid] > value){
            return binarySearch(arry,low,mid -1, value);
        }
        else {
            return binarySearch(arry,mid+1, high , value);
        }
    }

}
