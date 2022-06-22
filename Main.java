/*2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;*/

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