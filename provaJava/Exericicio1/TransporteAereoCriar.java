public class TransporteAereoCriar implements TransporteCriar {

    @Override
    public Transporte criarTransporte() {
        return new TransporteAereo();    
    }

}
