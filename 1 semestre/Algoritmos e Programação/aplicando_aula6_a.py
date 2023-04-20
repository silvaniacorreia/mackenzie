#Escreva um programa em Python que leia um número inteiro, entre 0 e 10 e mostre a tabuada deste número multiplicado de 1 até 10.

#O valor de entrada dever ser validado, pois o programa somente aceitará números entre 0 e 10 (inclusive). 
# Caso o valor de entrada esteja fora do intervalo, o programa emitirá a mensagem VALOR INVÁLIDO e solicitará a entrada deste dado até que ela seja válida.

#Com a entrada de dados válida, o programa irá mostrar a tabuada do número digitado no formato do caso de teste.

number = int(input())

while number < 0 or number > 10:
    print("VALOR INVÁLIDO")
    number = int(input())

for multiplier in range (1,11):
    print(f"{number}x{multiplier}={number*multiplier}")