
package figurasgeometricas;

public class Rectangulo extends FigurasGeometricas {
     
    int valor2;
    
    public Rectangulo (int valor1, int valor2){
    
        super(valor1);
        this.valor2=valor2;
    
    }
    
    @Override
    
    public double getArea(){
    
        double area = valor1 * valor2;
        return area;
    
    }
    
    public double getPerimetro(){
    
        double perimetro = valor1 + valor2 + valor1 + valor2;
        return perimetro;
        
    }
       
}
