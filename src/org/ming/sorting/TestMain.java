package org.ming.sorting;

import org.ming.testHelper.SortTestHelper;

public class TestMain {


    public static void main(String[] args){
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        SelectionSort.selectionSort(arr,10);
        for( int i = 0 ; i < arr.length ; i ++ ){
            System.out.print(arr[i]);
            System.out.print(' ');
        }


    }
}
