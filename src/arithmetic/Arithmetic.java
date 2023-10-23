/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic {
    public static void main(String[] args) {
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);
        
        // Prompt the user for the operation
        System.out.println("Enter arithmetic operation to Perform (PLUS, MINUS, TIMES, DIVIDE): ");
        String operationStr = in.next().toUpperCase();
        ArithmeticOperation operation = ArithmeticOperation.valueOf(operationStr);
        
        // Input the numbers
        System.out.print("Enter the first number: ");
        double m = in.nextDouble();
        System.out.print("Enter the second number: ");
        double n = in.nextDouble();
        
        // Calculate and print the result
        double result = r.calculate(m, n, operation);
        System.out.println("Result: " + result);
    }
}
