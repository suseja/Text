package text;

import java.util.Scanner;

public class MyText {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Text myText = new Text(0,0);

        while (true) {
            String nextLine = scan.nextLine();
            //räknar vi antalet tecken i myText
            myText.addTextline(nextLine);

            boolean userHasTypedStop = myText.lastLineContainedStop();
            if (userHasTypedStop) break;
        }

        System.out.println("Number of rows: " + myText.getNumberOfRows());
        System.out.println("Number of characters: " + myText.getCharacters());
    }
}
