
public class Interruptor {
    private String localizacao;
    private boolean ligado;
    private int quant;

    public Interruptor(String localizacao, int quant) {
        this.localizacao = localizacao;
        this.ligado = false;
        this.quant = quant;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public boolean isLigado() {
        return ligado;
    }
    public void setQuant(int quant){
        this.quant = quant;
    }

    public int getQuant() {
        return quant;
    }

    public void ligar() {
        ligado = true;
        System.out.println("Luz ligada na " + localizacao);
    }

    public void desligar() {
        ligado = false;
        System.out.println("Luz desligada na " + localizacao);
    }

    public void alternar() {
        ligado = !ligado;
        System.out.println("Luz alterada na " + localizacao + ". Agora está " + (ligado ? "ligada" : "desligada"));
    }

    public void verificarStatus() {
        System.out.println("Luz na " + localizacao + " está " + (ligado ? "ligada" : "desligada"));
    }
}
