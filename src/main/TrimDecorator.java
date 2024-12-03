package main;

public class TrimDecorator extends TextDecorator {
  public TrimDecorator(TextFormatter formatter){
    super(formatter);
  }

  @Override
  public String format(String word){
    return super.format(word).trim();
  }
}