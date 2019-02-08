public class GnomeSort {

    public int[] GnomeSort(int listanum[]) {
        int posicion = 1;
        while (posicion < listanum.length){
            if(listanum[posicion] >= listanum[posicion - 1]) {
                posicion++;
            }
            else {
                int temp = listanum[posicion];
                listanum[posicion] = listanum[posicion - 1];
                listanum[posicion - 1] = temp;
                if(posicion > 1) {
                    posicion--;
                }
            }
        }
        return listanum;
    }

}
