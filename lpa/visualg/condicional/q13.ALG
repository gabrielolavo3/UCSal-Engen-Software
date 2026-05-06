Algoritmo "imposto"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Arthur Henrique Kronbauer 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Gabriel S. Olavo
// Data atual  : 15/03/2026
Var
// Seção de Declarações das variáveis 
   salario : real
   salarioVigente : real
   imposto : real
   qtdSalario : real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   escreva("Insira o valor vigente do salário minímo: ")
   leia(salarioVigente)
   escreva("Insira o valor do seu salário: ")
   leia(salario)
   
   qtdSalario <- salario \ salarioVigente //Obtém quantos salarios a pessoa possui acima do mínimo
   
   se (qtdSalario <= 3) entao
      imposto <- salario * 0.1
   senao
        se ((qtdSalario > 3) e (qtdSalario <= 10)) entao
           imposto <- salario * 0.2
        senao
             imposto <- salario * 0.3
        fimse
   fimse
   
   escreval("Imposto: R$",imposto)

Fimalgoritmo