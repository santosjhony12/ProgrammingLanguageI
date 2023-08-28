package org.example;

public class Telefone {
    private String marca;
    private String modelo;
    private String numero;
    private boolean ligado;

    public Telefone(String marca, String modelo, String numero) {
        this.marca = marca;
        this.modelo = modelo;
        this.numero = numero;
        this.ligado = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligar() {
        ligado = true;
        System.out.println("Telefone ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Telefone desligado.");
    }

    public void fazerChamada(String numeroDestino) {
        if (ligado) {
            System.out.println("Chamando " + numeroDestino);
        } else {
            System.out.println("O telefone está desligado.");
        }
    }

    public void receberChamada() {
        if (ligado) {
            System.out.println("Recebendo chamada...");
        } else {
            System.out.println("O telefone está desligado.");
        }
    }
}
