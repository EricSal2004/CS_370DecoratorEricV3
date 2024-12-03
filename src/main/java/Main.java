package main.java;

public class Main {
  public static void main(String[] args) {
    TextFormatter formatter = new PlainText();
    System.out.println("Plain text: " + formatter.format(" Hello World"));

    TextFormatter upperCaseFormatter = new UpperCaseDecorator(new PlainText());
    System.out.println("Uppercase Text: " + upperCaseFormatter.format(" Hello World "));

    TextFormatter trimmedFormatter = new TrimDecorator(new PlainText());
    System.out.println("Trimmed Text: " + trimmedFormatter.format(" Hello World "));

  }


}