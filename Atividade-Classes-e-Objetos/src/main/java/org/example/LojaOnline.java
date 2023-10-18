public class LojaOnline {
    private String nome;
    private int numeroProdutos;
    private boolean aberta;
    public LojaOnline(){}
    public LojaOnline(String nome, int numeroProdutos, boolean aberta) {
        this.nome = nome;
        this.numeroProdutos = numeroProdutos;
        this.aberta = aberta;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNumeroProdutos(int numeroProdutos){
        this.numeroProdutos = numeroProdutos;
    }
    public int getNumeroProdutos() {
        return numeroProdutos;
    }
    public void setAberta(boolean aberta){
        this.aberta = aberta;
    }
    public boolean isAberta() {
        return aberta;
    }

    public void adicionarProduto() {
        numeroProdutos++;
        System.out.println("Produto adicionado. Total: " + numeroProdutos + " produtos.");
    }

    public void removerProduto() {
        if (numeroProdutos > 0) {
            numeroProdutos--;
            System.out.println("Produto removido. Total: " + numeroProdutos + " produtos.");
        } else {
            System.out.println("A loja está vazia. Nenhum produto para remover.");
        }
    }

    public void fecharLoja() {
        aberta = false;
        System.out.println("A loja foi fechada.");
    }
}
