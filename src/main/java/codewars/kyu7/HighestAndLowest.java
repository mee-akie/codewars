package codewars.kyu7;

public class HighestAndLowest {
  public static String highAndLow(String numbers) {
    String numberList[] = numbers.split(" ");
    int higherNumber = Integer.parseInt(numberList[0]);
    int lowerNumber = Integer.parseInt(numberList[0]);

    for(String number : numberList) {
      int currentNumber = Integer.parseInt(number);
      
      if (currentNumber > higherNumber) {
        higherNumber = currentNumber;
      }
      
      if (currentNumber < lowerNumber) {
        lowerNumber = currentNumber;
      }
    }

    return higherNumber + " " + lowerNumber;
  }
}