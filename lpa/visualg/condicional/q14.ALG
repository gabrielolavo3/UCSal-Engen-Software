Algoritmo "moeda"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Arthur Henrique Kronbauer 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Gabriel S. Olavo
// Data atual  : 15/03/2026
Var
// Seção de Declarações das variáveis 
   moedaOrigem : real
   moedaConvertida : real
   tipoMoeda : caractere

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   escreva("Informe o valor, em R$, que deseja converter: ")
   leia(moedaOrigem)
   escreval("")
   escreval("Conversões disponíveis")
   escreval("1 - Dólar")
   escreval("2 - Libra")
   escreval("3 - Peso")
   escreva("Selecione uma das converções acima: ")
   leia(tipoMoeda)
   
   escolha tipoMoeda
      caso "1"
           moedaConvertida <- moedaOrigem / 1.87
      caso "2"
           moedaConvertida <- moedaOrigem / 3.05
      caso "3"
           moedaConvertida <- moedaOrigem / 1.40
   fimescolha

   escreval("")
   escreval("Conversão: ",moedaConvertida :2:2)
   
Fimalgoritmo