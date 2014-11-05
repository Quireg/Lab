package algorithms.arrayFilling;

import algorithms.IArrayProviderAlgorithm;

import java.util.Random;

public class AnotherArrProviderAlgorithm implements IArrayProviderAlgorithm {
    public int[] getArray(int arrayLength){
        int[] arr = new int[arrayLength];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(500);
        }
        return arr;
    }
}
