public class Vehiculo {
    private String patente;
    private String marca;
    private int anio;
    private double capacidadCargaKg;

    //Constructor
    public Vehiculo(String patente, String marca, int anio, double capacidadCargaKg) {
        this.patente = patente;
        this.marca = marca;
        this.anio = anio;
        this.capacidadCargaKg = capacidadCargaKg;
    }
    // Getters
    public String getPatente() {
        return patente;
    }
    public String getMarca() {
        return marca;
    }
    public int getAnio() {
        return anio;
    }
    public double getCapacidadCargaKg() {
        return capacidadCargaKg;
    }

    // Setters
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void setCapacidadCargaKg(double capacidadCargaKg) {
        this.capacidadCargaKg = capacidadCargaKg;
    }

    // Metodo mostrarInformacion() (sera eliminado en la Etapa 2)
    public void mostrarInformacion() {
        System.out.println("Vehiculo [Patente: " + patente + ", Marca: " + marca + ", Año: " + anio + ", Capacidad: " + capacidadCargaKg + " kg]");
    }
}
