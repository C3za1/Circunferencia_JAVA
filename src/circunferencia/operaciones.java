
package circunferencia;


public class operaciones
{
    //declaracion de variable tipo publico
    public int radio;
    
    
  public operaciones(int rad)
    {
      radio=rad;
    }
    

  public double area()
    {
     double area;
     area=(radio*radio*3.14);
     return area;
    }

  public double perimetro()
   {
     double perimetro;
     double pi=3.14;
     double peri;
     perimetro=(pi*pi*radio);
     return perimetro;
    }
}
