public class GnomeSort {

    public void GnomeSort(Comparable listanum[], int n) {

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
