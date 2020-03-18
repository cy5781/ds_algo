package org.ming.search;

public class EasyBinarySearch {

    public static int binarySearch(int arr[],int n,int value){

        int low = 0;
        int high = n -1;
        while ( low <= high) {
           // int mid = (low + high ) / 2;
            int mid = low + ((high - low) >> 1);
            if(arr[mid] == value) {
                return  arr[mid];
            }
            else if(arr[mid] > value) {
                high = mid -1;
            }
            else {
                low = mid +1 ;
            }
        }
        return -1;
    }

}
