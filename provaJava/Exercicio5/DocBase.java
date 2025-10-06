package Exercicio5;

public class DocBase implements DocPrototype{

    private String tipo;
    private String cor;
    private String fonte;
    private String logotipo;

    public DocBase(String tipo, String cor, String fonte, String logotipo){
        this.tipo = tipo;
        this.cor = cor;
        this.fonte = fonte;
        this.logotipo = logotipo;
    }

    @Override
    public DocPrototype clone(){
        return new DocBase(this.tipo, this.cor, this.fonte, this.logotipo);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Doc: " + tipo);
        System.out.println("Cor: " + cor);
        System.out.println("Fonte:" + fonte);
        System.out.println("Logo: " + logotipo);
        System.out.println("-------------------------");
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setFonte(String fonte){
        this.fonte = fonte;
    }

    public void setLogo(String logotipo){
        this.logotipo = logotipo;
    }
    
}
