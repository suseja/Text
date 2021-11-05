package text;

import java.util.Scanner;

public class MyText {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Text myText = new Text(0, 0);

        System.out.println("Please enter your text. Print 'stop' when you want the program to end. ");
        /*
        while (true) {
            String nextLine = scan.nextLine();

            myText.addTextline(nextLine);

            boolean userHasTypedStop = myText.lastLineContainedStop();
            if (userHasTypedStop) break;
        }
        */

        // condition is checked after 1 loop iteration
        do {
            String nextLine = scan.nextLine();
            myText.addTextline(nextLine);
        } while (!myText.lastLineContainedStop());
        
        System.out.println("Number of characters: " + myText.getCharacters());
        System.out.println("Number of rows: " + myText.getNumberOfRows());
    }
}
