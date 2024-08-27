
package figurasgeometricas;

import java.util.Scanner;

public class Main {
               
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        int ciclo = 1;
        
        while (ciclo==1){ 
        System.out.println("Bienvenido al sistema");
        System.out.println("En este sistema calcularemos el area y perimetro de las siguientes figuras geometricas");        
        System.out.println("Elige una opción:");
        System.out.println("1-Circulo");
        System.out.println("2-Cuadrado");
        System.out.println("3-Triangulo");
        System.out.println("4-Rectangulo");
        System.out.println("5-Cubo (solo calcula area)");
        System.out.println("6-Salir");

        int accion =scan.nextInt();
        
        switch (accion){
            case 1:
             System.out.println("Escriba el radio del circulo");   
             int radio = scan.nextInt();
             Circulo circulo1 = new Circulo(radio);
             System.out.println("El area del circulo es: " + circulo1.getArea() + " y su perimetro es: " + circulo1.getPerimetro());
             System.out.println("");
             break;
             
             case 2:
             System.out.println("Escriba la longitud de un lado del cuadrado");   
             int longitud_lado_cuadrado = scan.nextInt();
             Cuadrado cuadrado1 = new Cuadrado(longitud_lado_cuadrado);
             System.out.println("El area del cuadrado es: " + cuadrado1.getArea() + " y su perimetro es: " + cuadrado1.getPerimetro());
             System.out.println("");
             break;
             
             case 3:
             System.out.println("Escriba la longitud de un lado del triangulo");   
             int lado_triangulo = scan.nextInt();
             System.out.println("Escriba la longitud de la base del triangulo");
             int base_triangulo = scan.nextInt();
             System.out.println("Escriba la longitud de la altura del triangulo");
             int altura_triangulo= scan.nextInt();
             Triangulo triangulo1 = new Triangulo(base_triangulo, lado_triangulo, altura_triangulo);
             System.out.println("El area del triangulo es: " + triangulo1.getArea() + " y su perimetro es: " + triangulo1.getPerimetro());
             System.out.println("");
             break;
             
             case 4:
             System.out.println("Escriba la longitud del rectangulo");   
             int longitud_rectangulo = scan.nextInt();
             System.out.println("Escriba el ancho del rectangulo");
             int ancho_rectangulo = scan.nextInt();
             Rectangulo rectangulo1 = new Rectangulo(longitud_rectangulo, ancho_rectangulo);
             System.out.println("El area del rectangulo es: " + rectangulo1.getArea() + " y su perimetro es: " + rectangulo1.getPerimetro());
             System.out.println("");
             break;
             
             case 5:
             System.out.println("Escriba la longitud de un lado del cubo");   
             int lado_cubo = scan.nextInt();
             Cubo cubo1 = new Cubo(lado_cubo);
             System.out.println("El area del circulo es: " + cubo1.getArea());
             System.out.println("");
             break;
           
             case 6:
             System.out.println("Gracias por usar el sistema");
             ciclo = 0;
             break;
        }
        }
            
    }
}
