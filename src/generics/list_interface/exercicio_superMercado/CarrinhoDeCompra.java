package generics.list_interface.exercicio_superMercado;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

    List<Item> itemList = new ArrayList<>();


    public void adicionar(Item item){
        itemList.add(item);
    }
    public void remover(String nome){
        List<Item> itensRemover = new ArrayList<>();
        for (Item i : itemList){
            if (i.getNome().equalsIgnoreCase(nome)){
                itensRemover.add(i);
            }
        }
        itemList.removeAll(itensRemover);
    }
    public Double calcular(){
        double total = 0;

        for (Item t: itemList){
            total+= t.getPreco();
        }
        return total;
    }
    public void exibirItem(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

        carrinho.adicionar(new Item("Tv", 2500.0, 50));
        carrinho.adicionar(new Item("PlayStation 5", 3999.9, 40));
        carrinho.exibirItem();

        System.out.println("Valor total: " + carrinho.calcular());
        carrinho.remover("Tv");
        carrinho.exibirItem();
    }
}
