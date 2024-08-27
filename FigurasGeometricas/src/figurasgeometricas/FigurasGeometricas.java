
package figurasgeometricas;

import java.util.Scanner;

public class FigurasGeometricas {

    public int valor1; 

    public FigurasGeometricas(int valor1){
    
    this.valor1=valor1;
    
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }
       
    public double getArea(){
  
        double area = valor1 * valor1;
        return area;
    
    }
    
    public double getPerimetro(){
    
        Scanner scan = new Scanner(System.in);

        
        System.out.println("Digite la longitud del lado 1");
        double lado1= scan.nextDouble();   
        System.out.println("Digite la longitud del lado 2");
        double lado2 = scan.nextDouble();
        double perimetro = lado1+lado2;
        return perimetro;
    
        
    }

    
}
