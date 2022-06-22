
//5) Escreva um programa que inverta os caracteres de um string.

//IMPORTANTE:
//a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
//b) Evite usar funções prontas, como, por exemplo, reverse;


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