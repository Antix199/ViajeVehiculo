import java.util.Scanner;
public class Viaje {
    public static void iniciarViaje() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hola, por favor ingrese su nombre del usuario: ");
        String nombre = scanner.nextLine();
        Persona persona = new Persona(nombre);

        System.out.print("Ingrese el destino: ");
        String destino = scanner.nextLine();

        System.out.println("VEHICULOS DISPONIBLES");
        System.out.println("1. Auto");
        System.out.println("2. Motocicleta");
        System.out.println("3. Bicicleta");

        int opcion = Validaciones.validarRango("Elija el vehículo:", 1, 3);

        Vehiculo[] vehiculos = {
                new Vehiculo("auto", 50.0),
                new Vehiculo("motocicleta", 40.0),
                new Vehiculo("bicicleta", 30.0)
        };

        Vehiculo vehiculoElegido = vehiculos[opcion - 1];

        double distancia = Validaciones.validarEnteroPositivo("Ingrese la distancia aproximada al destino (en kilómetros): ");
        double tiempo = vehiculoElegido.calcularTiempoDeViaje(distancia);
        String tiempoFormateado = String.format("%.2f", tiempo);

        System.out.println("Hola " + persona.getNombre() + ", el tiempo de viaje aproximado para llegar a " + destino + " en " + vehiculoElegido.getTipoVehiculo() + " es de: " + tiempoFormateado + " horas.");
    }
}
