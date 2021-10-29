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

        Text newText = new Text(0,0);

        newText.countCharacters("hejhej");
        int actual = newText.getCharacters();

        int expected = 6;

        assertEquals(expected, actual);

    }

    @Test
    public void testGetNumberOfRows() {

        Text newText = new Text(0,0);

        int actual = newText.getNumberOfRows();

        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testCountLines() {

        Text newText = new Text(0,0);

        newText.addOneRow();
        int actual = newText.getNumberOfRows();

        int expected = 1;

        assertEquals(expected, actual);
    }
    @Test
    public void testCount3Lines() {

        Text newText = new Text(0,0);
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


}