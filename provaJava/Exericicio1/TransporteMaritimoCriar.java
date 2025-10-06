public class TransporteMaritimoCriar implements TransporteCriar {

    @Override
    public Transporte criarTransporte() {
        
        return new TransporteMaritimo();
    }
    
}
