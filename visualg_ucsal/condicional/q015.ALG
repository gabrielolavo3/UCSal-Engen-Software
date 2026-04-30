Algoritmo "multiplo"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Arthur Henrique Kronbauer 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Gabriel S. Olavo
// Data atual  : 15/03/2026
Var
// Seção de Declarações das variáveis 
   valorA : inteiro
   valorB : inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   escreva("Informe o valor A: ")
   leia(valorA)
   escreva("Informe o valor B: ")
   leia(valorB)
   
   se (valorA % valorB = 0) entao
      escreval("O valor",valorA," é múltiplo de",valorB)
   senao
        escreval("Os valores não são múltiplos")
   fimse

Fimalgoritmo