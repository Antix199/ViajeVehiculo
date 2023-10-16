import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class VehiculoTest {
    @Test
    public void TestCalcularTiempoDeViaje() {
        Vehiculo auto = new Vehiculo("auto", 30.0);
        double distancia = 100.0;
        double tiempoEsperado = 3.33;

        double tiempoCalculado = auto.calcularTiempoDeViaje(distancia);

        assertEquals(tiempoEsperado, tiempoCalculado, 0.01);
    }
}
