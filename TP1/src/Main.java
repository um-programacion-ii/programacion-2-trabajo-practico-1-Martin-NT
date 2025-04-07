
public class Main {
    public static void main(String[] args) {
        VehiculoPrinter printer = new VehiculoPrinter();

        // Crear vehiculos
        Vehiculo v1 = new Vehiculo("ABC123", "Toyota Hilux SRX", 2019, 2200);
        Vehiculo v2 = new Vehiculo("XYZ678", "Ford Ranger Limited", 2022, 2500);
        Vehiculo v3 = new Vehiculo("LMN456", "Peugeot 207 Compact XS", 2012, 1200);

        // Mostrar Informacion de los vehiculos
        printer.imprimir(v1);
        printer.imprimir(v2);
        printer.imprimir(v3);

    }
}