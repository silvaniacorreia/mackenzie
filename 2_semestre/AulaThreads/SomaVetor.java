package AulaThreads;

// Após a aula, você deverá fazer e entregar um programa em Java, criando duas threads para somar os elementos de um vetor de inteiros de 100 posições. 

public class SomaVetor extends Thread {
    
    private static int soma = 0;
    private static int[] vetor = new int[100];

    private int inicio;
    private int fim;

    public SomaVetor(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public void run() {
        for (int i = inicio; i < fim; i++) {
            soma += vetor[i];
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            vetor[i] = i;
        }

        SomaVetor thread1 = new SomaVetor(0, 50);
        SomaVetor thread2 = new SomaVetor(50, 100);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Soma total: " + soma);
    }
}
