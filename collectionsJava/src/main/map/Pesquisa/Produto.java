package main.map.Pesquisa;

public class Produto {
    
    private double valor;
    private String nome;
    private int quantidade;
    
    public Produto(double valor, String nome, int quantidade) {
        this.valor = valor;
        this.nome = nome;
        this.quantidade = quantidade;
    }


    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto [valor=" + valor + ", nome=" + nome + ", quantidade=" + quantidade + "]";
    }

}
