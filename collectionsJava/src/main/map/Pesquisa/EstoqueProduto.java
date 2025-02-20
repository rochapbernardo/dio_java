package main.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> produtos;

    public EstoqueProduto() {
        this.produtos = new HashMap<>();
    }

    public void adicionarProduto(long cod, double valor, String nome, int quant){
        produtos.put(cod, new Produto(valor, nome, quant));
    }

    public void exibirProdutos(){
        System.out.println(produtos);
    }
    
    public double valorEstoque(){
        double valorTotalEstoque = 0;
        if(!produtos.isEmpty()){
            for(Produto p: produtos.values()){
                valorTotalEstoque += p.getQuantidade() * p.getValor();
            }
        }
        return valorTotalEstoque;
    }

    public Produto produtoCaro(){
        double aux = 0;
        Produto produtoCaro = null;
        if(!produtos.isEmpty()){
            for(Produto p: produtos.values()){
                if(p.getValor()>aux){
                    aux = p.getValor();
                    produtoCaro = p;
                }
            }
        }
        return produtoCaro;
    }

    public Produto produtoBarato(){
        Produto produtoBarato = null;
        double aux = Double.MAX_VALUE;
        
        if(!produtos.isEmpty()){
            for(Produto p: produtos.values()){
                if(p.getValor()<aux){
                    aux = p.getValor();
                    produtoBarato = p;
                }
            }
        }
        return produtoBarato;
    }

    public Produto quantidadeValor(){
        Produto maior = null;
        double aux = 0;
        double quantVal;
        if(!produtos.isEmpty()){
            for(Produto p : produtos.values()){
                quantVal = p.getValor() * p.getQuantidade();
                if(quantVal > aux){
                    aux = quantVal;
                    maior = p;
                }
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();

        estoque.adicionarProduto(1L, 11.99, "Produto0", 2);
        estoque.adicionarProduto(2L, 7.99, "Produto1", 6);
        estoque.adicionarProduto(3L, 3.99, "Produto2", 20);
        estoque.adicionarProduto(4L, 15.89, "Produto3", 5);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoque.valorEstoque());
        System.out.println("Produto mais barato: " + estoque.produtoBarato() + "; Produto mais caro: " + estoque.produtoCaro());
        System.out.println("Maior valor por quantidade: " + estoque.quantidadeValor());
    }
}
