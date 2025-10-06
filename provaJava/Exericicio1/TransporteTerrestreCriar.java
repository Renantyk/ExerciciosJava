public class TransporteTerrestreCriar implements TransporteCriar {

    @Override
    public Transporte criarTransporte() {
        return new TransporteTerrestre();
    }
    
}
