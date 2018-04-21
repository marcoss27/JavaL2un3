package javal2un3;
import java.util.Scanner;
import java.text.DecimalFormat;
public class testeexercicio6 {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        exercicio6 soma = new exercicio6();
        
            System.out.println("Digite a altura e pressione ENTER");
            soma.altura = leia.nextInt();
            
            System.out.println("Digite a base e pressione ENtER");
            soma.base = leia.nextInt();
            
            System.out.println("Retangulo de valores ");
            System.out.println("Perimetro "+df.format(soma.perimetro()));
            System.out.println("Área "+df.format(soma.area()));
            System.out.println("Diagonal "+df.format(soma.diagonal()));
            

    }
    
}
