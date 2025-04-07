public class VehiculoPrinter {

    public void imprimir(Vehiculo vehiculo) {
        System.out.println("Información del Vehículo:");
        System.out.println("--> Patente: " + vehiculo.getPatente());
        System.out.println("--> Marca: " + vehiculo.getMarca());
        System.out.println("--> Año: " + vehiculo.getAnio());
        System.out.println("--> Capacidad de carga (Kg): " + vehiculo.getCapacidadCargaKg());

        // Solo si es un Camion, imprimimos si tiene acoplado (Tradicional)
        if (vehiculo instanceof Camion) {
            Camion camion = (Camion) vehiculo;
            System.out.println("--> Tiene Acoplado: " + camion.isTieneAcoplado());
        }
        if (vehiculo instanceof Auto) {
            Auto auto = (Auto) vehiculo;
            System.out.println("--> Cantidad de Pasajeros: " + auto.getCantidadPasajeros());
        }

        /* Pattern Matching (desde Java 16 en adelante)
        if (vehiculo instanceof Camion camion) {
            System.out.println("--> Tiene acoplado: " + camion.isTieneAcoplado());
        }
        */

        System.out.println("-----------------------------------------------------------------------------");
    }
}
