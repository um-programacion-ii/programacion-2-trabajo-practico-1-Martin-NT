package vehiculos;

public class Camion extends Vehiculo {
    private boolean tieneAcoplado; //Atributo adicional

    //Constructor
    public Camion(String patente, String marca, int anio, double capacidadCargaKg, boolean tieneAcoplado) {
        super(patente, marca, anio, capacidadCargaKg);
        this.tieneAcoplado = tieneAcoplado;
    }

    //Getter
    public boolean isTieneAcoplado() {
        return tieneAcoplado;
    }

    @Override
    public void imprimirInformacion(VehiculoPrinter printer) {
        printer.imprimirCamion(this);
    }
}
