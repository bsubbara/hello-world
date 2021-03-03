
//Bhavani Subbaraman
//test

public class GitDemo {

  private int previousNumber;
  private int reverseNumber;
  
  public GitDemo() {
    previousNumber = 1;
  }
  
  private int addNumber(int num) {
    return (previousNumber + num);
  }
  
  private int reverseNumber(int num) {
    int newNumber = 0;
    while (num != 0) {
      lastDigit = num % 10;
      newNumber = (newNumber * 10) + lastDigit;
      num = num/10;
    }
    reverseNum = newNumber;
    return reverseNum;
  }
  
}
