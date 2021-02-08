package calc;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        System.out.println("Enter the first integer digit, please.");
        double a = c.nextDouble();

        System.out.println("Enter the second integer digit, please.");
        double b = c.nextDouble();

        System.out.println("Enter the calculation method, please.\n" +
                "For Addition: +\n" +
                "For Subtraction: -\n" +
                "For Multiplication: *\n" +
                "For Division: /\n");
        char method = c.next().charAt(0);
        System.out.println("You entered " + a + " , " + b + " , " + method +" .");

        double result = 0;
            if(method == '+'){
                result = a+b;
            } else if(method == '-'){
                result = a-b;
            } else if(method == '*'){
                result = a*b;
            } else if(method == '/'){
                result = a/b;
            }
        System.out.println("Result is: " + result + ".");
        }
    }

