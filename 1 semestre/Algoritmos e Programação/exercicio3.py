# Faça um programa em Python que resolva o seguinte problema: 
# Um concurso possui um prêmio no montante de R$ 780.000,00 para dividir entre três ganhadores da seguinte forma: 
# - o primeiro ganhador receberá 46% do prêmio; 
# - o segundo ganhador receberá 32% do prêmio; 
# - o terceiro ganhador receberá o restante do prêmio. 
# Calcule e mostre o valor do prêmio de cada ganhador. 

winner1 = 0.46 * 780000
winner2 = 0.32 * 780000
winner3 = 780000 - (winner1 + winner2)
print('Primeiro ganhador: %.1f' %winner1)
print('Segundo ganhador: %.1f' %winner2)
print('Terceiro ganhador: %.1f' %winner3)