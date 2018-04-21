package javal2un3;
import java.util.Scanner;
public class testeexercicio5 {
    public static void main(String[] args) {
    Scanner leia= new Scanner (System.in);
    exercicio5 horas = new exercicio5();
    
        System.out.println("Digite os segundos");
        horas.segundos=leia.nextInt();
        
        System.out.println("Horas "+horas.calculo2()+" Minutos "+horas.calculo());
    
    }
    
}
