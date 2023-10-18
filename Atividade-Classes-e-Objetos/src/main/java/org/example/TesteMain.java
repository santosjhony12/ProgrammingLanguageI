public class TesteMain {
    public static void main(String[] args){
<<<<<<< HEAD
      
=======
>>>>>>> 405a7e32ae235668083d78d801cfe11fb1f7cd1a
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

        Aluno aluno = new Aluno("Jhony Santos", 18, 0);
        aluno.visualizarDetalhes();
        aluno.atribuirNota(4);
        aluno.verificarAprovacao();
        System.out.println("Atribuindo 2 na nota...");
        aluno.atribuirNota(2);
        aluno.verificarAprovacao();
        tracejado();

        LojaOnline lojaOnline = new LojaOnline("Mercado Livre", 2987, true);
        System.out.println("Loja Aberta? "+lojaOnline.isAberta());
        System.out.println("Loja "+lojaOnline.getNome());
        System.out.println("Quantidade de produtos: "+lojaOnline.getNumeroProdutos());
        System.out.println("Adicionando produto...");
        lojaOnline.adicionarProduto();
        tracejado();

        Computador computador = new Computador("Samsung", "Galaxy Book2", 5200, false);
        computador.exibirStatus();
        System.out.println("\n");
        computador.ligar();
        System.out.println("\n");
        computador.exibirStatus();
        tracejado();

        Telefone telefone = new Telefone("Unify", "RFA", "128596545");
        telefone.ligar();
        telefone.fazerChamada("12996076401");
        telefone.desligar();
        tracejado();

        Cadeira cadeira = new Cadeira("Madeira", "Marrom", 4);
        System.out.println("A cadeira é reclinável? "+cadeira.isReclinavel());
        cadeira.empurrar();
        cadeira.levantar();
        cadeira.reclinar();
        tracejado();

        Porta portaSala = new Porta("Madeira", "Marrom");
        Interruptor interruptorSala = new Interruptor("Sala", 1);

        portaSala.abrir();
        portaSala.trancar();
        interruptorSala.ligar();
        interruptorSala.verificarStatus();
        interruptorSala.desligar();
        interruptorSala.verificarStatus();
        portaSala.destrancar();
        portaSala.abrir();
        interruptorSala.alternar();
        interruptorSala.verificarStatus();
    }
    public static void tracejado(){
        System.out.println("\n=============================\n");
    }
}
