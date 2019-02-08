import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {


		Scanner teclado = new Scanner(System.in);
		int n = 0;
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
	}
}
