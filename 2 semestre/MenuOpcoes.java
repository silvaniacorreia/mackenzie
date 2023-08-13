/* Faça um programa em Java que receba de entrada:

- a opção desejada pelo usuário (conforme menu abaixo);

- dois números reais.

Calcule e mostre o resultado da operação solicitada pelo usuário, em função da opção desejada.

Menu de opções:


Opção	Operação
1	média entre os números digitados
2	diferença do maior pelo menor
3	multiplicação dos números digitados
4	divisão do primeiro pelo segundo
5	sair
Observações:

- Cada vez que o usuário escolher uma opção do menu válida, serão solicitados os dois números de entrada, e o programa apresentará o resultado.

- Na Opção 2, não deverá ser apresentado um valor de saída negativo, já que o programa irá subtrair o maior número de entrada pelo menor número de entrada.

- Na Opção 4, caso o segundo número de entrada seja igual a zero, emitir mensagem NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO.

- O menu será repetido até que o usuário escolha a Opção 5.

- Caso o usuário escolha uma opção do menu inválida, o programa deverá emitir a mensagem OPÇÃO INVÁLIDA e apresentar o menu novamente. */

import java.util.Scanner;
public class MenuOpcoes {
    public static void main(String[] args) {
        double n1, n2;
        int operacao;

        Scanner entrada = new Scanner (System.in);

        while(true){
            operacao = entrada.nextInt();
            if (operacao == 5){                                          
                break;
            }
            if (operacao < 1 || operacao > 6){                                 
                System.out.println("OPÇÃO INVÁLIDA");  
                continue;
            }
            n1 = entrada.nextDouble();
            n2 = entrada.nextDouble();
            switch (operacao) {
                case 1:
                    System.out.println((n1 + n2) / 2);
                    break;

                case 2: 
                    if (n1 >= n2){
                        System.out.println(n1 - n2);
                        break;
                    }
                    else{
                        System.out.println(n2 - n1);
                        break;
                    }

                case 3:
                    System.out.println(n1*n2);
                    break;

                case 4: 
                    if (n2 == 0) {
                        System.out.println("NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO");
                        continue;
                    }
                    System.out.println(n1 / n2);
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
        entrada.close();
    }
}
