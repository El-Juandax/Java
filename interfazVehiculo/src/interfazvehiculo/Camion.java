
package interfazvehiculo;

public class Camion implements InterfazVehiculo {

    @Override
    public void arrancar() {
        System.out.println("Arrancando Camión");
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo Camión");    
    }

    @Override
    public void claxon() {
        InterfazVehiculo.super.claxon(); 
    }
    
}
