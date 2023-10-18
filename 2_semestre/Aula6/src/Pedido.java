public class Pedido {
    private int numero; // número do pedido
    private Produto item; // produto que compõe o pedido
    private int quantidade; // quantidade pedida do produto
    private double valor; // valor total do pedido

    public Pedido(int numero, Produto item, int quantidade) {
        this.numero = numero;
        this.item = item;
        this.quantidade = quantidade;
        this.valor = 0; // inicializa o valor com zero
    }

    public void calculaPedido() {
        // calcula o valor do pedido multiplicando o preço do produto pela quantidade
        this.valor = this.item.getPreco() * this.quantidade;
    }

    public String toString() {
        // retorna uma string com as informações do pedido
        return "Número do pedido: " + this.numero + "\n" +
                "Código do Produto: " + this.item.getCod() + "\n" +
                "Descrição: " + this.item.getDescricao() + "\n" +
                "Preço do Produto: " + this.item.getPreco() + "\n" +
                "Quantidade: " + this.quantidade + "\n" +
                "Valor total do pedido: " + this.valor;

    }
}
