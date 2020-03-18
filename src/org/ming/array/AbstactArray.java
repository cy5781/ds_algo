package org.ming.array;

public abstract class AbstactArray {

    public void printArray(int array[]) {
        System.out.println("----------print array--------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n----------print array--------");
    }

}
