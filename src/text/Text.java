package text;

public class Text {

    private int characters;
    private int numberOfRows;

    public Text(int myCharacters, int myLines) {
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
}
