// O factory method foi escolhido para esse exercicio pois, permite criar objetos de diferentes tipos
// sem precisar alterar a classe concreta, assim ficando mais flexivel e os transportes ficando genéricos,
// facilitando caso precise criar outro transporte, ou tipo de transporte.

public class Main {
    public static void main(String[] args) {
        
        TransporteCriar aereoFactory = new TransporteAereoCriar();
        Transporte aviao = aereoFactory.criarTransporte();
        System.out.println("Frete aereo: " + aviao.calcularTarifa(100, 100));

        TransporteCriar maritimoFactory = new TransporteMaritimoCriar();
        Transporte navio = maritimoFactory.criarTransporte();
        System.out.println("Frete maritimo: " + navio.calcularTarifa(100, 100));

        TransporteCriar terrestreFactory = new TransporteTerrestreCriar();
        Transporte trem = terrestreFactory.criarTransporte();
        System.out.println("Frete terretre: " + trem.calcularTarifa(100, 100));
    }
}
