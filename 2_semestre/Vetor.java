/* Foi solicitado a um programador que escrevesse um programa em Java para preencher um vetor com dez números inteiros digitados pelo usuário. 
Depois, o programa deveria colocar em outro vetor somente os números positivos do vetor de entrada e apresentá-los.
Nesta questão, escreva o método chamado vetor_positivos que está faltando no programa. */

import java.util.Scanner;
public class Vetor {
    public static int vetor_positivos(int[] vet, int[] positivo){
        int count = 0;
        for (int i=0; i<vet.length;i++){
            if (vet[i] > 0){
                positivo[count] = vet[i];
                    count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int []vet = new int[10];
        int []positivo = new int[10];
        int x=0;
        Scanner input = new Scanner(System.in);
        for (int i=0; i<vet.length;i++){
            vet[i]= input.nextInt();
        }
        x = vetor_positivos(vet, positivo);
        for (int i=0; i<x; i++){
            System.out.println(positivo[i]);
        }
    }
    
}
