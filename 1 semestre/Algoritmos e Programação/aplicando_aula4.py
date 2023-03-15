#Faça um programa em Python que, dada a idade de um atleta que será digitada pelo usuário, apresente a 
#mensagem da coluna CATEGORIA de acordo com a tabela abaixo, onde a categoria depende da idade de entrada. 
#Lembre-se de exibir a Categoria, exatamente como consta na tabela abaixo.

idade = int(input('Idade: '))

if idade < 5:
    print('NÃO TEM IDADE PARA SER ATLETA')
elif idade <= 7:
    print('INFANTIL A')
elif idade <= 10: 
    print('INFANTIL B')
elif idade <= 13:
    print('JUVENIL A')
elif idade <= 17:
    print('JUVENIL B')
else:
    print('SÊNIOR')