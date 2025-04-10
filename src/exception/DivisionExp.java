package exception;

public class DivisionExp {

    public static int divideNumbers(int num1, int num2) {
        try {
            if (num2 == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
            return 0;        }
        }

    public static void main(String[] args) {
        System.out.println(divideNumbers(10, 2)); 
        System.out.println(divideNumbers(10, 0)); 
     }
}
