public class Auto extends Vehiculo {
    private int cantidadPasajeros;

    //Constructor
    public Auto(String patente, String marca, int anio, double capacidadCargaKg, int cantidadPasajeros) {
        super(patente, marca, anio, capacidadCargaKg);
        setCantidadPasajeros(cantidadPasajeros);
    }

    //Getter
    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    //Setter
    public void setCantidadPasajeros(int cantidadPasajeros) {
        if (cantidadPasajeros <= 0) {
            throw new IllegalArgumentException("La Cantidad de Pasajeros debe ser mayor a 0");
        }
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public void imprimirInformacion(VehiculoPrinter printer) {
        printer.imprimirAuto(this);
    }
}
