Algoritmo "par_impar"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Arthur Henrique Kronbauer 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Gabriel S. Olavo
// Data atual  : 15/03/2026
Var
// Seção de Declarações das variáveis 
   numero : real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   escreva("Informe um número (inteiro ou real): ")
   leia(numero)
   
   se (numero % 2 = 0) entao
      escreval("O número",numero," é par")
   senao
        escreval("O número",numero," é ímpar")
   fimse

Fimalgoritmo