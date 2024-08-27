
package figurasgeometricas;

public class Triangulo extends FigurasGeometricas{
    
    int valor2;
    int valor3;
    
    public Triangulo (int valor1, int valor2, int valor3){
    
        super(valor1);
        this.valor2=valor2;
        this.valor3=valor3;
    
    }
    
    @Override
    
    public double getArea(){
    
        double area = valor1 * valor3 / 2;
        return area;
    
    }
    
    public double getPerimetro(){
    
        double perimetro = valor1 + valor2 + valor2;
        return perimetro;
        
    }
    
}

