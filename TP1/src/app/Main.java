import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VehiculoPrinter printer = new VehiculoPrinter();

        // Crear Lista de Vehiculos
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        // Crear distintos Vehiculos
        Vehiculo v1 = new Auto("CCC333", "Fiat Cronos Precision", 2023, 450, 5);
        Vehiculo v2 = new Auto("LMN456", "Peugeot 207 Compact XS", 2012, 1200, 5);
        Vehiculo v3 = new Camion("TRK789", "Mercedes-Benz Actros", 2020, 18000, true);

        // Agregar Vehiculos a la Lista
        vehiculos.add(v1);
        vehiculos.add(v2);
        vehiculos.add(v3);

        // Usar VehiculoPrinter para imprimir cada vehículo
        for (Vehiculo v : vehiculos) {
            v.imprimirInformacion(printer);
        }

        // Búsqueda múltiple por patente
        Scanner scanner = new Scanner(System.in); // Se crea un objeto Scanner para leer la entrada del usuario por consola

        while (true) { // Bucle infinito para permitir múltiples búsquedas
            System.out.print("\n---> Ingrese una patente para buscar (o escriba 'salir'): ");
            String input = scanner.nextLine(); // Se lee la línea ingresada por el usuario

            // Si el usuario escribe "salir" o no escribe nada, se termina el bucle
            if (input.equalsIgnoreCase("salir") || input.trim().isEmpty()) {
                System.out.println("--> Saliendo del sistema de búsqueda.");
                break; // Sale del bucle
            }

            // Se busca el vehículo que coincida con la patente ingresada
            Vehiculo encontrado = VehiculoFinder.buscarPorPatente(vehiculos, input);

            if (encontrado != null) {
                // Si se encuentra, se imprime la información del vehículo
                System.out.println("\n-------------Vehículo encontrado-------------");
                encontrado.imprimirInformacion(printer);
            } else {
                // Si no se encuentra, se informa al usuario
                System.out.println("\n--> No se encontró ningún vehículo con la patente ingresada.");
            }
        }

        scanner.close(); // Se cierra el scanner para liberar recursos

    }
}
