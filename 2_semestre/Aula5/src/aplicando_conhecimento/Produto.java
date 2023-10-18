package Aula5.src.aplicando_conhecimento;

public class Produto {
    public int codigo;
    public String descricao;
    private double preco;
    private int quantidade;

    public double calculaValor(){
        return getPreco() * getQuantidade();
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}