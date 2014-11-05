package algorithms;


public class GetModifyingTime {

    public long getModifyTime(IModifyArrayAlg iModifyArrayAlg, int[] array) {
        long time = System.nanoTime();
        iModifyArrayAlg.modifyArray(array);
        time = System.nanoTime() - time;
        return time;
        }
}
