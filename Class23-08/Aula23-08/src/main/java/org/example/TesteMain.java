package org.example;

public class TesteMain {
    public static void main(String[] args){
        tracejado();
        ContaBancaria contaBancaria = new ContaBancaria("Jhony Santos de Souza", 144.89, "Corrente");
        System.out.println("Titular: "+contaBancaria.getTitular());
        System.out.println("Tipo conta: "+contaBancaria.getTipoConta());
        System.out.println("Saldo Anterior: R$"+contaBancaria.getSaldo());
        contaBancaria.depositar(100);
        tracejado();

        Produto produto1 = new Produto();
        produto1.setNome("Maçã");
        produto1.setPreco(5.99);
        produto1.setEstoque(100);
        produto1.exibirDetalhes();
        tracejado();

        Livro livro1 = new Livro();
        livro1.setTitulo("O Ódio que você Semeia");
        livro1.setAutor("Angie Thomas");
        livro1.setAnoPublicacao(2017);
        System.out.println("Livro: "+livro1.getTitulo());
        System.out.println("Autor: "+livro1.getAutor());
        System.out.println("Ano Lançamento: "+livro1.getAnoPublicacao());
        livro1.emprestar();
        livro1.devolver();
        tracejado();
    }
    public static void tracejado(){
        System.out.println("\n=============================\n");
    }
}
