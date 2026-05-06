Algoritmo "estado_civil"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Arthur Henrique Kronbauer 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Gabriel S. Olavo
// Data atual  : 23/03/2026

Var
// Seção de Declarações das variáveis 
   sexo : caractere
   estadoCivil : caractere
   idade : inteiro
   qtdSolteiro : inteiro
   qtdCasado : inteiro
   soma : inteiro
   mediaIdadeM : inteiro
   contador : inteiro
   qtdMulheres : inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   qtdSolteiro <- 0
   qtdCasado <- 0
   qtdMulheres <- 0
   soma <- 0
   mediaIdadeM <- 0
   
   para contador de 1 ate 5 passo 1 faca
      escreval("Estado Civil")
      escreval("1 - Casado")
      escreval("2 - Solteiro")
      escreval("")
      escreva("Informe o estado civil do entrevistado: ")
      leia(estadoCivil)
      escreva("Informe o sexo do entrevistado|(m)asculino ou (f)menino: ")
      leia(sexo)
      escreva("Informe a idade do entrevistado: ")
      leia(idade)

      se (sexo = "f") entao
        soma <- soma + idade // incrementa a variável com o valor dela mesmo e de Idade
        qtdMulheres <- qtdMulheres + 1
      fimse

      se (estadoCivil = "1") entao
        qtdCasado <- qtdCasado + 1
      senao
        qtdSolteiro <- qtdSolteiro + 1
      fimse
   fimpara
   
   mediaIdadeM <- soma \ qtdMulheres
   
   escreval("Média de idade das mulheres: ",mediaIdadeM)
   
   se qtdCasado > qtdSolteiro entao
      escreval("Estado civil com mais entrevistados: Casado")
   senao
      escreval("Estado civil com mais entrevistados: Solteiro")
   fimse

Fimalgoritmo