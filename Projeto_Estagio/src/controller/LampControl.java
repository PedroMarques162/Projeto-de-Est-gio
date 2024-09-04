package controller;

public class LampControl {

    // Método para simular a configuração das lâmpadas e quais interruptores controlam quais lâmpadas
    private static String[] setupLampsAndSwitches() {
        // Cria uma lista com três lâmpadas
        String[] lamps = {"Lâmpada 1", "Lâmpada 2", "Lâmpada 3"};
        // Embaralha aleatoriamente a posição das lâmpadas
        java.util.Collections.shuffle(java.util.Arrays.asList(lamps));
        return lamps;
    }

    // Método para imprimir o estado das lâmpadas
    private static void printLampsState(String[] lamps, boolean[] lampStates) {
        for (int i = 0; i < lamps.length; i++) {
            String state = lampStates[i] ? "acesa" : "apagada";
            System.out.println(lamps[i] + " está " + state);
        }
    }

    // Método para encontrar qual interruptor controla cada lâmpada
    private static void findLampsControl(String[] lamps) {
        // Simula a ação de ligar e desligar interruptores
        System.out.println("Inicialmente, todas as lâmpadas estão apagadas.");

        // 1. Liga o Interruptor A e deixa ligado por um tempo (simula 15 minutos)
        System.out.println("\nLigue o Interruptor A e espere 15 minutos...");
        try {
            Thread.sleep(2000); // Simulação de espera (2 segundos para simplificar)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 2. Desliga o Interruptor A e liga o Interruptor B
        System.out.println("\nDesliga o Interruptor A e liga o Interruptor B.");

        // Simula o estado das lâmpadas após as ações
        boolean[] lampStates = {true, false, false}; // Inicialmente, apenas uma lâmpada está acesa
        // Simula que a lâmpada que estava ligada por mais tempo está quente
        int hotLampIndex = 0; // A lâmpada que estava ligada por 15 minutos
        lampStates[hotLampIndex] = true;
        lampStates[1] = true; // A lâmpada que está acesa devido ao Interruptor B

        // Impressão dos estados finais das lâmpadas
        System.out.println("\nEstados das lâmpadas:");
        printLampsState(lamps, lampStates);
        System.out.println("\nA lâmpada quente e apagada é controlada pelo Interruptor A.");
        System.out.println("A lâmpada acesa é controlada pelo Interruptor B.");
        System.out.println("A lâmpada apagada e fria é controlada pelo Interruptor C.");
    }

    public static void main(String[] args) {
        // Configura lâmpadas e interruptores aleatoriamente
        String[] lamps = setupLampsAndSwitches();

        // Encontra e imprime qual interruptor controla cada lâmpada
        findLampsControl(lamps);
    }
}