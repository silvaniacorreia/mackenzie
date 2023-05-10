#Faça um programa modularizados em Python, para resolver um problema usando listas. 

#O programa deve ter as seguintes funções:

#- entrada_carro(): faz a entrada do modelo de 4 carros via teclado (o usuário irá digitar o modelo de 4 carros),

#- entrada_consumo(): faz a entrada de um número inteiro que é o consumo (em litros) de cada modelo de carro por quilometro 
#(o usuário digita o consumo correspondente a cada carro),

#- economico(): retorna o modelo do carro mais econômico. Observe que o modelo do carro e seu consumo estará na mesma posição na lista, 
#porém em vetores diferentes (carro e consumo).

#A entrada de dados deve ser feita da seguinte forma:

#- O usuário irá digitar o modelo de cada um dos 4 carros, linha por linha em seguida

#- O usuário irá digitar o consumo de cada um dos 4 carros, linha por linha.

#O programa irá apresentar na tela o modelo do carro que tiver o menor valor de consumo.

carros = []
consumos = []

def entrada_carro():    
    for i in range (4):
        marca = input("Marca: ")
        carros.append(marca)

    return carros

def entrada_consumo():    
    for j in range (4):
        consumo = int(input("Consumo: "))
        consumos.append(consumo)

    return consumos
    
def economico():
    menor = 0
    for k in range (1, 4):
        if consumos[k] < consumos[menor]:
            menor = k 

    return carros[menor]
    
def main():
    entrada_carro()
    entrada_consumo()
    print(economico())
    
main()
