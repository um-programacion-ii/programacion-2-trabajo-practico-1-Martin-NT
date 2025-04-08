package vehiculos;
import java.util.List;

 // Clase que permite buscar vehículos dentro de una lista por su patente.
public class VehiculoFinder {

    // Metodo estático para buscar un vehículo por su patente
    public static Vehiculo buscarPorPatente(List<Vehiculo> vehiculos, String patente) {
        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException("La patente no puede ser nula ni vacía.");
        }

        for (Vehiculo v : vehiculos) {
            if (v.getPatente().equalsIgnoreCase(patente.trim())) {
                return v;
            }
        }

        return null; // No se encontró ningún vehículo con esa patente
    }
}
