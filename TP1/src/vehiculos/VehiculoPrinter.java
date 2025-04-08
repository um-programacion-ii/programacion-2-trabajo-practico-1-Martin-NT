package vehiculos;

public class VehiculoPrinter {

    public void imprimirVehiculo(Vehiculo vehiculo) {
        System.out.println("--> Patente: " + vehiculo.getPatente());
        System.out.println("--> Marca: " + vehiculo.getMarca());
        System.out.println("--> Año: " + vehiculo.getAnio());
        System.out.println("--> Capacidad de carga (Kg): " + vehiculo.getCapacidadCargaKg());
    }
    public void imprimirCamion(Camion camion) {
        System.out.println("Información del Vehículo:");
        System.out.println("--> Tipo de Vehiculo: Camión");
        imprimirVehiculo(camion);
        System.out.println("--> Tiene Acoplado: " + camion.isTieneAcoplado());
        System.out.println("-----------------------------------------------------------------------------");
    }
    public void imprimirAuto(Auto auto) {
        System.out.println("Información del Vehículo:");
        System.out.println("--> Tipo de Vehiculo: Auto");
        imprimirVehiculo(auto);
        System.out.println("--> Cantidad de Pasajeros: " + auto.getCantidadPasajeros());
        System.out.println("-----------------------------------------------------------------------------");
    }
}
