#teste de carteira

idade = input("Qual a sua idade: ")

teste_idade = int(idade)

if teste_idade >= 18:
    print("Voce é maior de idade")
else:
    print("Você é menor de idade")

#saldo

saldo = 2000.0
retirada = float(input("Qual a quantia que voce deseja sacar"))

if retirada > saldo:
    print("Saldo inferior")
elif retirada <= saldo:
    saldo-=retirada
    print(saldo)
else:
    print("digite valor valido")