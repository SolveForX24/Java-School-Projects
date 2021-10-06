import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Object;

public class Main {
    public static void main(String[] args) {

        // Establish scanner and objects used for reading text. Array to hold names as well.
        Scanner sc = new Scanner(System.in);
        String names[] = new String[32];
        String toReplaceComma = "";
        File nameFile;
        Scanner reply;

        // Assigns the strings from each line into each part of the array.
        // Commented out lines were used to test the program
        try {
            nameFile = new File("src/Sophomore.txt");
            reply = new Scanner(nameFile);
            for (int i = 0; i < 32; i++) {
                //blockNums[i] = Integer.parseInt(reply.next());
                names[i] = reply.next();

                // We use a string to replace the comma, because the delimiter was causing problems.

                toReplaceComma = names[i];
                toReplaceComma = toReplaceComma.replace(",", " ");
                names[i] = toReplaceComma;
                //System.out.println(names[i]);
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        // Setting up char variables, newly used string array and checking how to sort the names.
        System.out.println("How do you want to assign and organize the testers? \nBy Block 1 (1), Block 2 (2) or Full Block (3)? ");
        int choice = sc.nextInt();
        String namesToPullFrom[] = new String[16];

        // Note that we have to initiate the chars this way, so that in ASCII the char value is either 1 or 2.
        char blockOne;
        blockOne = 49;
        char blockTwo;
        blockTwo = 50;

        // Running the method desired to separate names.
        switch(choice) {
            case 1:
                separateNames(names, namesToPullFrom, blockOne);
                break;
            case 2:
                separateNames(names, namesToPullFrom, blockTwo);
                break;
            case 3:
                System.out.println("Array will stay the same.");
                Arrays.sort(names);
                break;
            default:
                System.out.println("Choice out of range. Using \"Full Class\" option.");
        }

        // Reading out new (or old, if chosen) list of students to use. Then duplicating array to randomize.
        // We also create a randomized int array to reference in printing. We first instantiate the array as
        // an int array of length 0: then, depending on the choice of the user, we change it's length to be
        // 16 or 32.
        String namesToRandomize[];
        int referencePos[] = new int[0];
        if (choice != 3) {
            namesToRandomize = new String[16];
            referencePos = new int[16];
            for (int i = 0; i <= 15; i++) {
                namesToRandomize[i] = namesToPullFrom[i];
                referencePos[i] = i;
            }
            randomizeArray(referencePos);
        } else {
            namesToRandomize = new String[32];
            referencePos = new int [32];
            for (int i = 0; i <= 31; i++) {
                namesToRandomize[i] = names[i];
                referencePos[i] = i;
            }
            randomizeArray(referencePos);
        }

        System.out.println();
        for (int i = 0; i <= referencePos.length - 1; i++) {

        }


    }

    // Method to separate the names, based on original names list and desired block num.
    private static String[] separateNames(String[] n, String[] np, char block) {
        String nameChecked;
        char blockNum;
        int compareInt = 0;
        int currentPos = 0;
        for (int i = 0; i < 32; i++) {
            nameChecked = n[i];
            blockNum = nameChecked.charAt(0);
            compareInt = Character.compare(blockNum, block);
            if(compareInt == 0) {
                np[currentPos] = n[i];
                currentPos++;
            }
        }
        Arrays.sort(np);
        return np;
    }

    /**
     * Code from method java.util.Collections.shuffle();
     * Slightly modified
     */

    private static void swap(int[] n, int i, int j) {
        int temp = n[i];
        n[i] = n[j];
        n[j] = temp;
    }

    private static int[] randomizeArray(int[] array) {

        Random random = new Random();

        if (random == null) random = new Random();
        int count = array.length;
        for (int i = count; i > 1; i--) {
            swap(array, i - 1, random.nextInt(i));
        }

        return array;
    }
}
