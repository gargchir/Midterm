/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

// Enum for arithmetic operations
enum ArithmeticOperation {
    PLUS, MINUS, TIMES, DIVIDE
}

public class ArithmeticBase {
    public double x, y;

    // Method to calculate based on the enum operation
    double calculate(double x, double y, ArithmeticOperation operation) {
        switch (operation) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                if (y != 0) {
                    return x / y;
                } else {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
}

