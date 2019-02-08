import java.io.*;
import java.util.*;

class GFG {
    static int NUMBER_OF_ELEMENTS = 100;

	public static void main (String[] args) {

	    Sorting sorter = new Sorting();

		Scanner teclado = new Scanner(System.in);

		Comparable[] toBeSorted = new Comparable[NUMBER_OF_ELEMENTS];

        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
                int test = new Random().nextInt(NUMBER_OF_ELEMENTS);
                toBeSorted[i] = test;
        }

        sorter.gnomeSort(toBeSorted, toBeSorted.length);

        for (Comparable i: toBeSorted){
            System.out.println(i);
        }

        /*
         while (n != 7) {
                System.out.println("-------------------------------");
                System.out.println("        MENU PRINCIPAL      ");
                System.out.println("-------------------------------");
        System.out.println("");
        System.out.println("1. Gnome Sort");
        System.out.println("2. Merge Sort");
        System.out.println("3. Quick Sort");
        System.out.println("4. Radix Sort");
        System.out.println("5. Selection Sort");
        System.out.println("6. Salir");
        System.out.println("Ingrese su opcion: ");
        n = teclado.nextInt();
        if(n == 0) {
            System.out.println("Ingresar un numero mayor a 0");
        }
        if(n == 1) {
                            Sorting.GnomeSort();
        }
        if(n == 2) {
                            Sorting.MergeSort();
        }
        if(n == 3) {
                            Sorting.QuickSort();
        }
        if(n == 4) {
                            Sorting.RadixSort();
        }
        if(n == 5) {
                            Sorting.SelectionSort();
        }
        if(n == 6) {
            System.out.println("Gracias por usar la aplicacion");
        }
        if(n >= 7) {
            System.out.println("Ingresar un numero menor a 7");
            n = 0;
        }
		}
		*/
	}
}
