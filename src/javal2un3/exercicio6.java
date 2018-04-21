package javal2un3;
public class exercicio6 {
 double altura,base;
 float area(){
     return (float) (altura*base);
 
 }
float perimetro(){
    return (float) (2*(altura*base));

}
float diagonal(){
    float d2= (float) (Math.pow(base,2)
      +Math.pow(altura,2));

return (float) (Math.sqrt(d2));      
}
}
