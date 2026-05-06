Algoritmo "primo"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Arthur Henrique Kronbauer 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Gabriel S. Olavo
// Data atual  : 15/03/2026
Var
// Seção de Declarações das variáveis 
   numero : inteiro
   contador : inteiro
   qtdDivisores : inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   escreva("Informe um número: ")
   leia(numero)
   
   qtdDivisores <- 0
   
   para contador de 1 ate numero faca
       se ((numero % contador = 0) e (numero % numero = 0)) entao
          qtdDivisores <- qtdDivisores + 1
       fimse
   fimpara
   
   se (qtdDivisores = 2) entao
      escreval("É primo")
   senao
        escreval("Não é primo")
   fimse

Fimalgoritmo