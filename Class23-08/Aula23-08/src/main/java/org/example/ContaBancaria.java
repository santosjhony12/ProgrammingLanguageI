package org.example;
public class ContaBancaria {
    private String titular;
    private double saldo;
    private String tipoConta;

    public ContaBancaria() {
    }

    public ContaBancaria(String titular, double saldoInicial, String tipoConta) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.tipoConta = tipoConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado. \nNovo saldo: R$" + saldo);
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}
