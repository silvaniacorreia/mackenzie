#Faça um programa em Python para resolver o seguinte problema:
#O programa deve receber um número inteiro, digitado pelo usuário, e apresentar uma mensagem:

#- se o número que o usuário digitou for divisível por 3 e por 5 ao mesmo tempo, a mensagem será: 
#O número é divisível por 3 e 5

#- se o número que o usuário digitou não for divisível por 3 e por 5 ao mesmo tempo, a mensagem será: 
#O número não é divisível por 3 e 5

#Lembre-se de colocar as mensagens, exatamente como estão indicadas acima, no enunciado.

number = int(input("Digite um número inteiro: "))
if number % 5 == 0 and number % 3 == 0:
    print("O número é divisível por 3 e 5")
else:
    print("O número não é divisível por 3 e 5")

