package main.set.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{
    private String nome;
    private long cod;
    private double preco;
    private int quant;

    public Produto(String nome, long cod, double preco, int quant) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quant = quant;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    } 
    public long getCod() {
        return cod;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuant() {
        return quant;
    }
    public void setCod(long cod) {
        this.cod = cod;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setQuant(int quant) {
        this.quant = quant;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (cod ^ (cod >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (cod != other.cod)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +"; Código: " + cod + "; Preco: " + preco + "; Quantidade: " + quant;
    }

}

class ComparetorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
    
}
