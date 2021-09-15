import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Establish scanner and objects used for reading text. Array to hold names as well.
        Scanner sc = new Scanner(System.in);
        String names[] = new String[32];
        File nameFile;
        Scanner reply;

        // Assigns the strings from each line into each part of the array.
        try {
            nameFile = new File("src/Sophomore.txt");
            reply = new Scanner(nameFile);
            for (int i = 0; i < 32; i++) {
                names[i] = reply.nextLine();
                // System.out.println(names[i]);
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }



        int pulledFrom[] = new int[32];

        System.out.println("How do you want to assign and organize the testers? \nBy Full Class (1), Block 1 (2) or Block 2(3)? ");
        int choice = sc.nextInt();

        String namesToPullFrom[] = new String[16];
        String nameChecked;
        char blockNum;
        char blockOne = 1;
        char blockTwo = 2;
        switch(choice) {
            case 1:
                System.out.println("Array will stay the same.");
            case 2:
                for (int i = 0; i < 32; i++) {
                    nameChecked = names[i];
                    blockNum = nameChecked.charAt(0);

                    if((Character.compare(blockNum, blockOne))) {
                        namesToPullFrom[i] = names[i];
                        // System.out.println(namesToPullFrom[i]);
                    }
                }
            case 3:
                for (int i = 0; i < 32; i++) {

                }
            default:
                System.out.println("Choice out of range. Using \"Full Class\" option.");
        }

        // Secondary array


    }
}
