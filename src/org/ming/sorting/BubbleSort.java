package org.ming.sorting;

public class BubbleSort {

    public void bubbleSort(int[] array,int n){

        for(int i = 0 ; i < n ; i ++){
            boolean swap = false;

            for(int j = 0 ; j < n - i -1 ; j++){
                if (array[j] < array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    swap = true;
                }
                if (!swap) break;
            }

        }
    }


    public static void main(String[] args){

    }
}
