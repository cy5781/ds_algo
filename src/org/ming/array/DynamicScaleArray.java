package org.ming.array;

//implement an auto resize array
public class DynamicScaleArray extends AbstactArray{
    private static final int DEFAULT_ARRAY_SIZE = 10;
    private int[] data;
    private int count;

    public DynamicScaleArray(int capacity) {
        this.data = new int[capacity];
        this.count = 0;
    }

    //suppose insert from the first index
    public void insertElement(int value){
        if(count == data.length){
            System.out.println("resize" +count);
            resize(2 * data.length);

        }
       // else {
            data[count] = value;
            count++;
        //}
    }

    public void resize(int size){
        int[] newArray = new int[size];
        for (int i = 0; i < count; i++) {
            newArray[i] = data[i];
        }
        data = newArray;
    }



    public static void main(String[] args) {
        DynamicScaleArray dynamicScaleArray = new DynamicScaleArray(5);
        dynamicScaleArray.insertElement(1);
        dynamicScaleArray.insertElement(2);
        dynamicScaleArray.insertElement(3);
        dynamicScaleArray.insertElement(4);
        dynamicScaleArray.insertElement(5);
        dynamicScaleArray.insertElement(6);

        dynamicScaleArray.printArray(dynamicScaleArray.data);

    }

}
