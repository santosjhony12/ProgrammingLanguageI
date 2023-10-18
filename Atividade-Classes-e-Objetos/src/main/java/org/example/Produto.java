public class Produto {
    private String nome;
    private double preco;
    private int estoque;
    public Produto(){

    }
    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public void exibirDetalhes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Estoque: " + estoque + " unidades");
    }

    public void vender(int quantidade) {
        if (estoque >= quantidade) {
            estoque -= quantidade;
            System.out.println("Venda realizada. Novo estoque: " + estoque);
        } else {
            System.out.println("Estoque insuficiente para a venda.");
        }
    }
    public void devolucao(int quantidade){
        this.estoque+=quantidade;
        System.out.println("Estoque atualizado.\nQuantidade do produto em estoque: "+this.estoque);
    }
}

