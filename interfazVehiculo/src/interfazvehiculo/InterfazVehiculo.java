
package interfazvehiculo;

public interface InterfazVehiculo {

    String matricula = "";
    Float velMaxima = 0.0f;
    
    void arrancar();
    void detener();
    
    default void claxon(){
        System.out.println("Sonando claxon: Pi pi pi");
    }
    
}
