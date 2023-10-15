import java.util.Scanner;
public class Validaciones {
    public static int validarEnteroPositivo(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        int valor = 0;
        boolean entradaValida = false;

        do {
            try {
                System.out.print(mensaje);
                valor = Integer.parseInt(scanner.nextLine());
                if (valor >= 0) {
                    entradaValida = true;
                } else {
                    System.out.println("Error: Ingresa un número entero positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un número entero válido.");
            }
        } while (!entradaValida);

        return valor;
    }


    public static int validarRango(String mensaje, int min, int max) {
        int valor;
        do {
            valor = validarEnteroPositivo(mensaje);
            if (valor < min || valor > max) {
                System.out.println("Error: Ingresa una opción válida (" + min + " a " + max + ").");
            }
        } while (valor < min || valor > max);
        return valor;
    }
}
