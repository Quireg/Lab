package algorithms.arrayModifying;

import algorithms.IModifyArrayAlg;

public class SwapSort implements IModifyArrayAlg {
    @Override
    public int[] modifyArray(int[] arr) {
        int[] arrNew = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }




        return arrNew;
    }
}
