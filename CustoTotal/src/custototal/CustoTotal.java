package custototal;

import java.util.Scanner;

public class CustoTotal {

    public static void main(String[] args) {
      Scanner leia = new Scanner(System.in);
      double Valor = 1.10;
      System.out.println("Quantidade de Laranjas: ");
      int Quantia = leia.nextInt();
      if(Quantia >=12){
          Valor = 0.75;
      }
      double resultado = Quantia * Valor;
      System.out.println("Você comprou " + Quantia + " no total de: " + resultado);
    }
    
}
