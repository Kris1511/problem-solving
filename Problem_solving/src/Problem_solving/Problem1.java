package Problem_solving;
import java.util.*;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add/sub/mul/div or + - * /): ");
        String operation = sc.next();

        Problem1 calc = new Problem1();
        double result = calc.calculate(a, b, operation);

        if (!Double.isNaN(result)) {
            System.out.println("Result = " + result);
        }

	}
	
	public double calculate(double a, double b, String operation) {
        double result = 0;

        switch (operation.toLowerCase()) {
            case "add":
            case "+":
                result = a + b;
                break;

            case "sub":
            case "-":
                result = a - b;
                break;

            case "mul":
            case "*":
                result = a * b;
                break;

            case "div":
            case "/":
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return Double.NaN; // Not a Number
                }
                break;

            default:
                System.out.println("Invalid operation type!");
                return Double.NaN;
        }

        return result;
    }

}
