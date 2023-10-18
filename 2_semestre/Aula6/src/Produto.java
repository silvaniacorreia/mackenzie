public class Produto {
    private int cod; // código do produto
    private String descricao; // nome do produto
    private double preco; // preço do produto

    public Produto(int cod, String descricao, double preco) {
        this.cod = cod;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }
}
