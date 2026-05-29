def sacar(valor):
    saldo = 500

    if saldo >= valor:
        print("Valor sacado!")
    else:
        print("Valor superior ao saldo")

def depositar(deposito):
    saldo = 500

    if deposito > 0:
        saldo += deposito
        print(saldo)


sacar(100)

sacar(550)

depositar(1000)