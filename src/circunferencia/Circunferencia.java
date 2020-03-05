
package circunferencia;
import java.util.Scanner;
import circunferencia.operaciones;


public class Circunferencia {

    
    public static void main(String[] args) 
    {
        
         // crea objeto Scanner para obtener la entrada de la ventana de comandos 
         Scanner RT = new Scanner (System.in);
         
         //declaracion de variables
          int radio;
          double result;
        
          //es para mostrar la longitud del radio
         System.out.println("ingrese la longitud del radio: ");
          // lee el radio
         radio=RT.nextInt();
       
        
         operaciones w = new operaciones(radio);
        
         result=w.area();
         result=w.perimetro();
              
              //es para mostrar el area
              System.out.println("el area es :"+w.area()+"cm^3");
              
              //es para mostrar el perimetro
              System.out.println("el perimetro es:"+w.perimetro()+"cm");
    }
    
}
