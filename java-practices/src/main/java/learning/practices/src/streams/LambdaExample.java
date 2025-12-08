package learning.practices.src.streams;

@FunctionalInterface
interface Operation {
    int apply(int a, int b);
}

public class LambdaExample {

    // Method returning a lambda
    public static Operation operate() {
        return (i, j) -> i + j;   // lambda expression
    }

    public static void main(String[] args) {
        // Get the lambda
        Operation op = operate();

        // Use the lambda
        int result = op.apply(10, 20);

        System.out.println("Result = " + result);  // Output: 30
    }
}
