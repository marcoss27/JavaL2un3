package javal2un3;
import java.util.Scanner;
import java.text.DecimalFormat;
public class testeexercicio3 {
    public static void main(String[] args) {
   Scanner leia = new Scanner (System.in);
   DecimalFormat df = new DecimalFormat("0.00");
   exercicio3 soma = new exercicio3();
   
        System.out.println("Digite o primeiro númeoro e pressione ENTER");
        soma.n1=leia.nextFloat();
        System.out.println("Digite o segundo númeor e pressione ENTER");
        soma.n2=leia.nextInt();
        
        System.out.println("Sua soma é de "+df.format(soma.calculosoma()));
    }
    
}
//* A soma do número inteiro com o real gera um número real