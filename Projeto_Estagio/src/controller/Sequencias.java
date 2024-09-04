package controller;

public class Sequencias {

    // a) Sequência de números ímpares
    public static int nextOddNumber(int[] sequence) {
        return sequence[sequence.length - 1] + 2;
    }

    // b) Sequência geométrica com razão 2
    public static int nextGeometricNumber(int[] sequence) {
        return sequence[sequence.length - 1] * 2;
    }

    // c) Sequência de quadrados perfeitos
    public static int nextSquareNumber(int[] sequence) {
        int last = sequence[sequence.length - 1];
        int n = (int) Math.sqrt(last) + 1;
        return n * n;
    }

    // d) Sequência de quadrados perfeitos de números pares
    public static int nextEvenSquare(int[] sequence) {
        int last = sequence[sequence.length - 1];
        int n = (int) Math.sqrt(last) + 2;
        return n * n;
    }

    // e) Sequência de Fibonacci
    public static int nextFibonacciNumber(int[] sequence) {
        return sequence[sequence.length - 1] + sequence[sequence.length - 2];
    }

    // f) Sequência com padrões variados
    public static int nextSequenceF(int[] sequence) {
        return sequence[sequence.length - 1] + 1;
    }

    public static void main(String[] args) {
        // a) Sequência de números ímpares
        int[] sequenceA = {1, 3, 5, 7};
        System.out.println("a) Próximo elemento: " + nextOddNumber(sequenceA));

        // b) Sequência geométrica com razão 2
        int[] sequenceB = {2, 4, 8, 16, 32, 64};
        System.out.println("b) Próximo elemento: " + nextGeometricNumber(sequenceB));

        // c) Sequência de quadrados perfeitos
        int[] sequenceC = {0, 1, 4, 9, 16, 25, 36};
        System.out.println("c) Próximo elemento: " + nextSquareNumber(sequenceC));

        // d) Sequência de quadrados perfeitos de números pares
        int[] sequenceD = {4, 16, 36, 64};
        System.out.println("d) Próximo elemento: " + nextEvenSquare(sequenceD));

        // e) Sequência de Fibonacci
        int[] sequenceE = {1, 1, 2, 3, 5, 8};
        System.out.println("e) Próximo elemento: " + nextFibonacciNumber(sequenceE));

        // f) Sequência com padrões variados
        int[] sequenceF = {2, 10, 12, 16, 17, 18, 19};
        System.out.println("f) Próximo elemento: " + nextSequenceF(sequenceF));
    }
}