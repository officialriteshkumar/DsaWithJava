import java.util.*;
public class ComplexityComparison {
    public static void main(String[] args) {
        int[] inputSizes = {10, 100, 1000, 10000};
        for (int n : inputSizes) {
            System.out.println("Input size: " + n);
            System.out.println("O(nn): " + functionNN(n));
            System.out.println("O(n!): " + functionNF(n));
            System.out.println("O(n^3): " + functionN3(n));
            System.out.println("O(n^2): " + functionN2(n));
            System.out.println("O(n log(n)): " + functionNLogN(n));
            System.out.println("O(n log(log(n))): " + functionNLogLogN(n));
            System.out.println("O(n): " + functionN(n));
            System.out.println("O(sqrt(n)): " + functionSqrtN(n));
            System.out.println("O(log(n)): " + functionLogN(n));
            System.out.println("O(1): " + function1());
            System.out.println();
        }
    }
    public static int functionNN(int n) {
        return n * n;
    }

    public static int functionNF(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int functionN3(int n) {
        return n * n * n;
    }

    public static int functionN2(int n) {
        return n * n;
    }

    public static int functionNLogN(int n) {
        return (int) (n * Math.log(n));
    }

    public static int functionNLogLogN(int n) {
        return (int) (n * Math.log(Math.log(n)));
    }

    public static int functionN(int n) {
        return n;
    }

    public static int functionSqrtN(int n) {
        return (int) Math.sqrt(n);
    }

    public static int functionLogN(int n) {
        return (int) Math.log(n);
    }

    public static int function1() {
        return 1;
    }
}

