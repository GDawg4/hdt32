import java.util.Random;

public class main{
    static final int NUMBER_OF_ITEMS = 3000;

    public static void main (String[] args){
        RadixSort radixSorter = new RadixSort();
        QuickSort quickSorter = new QuickSort();
        int[] toBeSorted = new int[NUMBER_OF_ITEMS];

        for (int i = 0; i < NUMBER_OF_ITEMS; i++) {
            int test = new Random().nextInt(NUMBER_OF_ITEMS);
            toBeSorted[i] = test;
        }

        quickSorter.sort(toBeSorted, 0, toBeSorted.length-1);

        for (int i=0; i<toBeSorted.length; i++) {
            System.out.print(toBeSorted[i] + "\n");
        }
    }
}
