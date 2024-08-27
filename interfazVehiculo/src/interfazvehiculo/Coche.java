
package interfazvehiculo;

public class Coche implements InterfazVehiculo {

    @Override
    public void arrancar() {
        System.out.println("Arrancando vehiculo"); 
        
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo vehivulo");
    }

    @Override
    public void claxon() {
        InterfazVehiculo.super.claxon(); 
    }
    



    
}
