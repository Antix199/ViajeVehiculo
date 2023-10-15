import java.util.Scanner;
public class Validaciones {
    public static int validarEntero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        int valor = 0;
        boolean entradaValida = false;

        do {
            try {
                System.out.print(mensaje);
                valor = Integer.parseInt(scanner.nextLine());
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un número entero válido.");
            }
        } while (!entradaValida);

        return valor;
    }

    public static int validarRango(String mensaje, int min, int max) {
        int valor;
        do {
            valor = validarEntero(mensaje);
            if (valor < min || valor > max) {
                System.out.println("Error: Ingresa una opción válida (" + min + " a " + max + ").");
            }
        } while (valor < min || valor > max);
        return valor;
    }
}
