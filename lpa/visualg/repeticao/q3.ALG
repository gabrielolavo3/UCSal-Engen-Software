Algoritmo "qtd_par_impar"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Arthur Henrique Kronbauer 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Gabriel S. Olavo
// Data atual  : 15/03/2026
Var
// Seção de Declarações das variáveis 
   numero : inteiro
   qtdImpar : inteiro
   qtdPar : inteiro
   contador : inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   contador <- 0
   qtdPar <- 0
   qtdImpar <- 0
   
   enquanto numero <> -1 faca
      contador <- contador+1
      
      escreva("Insira o numero", contador,": ")
      leia(numero)

      se (numero >= 0) entao
         se (numero % 2 = 0) entao
            qtdPar <- qtdPar + 1
         senao
            qtdImpar <- qtdImpar + 1
         fimse
      fimse
   fimenquanto
   
   limpatela
   
   escreval("Quantidade de par: ",qtdPar)
   escreval("Quantidade de ímpar: ",qtdImpar)

Fimalgoritmo