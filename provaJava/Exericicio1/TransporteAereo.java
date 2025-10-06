public class TransporteAereo implements Transporte {

    @Override
    public double calcularTarifa(double distancia, double peso) {
        return 60 + (peso * 15) + (distancia * 2.5);
    }
    
    
}
