public class Calculator {
  private int result;

  public void add(int ... params) {
    for (Integer param : params) {
      this.result += param;
    }
  }

  public void deduct(int first, int second) {
    this.result = first - second;
  }

  public void multiplication(int ... params) {
    this.result = 1;
    for (Integer param : params) {
      this.result *= param;
    }
  }

  public void divide(int first, int second) {
    this.result = first / second;  
  }

  public int getResult() {
    return this.result;
  }

  public void clearResult() {
    this.result = 0;
  }
}
