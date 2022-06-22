## <h1>:space_invader:	Questoes_JobRotation :space_invader:	</h1>


2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

```
import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
  try(Scanner scan = new Scanner (System.in)){
  int a=1, b=0, aux=0, num=0;

    System.out.println("Digite um valor inteiro:");
    num = scan.nextInt();
    
    for(int i=0; i<num; i++){
      System.out.println(a);
      aux = a;
      a = a + b;
      b = aux; 
      
    }
  }


    
  }
}
```
<hr>
3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

IMPORTANTE:
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;
```
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
		float valor[] = new float[6], total = 0;
		float maior = 0, menor = 9999999, media=0;

      // Recebe os valores digitados
		System.out.println("Digite os valores diários dos últimos 6 dias: ");
      //calcula maior valor
		for(int i = 0; i < valor.length; i++){
			System.out.print("valores >> R$  ");
			valor[i] = sc.nextInt(); 
			if(valor[i] > maior){ 
				maior = valor[i];
        
			}
		}
      //calcula menor valor
    for (int j = 0; j < valor.length; j++) {
			if(valor[j] < menor){
				menor = valor[j];
			}
		}
  //calcula o número de dias no mês em que o valor de             faturamento diário foi superior   à média mensal.
    for (int n = 0; n< valor.length; n++){
        total = total + valor [n];
              media = total /4;
      for(int m=0; media>valor.length; m++)
      media= valor[m];
      }
		
	
    
		//Apresenta valores
		System.out.println(" Maior valor de faturamento ocorrido em um dia do mês : R$"+ maior);
		System.out.println("Menor valor de faturamento ocorrido em um dia do mês : R$"+ menor);
		 System.out.println("Dias no mês em que o valor de faturamento diário foi superior   à média mensal: " + media + "dias");
  }
}
```
<hr>
4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:

SP – R$67.836,43
RJ – R$36.678,66
MG – R$29.229,88
ES – R$27.165,48
Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.
 ```
 e = ['SP', 'RJ', 'MG', 'ES', 'OUTROS']

faturamento = list()
for c in e:

    while True:
        try:
            v = float(input(f'Digite o faturamento mensal de {c}: '))
            if v < 0:
                print(
                    '\033[31mValor INVÁLIDO! Digite apenas valores maiores ou iguais a "0":\033[m'
                )
            break
        except:
            print('\033[31mValor INVÁLIDO! Digite apenas valores reais!\033[m')

    faturamento.append(v)

faturamento_total = sum(faturamento)
print(
    f'\033[32mO faturamento total da Distribuidora foi: R$ {faturamento_total:.2f}'
    .replace('.', ','))

cont = 0
for i in faturamento:
    cont += 1
    percentual = ((i / faturamento_total) * 100)
    print(
        f'O percentual de faturamento de {e[cont - 1]} é: {percentual:.2f} %') 

```
 
 <hr>
 
 5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;
```
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner scan = new Scanner (System.in);

    
    System.out.println("Digite a palavra que irá ser convertida Invertida: ");
    String palavra = scan.next();
    String novaPalavra = "";
    //efetua a conversão da string
    for(int i = palavra.length() -1; i>=0; i-- ){
      novaPalavra = novaPalavra + Character.toString(palavra.charAt(i));
    }
    System.out.println("Palavra Invertida: "+novaPalavra);
    
    
    
  }
}
```
