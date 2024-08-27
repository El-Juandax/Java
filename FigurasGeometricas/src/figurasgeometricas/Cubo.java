
package figurasgeometricas;

public class Cubo extends Cuadrado {
    
    public Cubo(int valor1){
    
        super(valor1);
        
    }
    
    @Override
    
    public double getArea(){
    
        double area = 6 * Math.pow(valor1, 2);
        return area;
    
    }
}
