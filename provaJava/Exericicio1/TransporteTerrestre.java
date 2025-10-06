public class TransporteTerrestre implements Transporte {
    
    @Override
    public double calcularTarifa(double distancia, double peso){
        return 50 + distancia * 2;
    }
}
