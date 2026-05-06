Algoritmo "ordem_inversa"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 15/03/2026
Var
// Seção de Declarações das variáveis
   valor : inteiro
   digitoUm: inteiro
   resto : inteiro
   digitoDois : inteiro
   ultimoDigito : inteiro
   valorInvertido: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Insira um número com 3 algarismos: ")
   leia(valor)

   digitoUm <- valor mod 10
   resto <- valor div 10
   digitoDois <- resto mod 10
   ultimoDigito <- resto div 10

   valorInvertido <- (digitoUm * 100) + (digitoDois * 10) + ultimoDigito

   escreval("Valor invertido:",valorInvertido)

Fimalgoritmo