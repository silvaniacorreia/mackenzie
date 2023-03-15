#Escreva um programa em Python que permita ao usuário digitar dois números 
# inteiros e exibir o resultado para cada uma das seguintes operações: 
# soma, subtração, multiplicação, divisão, divisão truncada, resto e exponenciação.

print('Digite dois números: ')
numero1 = int(input())
numero2 = int(input())

print(f'A soma é: {numero1 + numero2}')
print(f'A subtração é: {numero1 - numero2}')
print(f'A multiplicação é: {numero1 * numero2}')
print(f'A divisão é: {numero1 / numero2}')
print(f'A divisão truncada é: {numero1 // numero2}')
print(f'O resto é: {numero1 % numero2}')
print(f'A exponenciação é: {numero1 ** numero2}')