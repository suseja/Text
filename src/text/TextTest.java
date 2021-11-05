package text;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TextTest {

    @Test
    public void testGetCharacters() {

        Text newText = new Text(0, 0);

        int actual = newText.getCharacters();

        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void testCountCharacters() {

        Text newText = new Text(0, 0);

        newText.countCharacters("hejhej");
        int actual = newText.getCharacters();

        int expected = 6;

        assertEquals(expected, actual);

    }

    @Test
    public void testCountCharactersSentence() {

        Text newText = new Text(0, 0);

        newText.countCharacters("Today is Saturday");
        int actual = newText.getCharacters();

        int expected = 17;

        assertEquals(expected, actual);
    }


    @Test

    public void testGetNumberOfRows() {

        Text newText = new Text(0, 0);

        int actual = newText.getNumberOfRows();

        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testAddOneRow() {

        Text newText = new Text(0, 0);

        newText.addOneRow();
        int actual = newText.getNumberOfRows();

        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void testCount3Rows() {

        Text newText = new Text(0, 0);
        newText.countCharacters("hejsan hej");
        newText.addOneRow();
        newText.countCharacters("hehej");
        newText.addOneRow();
        newText.countCharacters("hejsan hej!!");
        newText.addOneRow();
        int actual = newText.getNumberOfRows();

        int expected = 3;

        assertEquals(expected, actual);

    }

    @Test
    public void testStopTrue() {

        Text newText = new Text(0, 0);

        newText.addTextline("stop");
        boolean actual = newText.lastLineContainedStop();

        boolean expected = true;

        assertEquals(expected, actual);

    }

    @Test
    public void testStopFalse() {

        Text newText = new Text(0, 0);

        newText.addTextline("other");
        boolean actual = newText.lastLineContainedStop();

        boolean expected = false;

        assertEquals(expected, actual);

    }
    
}