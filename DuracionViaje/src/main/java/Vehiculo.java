public class Vehiculo {
    private String tipoVehiculo;
    private double velocidadPromedio;

    public Vehiculo(String tipoVehiculo, double velocidadPromedio) {
        this.tipoVehiculo = tipoVehiculo;
        this.velocidadPromedio = velocidadPromedio;
    }

    public double calcularTiempoDeViaje(double distancia) {
        return distancia / velocidadPromedio;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }
}