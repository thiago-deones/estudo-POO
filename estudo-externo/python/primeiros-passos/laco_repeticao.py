def texto(palavra):
    palavra = input(palavra)
    VOGAIS = "AEIOU"

    #percorrendo a string 
    for letra in palavra:
        if letra.upper() in VOGAIS:
            print(letra, end=", ")

    print()


#texto("Primeira palavra: ")
#texto("Segunda palavra: ")


for numero in range(5,10):
    print(numero, end = " |")

print()

for numero in range(10):
    print(numero, end = " |")

print()

#para fazer a tabuada
for numero in range(0, 51, 5):
    print(numero, end=" ")

