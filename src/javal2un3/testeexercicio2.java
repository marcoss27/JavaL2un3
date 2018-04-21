package javal2un3;
import java.util.Scanner;
public class testeexercicio2 {
    public static void main(String[] args) {
    Scanner leia = new Scanner (System.in);
    exercicio2 soma = new exercicio2();
    
        System.out.println("Digite o 1º número e pressione enter");
        soma.n1= leia.nextFloat();
        System.out.println("Digite o 2º número e pressione enter");
        soma.n2= leia.nextFloat();
        System.out.println("Digite o 3º número e pressione enter");
        soma.n3= leia.nextFloat();
        
        System.out.println("Os número 1 em inteiro é "+soma.numero1());
        System.out.println("Os número 1 em inteiro é "+soma.numero2());
        System.out.println("Os número 1 em inteiro é "+soma.numero3());
    }
    
}
