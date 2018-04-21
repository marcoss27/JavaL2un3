//* nome:Marcos Vinícius Lima 
//*  Turma:2A 
//*  Matricula:207780
package javal2un3;
import java.util.Scanner;
public class testeexercicio1 {
    public static void main(String[] args) {
    Scanner leia= new Scanner (System.in);
    exercicio1 soma = new exercicio1 ();
    
        System.out.println("Digite o primeiro número e pressione ENTER:");
        soma.n1 = leia.nextInt();
        System.out.println("Digite o segundo número e pressione ENTER");
        soma.n2= leia.nextInt();
        System.out.println("Digite o terceiro número e pressione ENTER");
        soma.n3=leia.nextInt();
        
        System.out.println("O 1° número em real é "+soma.Numero1());
        System.out.println("O 2° número em real é "+soma.Numero2());
        System.out.println("O 3° número em real é"+soma.Numero3());
    }
    
}
