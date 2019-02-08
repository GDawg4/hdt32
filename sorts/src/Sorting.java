public class Sorting {

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

    public static void selectionSort (Comparable[] list)
    {
        int min;
        Comparable temp;

        for (int index = 0; index < list.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;

            // Swap the values
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

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
        return;
    }
}
