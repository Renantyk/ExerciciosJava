public class TransporteMaritimo implements Transporte {

    @Override
    public double calcularTarifa(double distancia, double peso) {
        return 90 + (peso * 3) + (distancia * 1.2);
    }

}
