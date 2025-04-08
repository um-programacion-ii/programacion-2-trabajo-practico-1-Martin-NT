import java.util.ArrayList;

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
    }
}