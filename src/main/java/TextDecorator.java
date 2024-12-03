package main.java;

public abstract class TextDecorator implements TextFormatter {
  protected TextFormatter formatter;

  public TextDecorator(TextFormatter formatter){
    this.formatter = formatter;
  }

  public String format(String word){
    return formatter.format(word);
  }
}