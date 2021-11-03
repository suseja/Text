package text;

public class Text {

    private int characters;
    private int numberOfRows;
    private boolean userTypedStop;

    public Text(int myCharacters, int myNumberOfRows) {

        characters = myCharacters;
        numberOfRows = myNumberOfRows;
    }

    public int getCharacters() {

        return characters;
    }

    public int getNumberOfRows() {

        return numberOfRows;
    }

    public void countCharacters(String inputText) {

        characters += inputText.length();
    }

    public void addOneRow() {

        numberOfRows += 1;
    }

    public void addTextline(String textline) {
        if (textline.contains("stop")) {
            userTypedStop = true;
        } else {
            addOneRow();
            countCharacters(textline);
        }
    }

    public boolean lastLineContainedStop() {
        return userTypedStop;
    }
}
