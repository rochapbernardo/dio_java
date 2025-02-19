package main.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> produtoSet;

    public CadastroProduto(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade){
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProduto(){
        Set<Produto> produtosNome = new TreeSet<>(produtoSet);
        return produtosNome;
    }

    public Set<Produto> exibirPreco(){
        Set<Produto> produtosPreco = new TreeSet<>(new ComparetorPreco());
        produtosPreco.addAll(produtoSet);
        return produtosPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProdutos = new CadastroProduto();

        cadastroProdutos.adicionarProduto("Maça", 123, 3.98, 5);
        cadastroProdutos.adicionarProduto("Banana", 456, 5.99, 2);
        cadastroProdutos.adicionarProduto("Maracujá", 789, 7.58, 3);
        cadastroProdutos.adicionarProduto("Limão", 123, 4.78, 8);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProduto());

        System.out.println(cadastroProdutos.exibirPreco());
    }
}
