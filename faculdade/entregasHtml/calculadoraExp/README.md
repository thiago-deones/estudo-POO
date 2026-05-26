# calculadoraExp

Projeto de estudo (POO) para uma calculadora de expressões aritméticas.

## Descrição
Implementação simples para avaliar expressões (ex.: 1 + 2 * (3 - 4/2)). Código em Java organizado para fins didáticos.

## Estrutura sugerida
- src/main/java/... — código-fonte
- src/test/java/... — testes unitários
- README.md — este arquivo

## Requisitos
- JDK 11+ ou conforme a versão do projeto
- IDE: IntelliJ IDEA (recomendado) ou build tool: Maven/Gradle (opcional)

## Como executar
1. Abrir o projeto na IDE e executar a classe `Main` (ou equivalente).
2. Ou, se usar Maven/Gradle:
    - Maven: `mvn clean install` e `mvn exec:java -Dexec.mainClass="seu.pacote.Main"`
    - Gradle: `./gradlew run` (configurar `application.mainClass`)

## Exemplos de uso
- Entrada: `2 + 3 * 4`
- Saída esperada: `14`

- Entrada: `(1 + 2) ^ 2` (dependendo do suporte a operadores)
- Saída esperada: `9`

## Observações
- Ajuste instruções de build/exec conforme a organização real do projeto.
- Acrescente testes unitários para validar precedência de operadores e tratamento de erros.

## Licença
Arquivo com licença MIT (opcional).