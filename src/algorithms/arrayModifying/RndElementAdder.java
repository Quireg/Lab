package algorithms.arrayModifying;

import algorithms.IModifyArrayAlg;

import java.util.Random;

public class RndElementAdder implements IModifyArrayAlg {

    @Override
    public int[] modifyArray(int[] arr) {
        Random random = new Random();
        int[] modifiedArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            modifiedArr[i] = arr[i];
        }
        modifiedArr[arr.length] = random.nextInt(100);
        return modifiedArr;
    }
}
