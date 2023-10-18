public class Porta {
    private String material;
    private String cor;
    private boolean aberta;
    private boolean trancada;

    public Porta(String material, String cor) {
        this.material = material;
        this.cor = cor;
        this.aberta = false;
        this.trancada = false;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void abrir() {
        if (!trancada) {
            aberta = true;
            System.out.println("Porta aberta.");
        } else {
            System.out.println("A porta está trancada. Não pode ser aberta.");
        }
    }

    public void fechar() {
        aberta = false;
        System.out.println("Porta fechada.");
    }

    public boolean isTrancada() {
        return trancada;
    }

    public void trancar() {
        if (!aberta) {
            trancada = true;
            System.out.println("Porta trancada.");
        } else {
            System.out.println("A porta está aberta. Feche-a antes de trancar.");
        }
    }

    public void destrancar() {
        trancada = false;
        System.out.println("Porta destrancada.");
    }
}
