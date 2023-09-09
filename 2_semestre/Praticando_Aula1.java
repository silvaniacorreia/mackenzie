/* Na videoaula, o professor fez o programa, mas ficou faltando fazer as operações de multiplicação e divisão.

Inclua no código, na linha 26, a instrução para realizar a multiplicação dos dois números de entrada e apresentar o resultado, com a mensagem:

Multiplicação = <<valor resultante>>

 */
/*Na videoaula, o professor fez o programa, mas ficou faltando fazer as operações de multiplicação e divisão.

Inclua no código, a partir da linha 29 as instruções para realizar a divisão dos dois números de entrada. Caso o segundo número de entrada seja igual a zero, a divisão não deve ser realizada e o programa deve emitir a mensagem NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO, caso contrário apresentar o resultado, com a mensagem:

Divisão = <<valor resultante>>

Observação: A divisão de um número por zero provocaria um erro no programa.

Lembre-se de exibir a mensagem exatamente igual ao formato apresentado acima.

 */

import java.util.Scanner;
public class Praticando_Aula1 {
    public static void main(String[] args) {
        double n1, n2;
        int op;
        Scanner entrada = new Scanner (System.in);
        while (true){
         op = entrada.nextInt();
            if (op==5)                                          //sai do while com a opção 5
                break;
            if (op<1 || op>6){                                 //não executa o trecho linha 18 a 36
                System.out.println("Opção do menu inválida");  //e volta ao while  
                continue;
            }
            n1 = entrada.nextDouble();
            n2 = entrada.nextDouble();
            switch (op){
                case 1:                
                System.out.println("Soma = " + (n1+n2));
                break;
            case 2:
                System.out.println("Subtração = " + (n1-n2));
                break;
            case 3:
                System.out.println("Multiplicação = " + (n1*n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO");
                    continue;
                }
                System.out.println("Divisão = " + (n1/n2));
                break;                
            default:
                System.out.println("Opção inválida");
            }
        }

        entrada.close();
    }
}
