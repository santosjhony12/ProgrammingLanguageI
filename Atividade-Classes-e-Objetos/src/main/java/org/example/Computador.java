

public class Computador {
    private String marca;
    private String modelo;
    private double preco;
    private boolean ligado;
    public Computador(){}
    public Computador(String marca, String modelo, double preco, boolean ligado){
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.ligado = ligado;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("Computador ligado.");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("Computador desligado.");
    }

    public void exibirStatus() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço: R$" + preco);
        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
    }
}
