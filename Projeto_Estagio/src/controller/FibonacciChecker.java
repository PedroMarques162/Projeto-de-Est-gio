package controller;
import java.util.ArrayList;
import java.util.List;

public class FibonacciChecker {

    public static List<Integer> fibonacciSequence(int num) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(0);
        sequence.add(1);
        
        while (sequence.get(sequence.size() - 1) < num) {
            int nextValue = sequence.get(sequence.size() - 1) + sequence.get(sequence.size() - 2);
            sequence.add(nextValue);
        }
        
        return sequence;
    }

    public static String isFibonacciNumber(int num) {
        List<Integer> sequence = fibonacciSequence(num);
        if (sequence.contains(num)) {
            return "O número " + num + " pertence à sequência de Fibonacci.";
        } else {
            return "O número " + num + " não pertence à sequência de Fibonacci.";
        }
    }

    public static void main(String[] args) {
        int number = 21;  // Você pode alterar este número para testar outros
        System.out.println(isFibonacciNumber(number));
    }
}