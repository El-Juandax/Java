
package figurasgeometricas;

class Cuadrado extends FigurasGeometricas {
    
    public Cuadrado(int valor1) {
        super(valor1);
    }

    @Override
    public double getArea(){
    
        double area = valor1 * valor1;
        return area;
    
    }
    
    public double getPerimetro(){
    
        double perimetro = valor1 + valor1 + valor1 + valor1;
        return perimetro;
    
    }
    
}
