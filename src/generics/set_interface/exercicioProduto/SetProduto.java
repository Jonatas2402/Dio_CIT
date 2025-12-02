package generics.set_interface.exercicioProduto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetProduto {
    Set<Produto> produtoSet = new HashSet<>();

    public SetProduto() {

    }
    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }
    public Set<Produto> exibirProdutosPorNome() {
        /*O treeSet ordena nossos elementos que já foi implementado o comparable.*/
        Set<Produto> produtoOrdenadoNome = new TreeSet<>(produtoSet);
        return produtoOrdenadoNome;
    }
    public Set<Produto> exibirProdutosPorPreco() {
        /**/
        TreeSet<Produto> ordenados = new TreeSet<>(new ComparatorPorPreco());
            ordenados.addAll(produtoSet);
        return ordenados;
        }
    }