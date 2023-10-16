import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ValidacionesTest {
    @Test
    public void testValidarEnteroPositivo() {
        String input = "5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        int resultado = Validaciones.validarEnteroPositivo("Ingresa un número entero positivo: ");

        assertEquals(5, resultado);
    }

    @Test
    public void testValidarEnteroPositivoConValorNegativo() {
        String input = "-3\n5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        int resultado = Validaciones.validarEnteroPositivo("Ingresa un número entero positivo: ");

        assertEquals(5, resultado);
    }
    public void testValidarRango() {
        String input = "2";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        int resultado = Validaciones.validarRango("Elija una opción:", 1, 3);

        assertEquals(2, resultado);
    }

}