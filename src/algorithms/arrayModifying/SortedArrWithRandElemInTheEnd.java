package algorithms.arrayModifying;

import algorithms.IModifyArrayAlg;


public class SortedArrWithRandElemInTheEnd implements IModifyArrayAlg {
    @Override
    public int[] modifyArray(int[] arr) {

        BubbleSortUp bubbleSortUp = new BubbleSortUp();
        RndElementAdder rndElementAdder = new RndElementAdder();


        return rndElementAdder.modifyArray(bubbleSortUp.modifyArray(arr));
    }
}


