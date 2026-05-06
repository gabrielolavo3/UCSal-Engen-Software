Algoritmo "soma"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Arthur Henrique Kronbauer 
// Descrição   : Ler 2 números e imprimi a soma! (função)
// Autor(a)    : Gabriel S. Olavo
// Data atual  : 22/02/2026

Var
// Seção de Declarações das variáveis 

primeiroNumero : real
segundoNumero : real
soma : real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

escreva("Informe o 1º número no console: ")
leia(primeiroNumero)
escreva("Informe o 2º número no console: ")
leia(segundoNumero)

soma <- primeiroNumero + segundoNumero

limpatela

// escreval("Soma dos valores: ", soma)
escreval("A soma do valor", primeiroNumero, " com o valor",segundoNumero, " é", soma)

Fimalgoritmo