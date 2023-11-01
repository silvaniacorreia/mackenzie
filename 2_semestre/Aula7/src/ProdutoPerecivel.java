public class ProdutoPerecivel extends Produto {
    int validade;

    public ProdutoPerecivel(String nome, int quantidade, double preco, int validade) {
        super(nome, quantidade, preco);
        this.validade = validade;
    }

    @Override
    public void retiraEstoque(int qtde) {
        if (validade < 2) {
            quantidade = 0;
        } else if (quantidade < qtde) {
            System.out.println("Estoque insuficiente.");
        } else {
            quantidade -= qtde;
        }
    }

    @Override
    public void entraEstoque(int qtde) {
        if (quantidade == 0 || (quantidade > 0 && validade < 2)) {
            quantidade += qtde;
        } else {
            System.out.println("O estoque não está zerado. Não é possível adicionar produtos.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + validade;
    }
}
