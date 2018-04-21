package javal2un3;
import java.util.Scanner;
public class texteexercicio8 {
    public static void main(String[] args) {
      Scanner leia= new Scanner (System.in);
      exercicio8 soma= new exercicio8();
        System.out.println("Entre com os valores ");
        System.out.println("A");
        soma.a =leia.nextInt();
        System.out.println("B");
        soma.b =leia.nextInt();
        System.out.println("C");
        soma.c =leia.nextInt();      
    
        System.out.println(""+soma.a+"x2+"+soma.b+"x+"+soma.c);
        System.out.println("");
        System.out.println("Raiz de:"+soma.calculoraiz()+"é igual a:"+soma.raiz());
    
    }
    
}
