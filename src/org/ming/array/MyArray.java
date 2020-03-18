package org.ming.array;


public class MyArray extends AbstactArray{

    private static final int DEFAULT_ARRAY_SIZE = 10;
    private int size;
    private int[] data;
    private int count;

    public MyArray(int capacity) {
        this.size = capacity;
        this.data = new int[capacity];
        this.count = 0;
    }

    public void insertElements(int index, int element) {

    }

//    public void printArray() {
//        System.out.println("------开始打印数组-------");
//        if(size != 0){
//            for(int i = 0 ; i<data.length; i++){
//                System.out.print(data[i] +",");
//            }
//        }
//    }


    public static void main(String[] args) {
        int array[] = new int[DEFAULT_ARRAY_SIZE];

    }

}
