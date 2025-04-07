import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VehiculoPrinter printer = new VehiculoPrinter();

        // Crear Lista de Vehiculos
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

        // Crear distintos Vehiculos
        Vehiculo v1 = new Vehiculo("ABC123", "Toyota Hilux SRX", 2019, 2200);
        Vehiculo v2 = new Vehiculo("XYZ678", "Ford Ranger Limited", 2022, 2500);
        Vehiculo v3 = new Vehiculo("JKL321", "Volkswagen Amarok V6", 2021, 2800);
        Camion v4 = new Camion("TRK789", "Mercedes-Benz Actros", 2020, 18000, true);
        Auto v5 = new Auto("LMN456", "Peugeot 207 Compact XS", 2012, 1200, 5);

        // Agregar Vehiculos a la Lista
        vehiculos.add(v1);
        vehiculos.add(v2);
        vehiculos.add(v3);
        vehiculos.add(v4);
        vehiculos.add(v5);

        // Imprimir todos los vehiculos usando VehiculosPrinter
        printer.imprimir(v1);
        printer.imprimir(v2);
        printer.imprimir(v3);
        printer.imprimir(v4);
        printer.imprimir(v5);

    }
}