
public class Main {
    public static void main(String[] args) {
        VehiculoPrinter printer = new VehiculoPrinter();

        // Crear vehiculos
        Vehiculo v1 = new Vehiculo("ABC123", "Toyota Hilux SRX", 2019, 2200);
        Vehiculo v2 = new Vehiculo("XYZ678", "Ford Ranger Limited", 2022, 2500);
        Vehiculo v3 = new Vehiculo("LMN456", "Peugeot 207 Compact XS", 2012, 1200);

        // Crear Camion
        Camion c1 = new Camion("TRK789", "Mercedes-Benz Actros", 2020, 18000, true);

        // Imprimir todos los vehiculos usando VehiculosPrinter
        printer.imprimir(v1);
        printer.imprimir(v2);
        printer.imprimir(v3);
        printer.imprimir(c1);

    }
}