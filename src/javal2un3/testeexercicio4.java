package javal2un3;
import java.util.Scanner;
public class testeexercicio4 {
    public static void main(String[] args) {
    Scanner leia = new Scanner (System.in);
    exercicio4 volume = new exercicio4();
    
        System.out.println("Digite o altura");
        volume.altura=leia.nextLong();
        System.out.println("Digite o comprimento ");
        volume.comprimento=leia.nextLong();
        System.out.println("Digite o ");
        volume.largura=leia.nextLong();
        
        System.out.println("Seu volume é de "+volume.calculovolume());
    }
    
}
