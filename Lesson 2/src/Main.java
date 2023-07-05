import math.operations.SimpleMathOperations;

public class Main {

    public static void main(String[] args) {
        int first = 4;
        int second = 13;

        int sumResult = SimpleMathOperations.sum(first, second);
        int subtractionResult = SimpleMathOperations.subtraction(first, second);

        System.out.println(sumResult);
        System.out.println(subtractionResult);
    }
}
