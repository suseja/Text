package text;

public class Text {

    private int characters;
    private int numberOfRows;
    private boolean userTypedStop;

    public Text(int myCharacters, int numberOfRows) {
        characters = myCharacters;
        numberOfRows = 0;
    }

    public int getCharacters() {

        return characters;
    }

    public int getNumberOfRows() {

        return numberOfRows;
    }

    public void addOneRow() {

        numberOfRows += 1;
    }

    public void countCharacters(String inputText) {

        characters += inputText.length();
    }

    public boolean lastLineContainedStop() {
        return userTypedStop;
    }
}
