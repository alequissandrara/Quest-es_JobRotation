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