import java.util.Scanner;

// Класс для запуска калькулятора, поддерживает ввод пользователя

public class InteractRunner {
  public static void main(String arg[]) {
    Scanner reader = new Scanner(System.in);
    try {
      Calculator calc = new Calculator();
      String exit = "no";
      while (!exit.equals("yes")) {
        System.out.println("Enter operator: ");
        String operator = reader.next();
        System.out.println("Enter first arg: ");
        String first = reader.next();
        System.out.println("Enter second arg: ");
        String second = reader.next();
        switch (operator) {
          case "+":
            calc.add(Integer.valueOf(first), Integer.valueOf(second));
            break;
          case "-":
            calc.deduct(Integer.valueOf(first), Integer.valueOf(second));
            break;
          case "*":
            calc.multiplication(Integer.valueOf(first), Integer.valueOf(second));
            break;
          case "/":
            calc.divide(Integer.valueOf(first), Integer.valueOf(second));
            break;
          default:
            break;
        }
        System.out.println("Result: "+ calc.getResult());
        calc.clearResult();
        System.out.println("Exit? yes/no");
        exit = reader.next();
      }
    } finally {
      reader.close();
    }
  }
}
