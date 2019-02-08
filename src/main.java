import java.util.Random;

public class Main {
    public static void main (String[] args) {



        int[] toBeSorted = new int[100];

        for (int i = 0; i < 100; i++) {
            int test = new Random().nextInt(Integer.SIZE - 1);
            toBeSorted[i] = test;
        }

        for (int i = 1; i <= toBeSorted.length; i++) {
            System.out.println(i + ":" + toBeSorted[i - 1]);
        }

        testClass test = new testClass();
        testClass2 test2 = new testClass2();
        /**
         int[] sorted = test.GnomeSort(toBeSorted);

         for(int i=1; i<=sorted.length; i++){
         System.out.println(i+":"+sorted[i-1]);
         }
         **/

        int[] listanum = new int[10];
        for (int i = 0; i < listanum.length; i++) {
            listanum[i] = new Random().nextInt(50);
        }

        test2.sort(toBeSorted, 0, toBeSorted.length - 1);

        for (int i = 1; i <= toBeSorted.length; i++) {
            System.out.println(i + ":" + toBeSorted[i - 1]);
        }
    }

}
