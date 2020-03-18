package org.ming.search;

public class BinaryMain {

    public static void main(String[] args){

        int[] arr = {2,4,8,9,10,12,14,23,42,50};

        int find = EasyBinarySearch.binarySearch(arr,arr.length,10);
        System.out.println(find);

        int recursionFind = RecursionBinarySearch.recursionBinarySearch(arr,arr.length -1,10);
        System.out.println(recursionFind);

    }
}
