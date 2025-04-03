import java.time.Year;

public class Vehiculo {
    private String patente;
    private String marca;
    private int anio;
    private double capacidadCargaKg;

    //Constructor con validaciones
    public Vehiculo(String patente, String marca, int anio, double capacidadCargaKg) {
        setPatente(patente);
        setMarca(marca);
        setAnio(anio);
        setCapacidadCargaKg(capacidadCargaKg);
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
        // La patente no puede ser null ni vacía
        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException("La Patente no puede estar vacia");
        }
        this.patente = patente;
    }
    public void setMarca(String marca) {
        // La marca no puede ser null ni vacia
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("La marca no puede estar vacía.");
        }
        this.marca = marca;
    }
    public void setAnio(int anio) {
        // El año debe ser mayor a 1900 y menor o igual al año actual
        int anioActual = Year.now().getValue();
        if (anio < 1900 || anio > anioActual) {
            throw new IllegalArgumentException("El año debe ser mayor a 1900 y menor o igual al año actual.");
        }
        this.anio = anio;
    }
    public void setCapacidadCargaKg(double capacidadCargaKg) {
        // La capacidad de carga debe ser positiva
        if (capacidadCargaKg <= 0) {
            throw new IllegalArgumentException("La capacidad de carga debe ser un número positivo.");
        }
        this.capacidadCargaKg = capacidadCargaKg;
    }

}
