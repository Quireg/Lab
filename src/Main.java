import algorithms.GetModifyingTime;
import algorithms.arrayFilling.AnotherArrProviderAlgorithm;
import algorithms.arrayModifying.BubbleSortDown;
import algorithms.arrayModifying.BubbleSortUp;
import body.MainCycle;

public class Main {
    public static void main(String[] args) {
        MainCycle.mainCycle.setMainCycle();

        GetModifyingTime getModifyingTime = new GetModifyingTime();
        AnotherArrProviderAlgorithm anotherArrProviderAlgorithm = new AnotherArrProviderAlgorithm();
        BubbleSortUp bubbleSortUp = new BubbleSortUp();
        BubbleSortDown bubbleSortDown = new BubbleSortDown();

          int[] arr = anotherArrProviderAlgorithm.getArray(100);

        System.out.println((getModifyingTime.getModifyTime(bubbleSortUp, arr))/1000 + " milliseconds");
        System.out.println((getModifyingTime.getModifyTime(bubbleSortDown, arr))/1000 + " milliseconds");

}
}
