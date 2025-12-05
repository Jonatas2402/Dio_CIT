package generics.map_interface.mapEstoque;

import java.util.HashMap;
import java.util.Map;

public class EstoqueMap {
    private Map<Long, Produto> estoqueMap;

    public EstoqueMap() {
        this.estoqueMap = new HashMap<>();
    }

    public void adicionar(Long cod, String nome, Double preco, Integer quantidade) {
        estoqueMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        if (!estoqueMap.isEmpty()) {
            System.out.println(estoqueMap);
        } else {
            System.out.println("Lista vazia.");
        }
    }

    public double calculaValirTotal() {
        double total = 0;
        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                total += p.getQuantidade() * p.getPreco();
            }
        }
        return total;
    }

    public Produto maiorValor() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }
    public Produto menorValor(){
        Produto produtoMenor = null;
        double menorValor = Double.MAX_VALUE;
        if (!estoqueMap.isEmpty()){
            for (Produto p : estoqueMap.values()) {
                if (p.getPreco() < menorValor) {
                    produtoMenor = p;
                }
            }
        }
        return produtoMenor;
    }
}
