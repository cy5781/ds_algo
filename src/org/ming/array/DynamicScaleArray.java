package org.ming.array;

public class DynamicScaleArray {
    private static final int DEFAULT_ARRAY_SIZE = 10;
    private int size;
    private int[] data;
    private int count;

    public DynamicScaleArray(int capacity) {
        this.size = capacity;
        this.data = new int[capacity];
        this.count = 0;
    }

    public void insertElements(int[] array, int element, int count) {
        // need scale
        if (count == size) {
            int scaledArray[] = new int[DEFAULT_ARRAY_SIZE * 2];
            for (int i = 0; i < array.length; i++) {
                scaledArray[i] = i;
                count++;
            }
            scaledArray[array.length ] = element;
            //return scaledArray;
        }
        // normal action
        else {
            for (int j = array.length - count; j < array.length; j++) {
                array[j] = j;
                count++;
            }
            //return array;
        }

    }


    public static void main(String[] args) {
        int array[] = new int[DEFAULT_ARRAY_SIZE];

//        for (int i = 0; i < 20; i++) {
//            array[i] = i;
//            count++;
//        }
//
//       int[] result  = insertElements(array,0,count);
//
//        for (int j = 0; j < result.length ; j++) {
//            System.out.println(result[j]);
//        }

    }

}
