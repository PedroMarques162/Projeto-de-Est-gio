package controller;
import java.util.Scanner;

public class ContadorDeA {

    public static void main(String[] args) {
        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        // Verificação de existência e contagem de 'a' (maiúscula ou minúscula)
        int contador = 0;
        for (int i = 0; i < input.length(); i++) {
            char caractere = input.charAt(i);
            if (caractere == 'a' || caractere == 'A') {
                contador++;
            }
        }

        // Resultado
        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }

        scanner.close();
    }
}