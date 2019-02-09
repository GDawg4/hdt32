import org.junit.jupiter.api.Test;

import static junit.framework.Assert.*;

public class SortingTest {

    @org.junit.Test
    public void getMax() {
        Sorting getMaxer = new Sorting();
        Comparable testList[] = {1, 2, 3, 4, 5, 6};
        assertEquals(6, getMaxer.getMax(testList, 6));
    }

    @org.junit.Test
    public void quickSort() {
        Sorting quickSorter = new Sorting();
        Comparable scrambled[] = {5, 2, 7, 1, 1,3};
        Comparable unscrambled[] = {1,1,2, 3, 5,7 };
        quickSorter.quickSort(scrambled, 0 , scrambled.length-1);
        for (int i = 0; i < scrambled.length; i++){
            assertEquals(scrambled[i], unscrambled[i]);
        }
    }

    @org.junit.Test
    public void selectionSort() {
        Sorting quickSorter = new Sorting();
        Comparable scrambled[] = {5, 2, 7, 1, 1,3};
        Comparable unscrambled[] = {1,1,2, 3, 5,7 };
        quickSorter.selectionSort(scrambled);
        for (int i = 0; i < scrambled.length; i++){
            assertEquals(scrambled[i], unscrambled[i]);
        }
    }

    @org.junit.Test
    public void gnomeSort() {
        Sorting quickSorter = new Sorting();
        Comparable scrambled[] = {5, 2, 7, 1, 1,3};
        Comparable unscrambled[] = {1,1,2, 3, 5,7 };
        quickSorter.gnomeSort(scrambled, scrambled.length);
        for (int i = 0; i < scrambled.length; i++){
            assertEquals(scrambled[i], unscrambled[i]);
        }
    }

    @org.junit.Test
    public void radixsort() {
        Sorting quickSorter = new Sorting();
        Comparable scrambled[] = {5, 2, 7, 1, 1,3};
        Comparable unscrambled[] = {1,1,2, 3, 5,7 };
        quickSorter.radixsort(scrambled, scrambled.length);
        for (int i = 0; i < scrambled.length; i++){
            assertEquals(scrambled[i], unscrambled[i]);
        }
    }
}