/*
    Name: Xander Russell
    Lab: Random Coder-Testing Pairings
    Date: 10/8/21
 */

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
            referencePos = new int[32];
            for (int i = 0; i <= 31; i++) {
                namesToRandomize[i] = names[i];
                referencePos[i] = i;
            }
            randomizeArray(referencePos);
        }

        // Checks if you want to print it out by tester or by coder. Changes a string that gets printed based on
        // that input.
        System.out.println("Do you want to print out results by tester or by coder? 1/2");
        int choiceForPrint = sc.nextInt();
        String choiceString = "";
        String choiceStringOpposite = "";
        if (choice == 1) {
            choiceString = "Tester";
            choiceStringOpposite = "Coder";
        } else if (choice == 2){
            choiceString = "Coder";
            choiceStringOpposite = "Tester";
        } else {
            System.out.println("Invalid response. Printing by tester.");
            choiceString = "Tester";
            choiceStringOpposite = "Coder";
        }

        // Variables for printing out.
        String currentMainPrintOut = "";
        char currentMainBlockNum;
        String currentSecondaryPrintOut = "";
        char currentsecondaryBlockNum;

        // Header to table. Formats and uses the strings assigned based on choice.
        System.out.format("%38s", "By " + choiceString + "\n");
        System.out.format("%10s %20s %10s %20s %1s", "Block ", choiceString, "Block ", choiceStringOpposite, "\n");
        System.out.println("________________________________________________________________________________");

        // Printing out the table. Oh Lord.
        // We run a for loop based on the length of the array we are printing. Within, we check which array we
        // are using based on previous input from the user. We assign various strings values based on the value of
        // i, and the value in the reference int array at pos i. Then, we grab the block num from those strings and
        // strip the first two chars, the block num and the space. Then we print it out based on format.
        for (int i = 0; i <= referencePos.length - 1; i++) {
            if(choice != 3) {
                currentMainPrintOut = namesToPullFrom[i];
                currentSecondaryPrintOut = namesToRandomize[referencePos[i]];
            } else {
                currentMainPrintOut = names[i];
                currentSecondaryPrintOut = names[referencePos[i]];
            }
            currentMainBlockNum = currentMainPrintOut.charAt(0);
            currentMainPrintOut = removeFirstTwo(currentMainPrintOut);
            currentsecondaryBlockNum = currentSecondaryPrintOut.charAt(0);
            currentSecondaryPrintOut = removeFirstTwo(currentSecondaryPrintOut);
            System.out.format("%10s %20s %10s %20s", currentMainBlockNum, currentMainPrintOut, currentsecondaryBlockNum, currentSecondaryPrintOut + "\n");
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
            do {
                swap(array, i - 1, random.nextInt(i));
            } while (array[i - 1] == i - 1);
        }

        return array;
    }

    // Removes first 2 chars for print out
    private static String removeFirstTwo(String s){
        return s.substring(2);
    }
}
