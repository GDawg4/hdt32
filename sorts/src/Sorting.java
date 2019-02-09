import java.util.Arrays;

public class Sorting {
    /*
    Obtenido de
    https://www.geeksforgeeks.org/quick-sort/
     */
    public void quickSort(Comparable arr[], int low, int high){
        if (low < high){
            //low < high
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    int partition(Comparable arr[], int low, int high) {
        Comparable pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++){
            if (arr[j].compareTo(pivot) < 0){
                i++;
                Comparable temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Comparable temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
    /*
    Obtenido de
    https://www.geeksforgeeks.org/selection-sort/
     */
    static void selectionSort(Comparable arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j].compareTo(arr[min_idx]) < 0)
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            Comparable temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    /*
    Obtenido de
    https://www.geeksforgeeks.org/merge-sort/
     */
    public void mergeSort(Comparable[] listanum, int izq, int der){
        if (izq >= der) {
            return;
        }
        int mid = (izq + der) / 2;
        mergeSort(listanum, izq, mid);
        mergeSort(listanum, mid + 1, der);
        merge(listanum, izq, mid, der);
    }

    public void merge(Comparable[] listanum, int izq, int mid, int der) {

        Comparable[] temp = new Comparable[der - izq + 1];

        int i = izq;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= der) {
            if (listanum[i].compareTo(listanum[j]) == -1) {
                temp[k++] = listanum[i++];
            }
            else {
                temp[k++] = listanum[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = listanum[i++];
        }
        while (j <= der) {
            temp[k++] = listanum[j++];
        }

        for (int m = 0; m < temp.length; m++) {
            listanum[m + izq] = temp[m];
        }
        return;
    }

    /*
    Obtenido de
    https://www.geeksforgeeks.org/gnome-sort-a-stupid-one/
     */
    public void gnomeSort(Comparable listanum[], int n){
        int posicion = 0;

        while (posicion < n){
            if (posicion == 0)
                posicion++;

            if(listanum[posicion].compareTo(listanum[posicion - 1]) >= 0) {
                posicion++;
            }
            else {
                Comparable temp = listanum[posicion];
                listanum[posicion] = listanum[posicion - 1];
                listanum[posicion - 1] = temp;
                posicion--;
            }
        }
    }
    /*
    Obtenido de
    https://www.geeksforgeeks.org/radix-sort/
     */
    void radixsort(Comparable arr[], int n) {
        // Find the maximum number to know number of digits
        Comparable m = getMax(arr, n);

        // Do counting sort for every digit. Note that instead
        // of passing digit number, exp is passed. exp is 10^i
        // where i is current digit number
        for (int exp = 1; (Integer) m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }

    Comparable getMax(Comparable arr[], int n) {
        Comparable mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i].compareTo(mx)>0)
                mx = arr[i];
        return mx;
    }

    static void countSort(Comparable arr[], int n, int exp) {
        Comparable output[] = new Comparable[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count,0);

        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[ ((Integer) arr[i]/exp)%10 ]++;

        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build the output array
        for (i = n - 1; i >= 0; i--)
        {
            output[count[ ((Integer) arr[i]/exp)%10 ] - 1] = arr[i];
            count[ ((Integer) arr[i]/exp)%10 ]--;
        }

        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to curent digit
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }
}
