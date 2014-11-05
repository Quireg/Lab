package algorithms.arrayModifying;


import algorithms.IModifyArrayAlg;

public class BubbleSortUp implements IModifyArrayAlg {
    @Override
    public int[] modifyArray(int[] arr) {
        int[] arrNew = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        for (int i = 0; i < arrNew.length; i++) {
            for (int j = 0; j < arrNew.length - i - 1 ; j++) {
                if(arrNew[j]>arrNew[j+1]) {
                    int temp = arrNew[j];
                    arrNew[j] = arrNew[j + 1];
                    arrNew[j + 1] = temp;
                }
            }
        }

        return arrNew;
    }
}
