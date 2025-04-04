
public class Main {
    public static void main(String[] args) {
        // Crear vehiculos
        Vehiculo v1 = new Vehiculo("ABC123", "Toyota Hilux SRX", 2019, 2200);
        Vehiculo v2 = new Vehiculo("XYZ678", "Ford Ranger Limited", 2022, 2500);
        Vehiculo v3 = new Vehiculo("LMN456", "Peugeot 207 Compact XS", 2012, 1200);

        // Vehículo con patente inválida (vacía)
        //Vehiculo v4 = new Vehiculo("", "Toyota Hilux", 2019, 2200);

        // Vehículo con marca inválida (null)
        //Vehiculo v5 = new Vehiculo("DEF456", null, 2020, 2500);

        // Vehículo con año inválido (fuera de rango)
        //Vehiculo v6 = new Vehiculo("GHI789", "Peugeot 207 Compact", 1800, 1200);

        // Vehículo con capacidad de carga inválida (negativa)
        //Vehiculo v7 = new Vehiculo("JKL012", "Renault Kangoo", 2018, -500);

        // Mostrar Informacion de los vehiculos
        v1.mostrarInformacion();
        v2.mostrarInformacion();
        v3.mostrarInformacion();

    }
}