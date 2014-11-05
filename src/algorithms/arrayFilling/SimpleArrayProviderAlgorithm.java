package algorithms.arrayFilling;

//class has only one static method that provides array with desired length filled by random numbers between 1 and 10

import algorithms.IArrayProviderAlgorithm;

public class SimpleArrayProviderAlgorithm implements IArrayProviderAlgorithm {

    public int[] getArray(int arrayLength){
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)( Math.random()*10);
        }
        return arr;
    }
}
