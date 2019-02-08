public class MergeSort {

    public void sort(Comparable[] listanum, int izq, int der) {
        if (izq >= der) {
            return;
        }
        int mid = (izq + der) / 2;
        sort(listanum, izq, mid);
        sort(listanum, mid + 1, der);
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
}
