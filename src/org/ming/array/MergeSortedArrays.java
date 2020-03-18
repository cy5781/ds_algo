package org.ming.array;

public class MergeSortedArrays extends AbstactArray{

    private int[] sortedArray(int[] firstArray, int[] secondArray) {

        int firstArrayLength = firstArray.length;
        int secondArrayLength = secondArray.length;
        //init array
        int[] resultArray = new int[firstArrayLength + secondArrayLength];
        //put the arrays into new array
        if (firstArray[firstArrayLength - 1] <= secondArray[0]) {
            mergeArrays(firstArray, secondArray, resultArray);
        } else {
            mergeArrays(secondArray, firstArray, resultArray);
        }
        return resultArray;
    }

    private int[] mergeArrays(int[] arrayFirst, int[] arraySecond, int[] resultArray) {

        //mark the current last data index
        int indexCount = 0;

        for (int i = 0; i < arrayFirst.length; i++) {
            resultArray[i] = arrayFirst[i];
            indexCount++;
        }

        for (int j = 0; j < arraySecond.length; j++) {
            resultArray[indexCount] = arraySecond[j];
            indexCount++;
        }
        return resultArray;
    }
    //will use printArray extends from abstractArray
//    private void printArray(int array[]) {
//        System.out.println("----------print array--------");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println("\n----------print array--------");
//    }

    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5, 6};
        int[] arrayB = {7, 8, 9, 10, 11, 12};
        MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();
      //  int[] result = mergeSortedArrays.sortedArray(arrayA, arrayB);
        int[] result = mergeSortedArrays.sortedArray(arrayB, arrayA);
        mergeSortedArrays.printArray(result);
    }

}
