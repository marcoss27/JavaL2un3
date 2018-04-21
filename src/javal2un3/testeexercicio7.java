package javal2un3;
import java.util.Scanner;
import java.text.DecimalFormat;
public class testeexercicio7 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    exercicio7 raio = new exercicio7();
        System.out.println("Digite o Raio");
        raio.raio = leia.nextFloat();
        
        System.out.println("Sua área é de"+df.format(raio.calculoarea()));
        System.out.println("Seus comprimento é de"+df.format(raio.calculocirc()));
    
    
    }
    
}
