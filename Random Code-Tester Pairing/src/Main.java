import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Establish scanner and objects used for reading text. Array to hold names as well.
        Scanner sc = new Scanner(System.in);
        String names[] = new String[32];
        int blockNums[] = new int[32];
        File nameFile;
        Scanner reply;

        // Assigns the strings from each line into each part of the array.
        try {
            nameFile = new File("src/Sophomore.txt");
            reply = new Scanner(nameFile);
            reply.useDelimiter(",");
            for (int i = 0; i < 32; i++) {
                blockNums[i] = Integer.parseInt(reply.next());
                names[i] = reply.next();
                //System.out.println(names[i]);
                System.out.printf("%d %s", blockNums[i], names[i]);
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }


    /*
        int pulledFrom[] = new int[32];

        System.out.println("How do you want to assign and organize the testers? \nBy Full Class (1), Block 1 (2) or Block 2(3)? ");
        int choice = sc.nextInt();

        String namesToPullFrom[] = new String[16];
        char blockOne = 1;
        char blockTwo = 2;
        String nameChecked;
        char blockNum;
        int compare = 0;
        switch(choice) {
            case 1:
                System.out.println("Array will stay the same.");
                break;
            case 2:
                //seperateNames(names, namesToPullFrom, blockOne);
                for (int i = 0; i < 32; i++) {
                    nameChecked = names[i];
                    blockNum = nameChecked.charAt(0);
                    compare = blockNum.compareTo(blockOne);
                    if(compare == 0) {
                        namesToPullFrom[i] = names[i];
                    }
                    System.out.println(namesToPullFrom[i]);
                }
                break;
            case 3:
                //seperateNames(names, namesToPullFrom, blockTwo);
                for (int i = 0; i < 32; i++) {
                    nameChecked = names[i];
                    blockNum = nameChecked.charAt(0);
                    compare = blockNum.compareTo(blockTwo);
                    if(compare == 0) {
                        namesToPullFrom[i] = names[i];
                    }
                    System.out.println(namesToPullFrom[i]);
                }
                break;
            default:
                System.out.println("Choice out of range. Using \"Full Class\" option.");
        }

        // Secondary array check
        /*
        for(int i = 0; i <= 15; i++) {
            System.out.println(namesToPullFrom[i]);
        }
        */


    }
    /*
    private static String[] seperateNames(String[] n, String[] np, char block) {
        String nameChecked;
        char blockNum;
        int compare = 0;
        for (int i = 0; i < 32; i++) {
            nameChecked = n[i];
            blockNum = nameChecked.charAt(0);
            compare = blockNum.compareTo(block);
            if(compare == 0) {
                np[i] = n[i];
            }
            System.out.println(np[i]);
        }
        return np;
    }
     */
}
