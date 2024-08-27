
package figurasgeometricas;

class Circulo extends FigurasGeometricas{
    
    public Circulo (int valor1){
        
    super(valor1);
    
    }
    
    @Override
    public double getArea(){
    
        double area = Math.PI * Math.pow(valor1, 2);
        return area;
        
    }
    
        public double getPerimetro(){
    
        double perimetro = 2 * Math.PI * valor1;
        return perimetro;
        
    }
}
