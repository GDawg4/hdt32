import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

class GFG {
    static int NUMBER_OF_ELEMENTS = 60;

	public static void main (String[] args) {
	    try {
            Writer wr = new FileWriter("test.txt");
            for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
                int test = new Random().nextInt(NUMBER_OF_ELEMENTS);
                wr.write(new Integer(test).toString() + " ");
            }
            wr.close();
        }catch (IOException E){

        }

        try {
            Writer wr = new FileWriter("test.txt");
            for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
                int test = new Random().nextInt(NUMBER_OF_ELEMENTS);
                wr.write(new Integer(test).toString() + " ");
            }
            wr.close();
        }catch (IOException E){

        }

        StringBuilder contentBuilder = new StringBuilder();
        try{
            Stream<String> lines = Files.lines(
                    Paths.get("test.txt"),
                    StandardCharsets.UTF_8);
            lines.forEach(s ->contentBuilder.append(s));
        }catch (IOException exception){
            System.out.println("Error");
        }
        String calculation = contentBuilder.toString();
        String[] onlySymbols = calculation.split(" ");

        Sorting sorter = new Sorting();
        Comparable[] toBeSorted = new Comparable[NUMBER_OF_ELEMENTS];

        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++){
            toBeSorted[i] = Integer.valueOf(onlySymbols[i]);
        }

        sorter.radixsort(toBeSorted, toBeSorted.length);

        for (Comparable i : toBeSorted){
            System.out.println(i);
        }
	}
}
