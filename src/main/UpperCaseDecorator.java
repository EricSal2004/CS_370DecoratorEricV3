package main;

public class UpperCaseDecorator extends TextDecorator{
  public UpperCaseDecorator(TextFormatter formatter){
    super(formatter);
  }

  @Override
  public String format(String word){
    return super.format(word).toUpperCase();
  }
}