function calcularNivel(vitorias, derrotas) {
    // Calcula o saldo de vitórias
    const saldoVitorias = vitorias - derrotas;
  
    // Determina o nível com base no saldo de vitórias
    let ranque = "Ferro";
    if (vitorias >= 10 && vitorias <= 20) {
      ranque = "Bronze";
    } else if (vitorias > 20 && vitorias <= 50) {
      ranque = "Prata";
    } else if (vitorias > 50 && vitorias <= 80) {
      ranque = "Ouro";
    } else if (vitorias > 80 && vitorias <= 90) {
      ranque = "Diamante";
    } else if (vitorias > 90 && vitorias <= 100) {
      ranque = "Lendário";
    } else if (vitorias >= 101) {
      ranque = "Imortal";
    }
  
    return { saldoVitorias, ranque };
  }
  
  let Heroi = "Martin"
  let vitorias = 62;
  let derrotas = 16;
  
  const resultado = calcularNivel(vitorias, derrotas);
  
  // Exibe a mensagem
  console.log(`O Herói ${Heroi}, tem saldo de ${resultado.saldoVitorias}, e está no ranquei ${resultado.ranque}!`);
  