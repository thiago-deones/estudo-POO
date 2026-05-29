# Leitura do número de passos
quantidade_passos = int(input())

# Função para percorrer os passos e imprimir a mensagem
def percorrido(numero):
    for i in range(1, numero + 1):  # Loop do 1 até o número de passos
        if i == 1:
            print(f"Explorador: {i} passo")  # Para o primeiro passo
        else:
            print(f"Explorador: {i} passos")  # Para os passos subsequentes

# Validação da quantidade de passos
if quantidade_passos <= 0:
    print("Quantidade de passos inválida")  # Quando o número de passos for zero ou negativo
elif quantidade_passos == 0:
    print("Nenhum passo dado na floresta.")  # Quando for exatamente zero
else:
    percorrido(quantidade_passos)  # Chama a função se o número de passos for positivo
