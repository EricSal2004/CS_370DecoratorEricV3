package test;

import org.junit.Test;
import static org.junit.Assert.*;

import main.java.PlainText;
import main.java.TextFormatter;
import main.java.TrimDecorator;
import main.java.UpperCaseDecorator;

public class TextFormatterTest {
    @Test
    public void testPlainText() {
        TextFormatter formatter = new PlainText();
        assertEquals(" Hello World ", formatter.format(" Hello World "));
    }

    @Test
    public void testUpperCaseDecorator() {
        TextFormatter formatter = new UpperCaseDecorator(new PlainText());
        assertEquals(" HELLO WORLD ", formatter.format(" Hello World "));
    }

    @Test
    public void testTrimDecorator() {
        TextFormatter formatter = new TrimDecorator(new PlainText());
        assertEquals("Hello World", formatter.format(" Hello World "));
    }

    @Test
    public void testUpperCaseAndTrimDecorator() {
        TextFormatter formatter = new UpperCaseDecorator(new TrimDecorator(new PlainText()));
        assertEquals("HELLO WORLD", formatter.format(" Hello World "));
    }
}
