
package interfazvehiculo;

public class Main {
      public static void main(String[] args) {
      
          InterfazVehiculo carro = new Coche();
          carro.arrancar();
          carro.claxon();
          carro.detener();
          
          InterfazVehiculo camion = new Camion();
          camion.arrancar();
          camion.claxon();
          camion.detener();
      }
      
}
