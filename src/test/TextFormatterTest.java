package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import main.PlainText;
import main.TextFormatter;
import main.TrimDecorator;
import main.UpperCaseDecorator;

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
