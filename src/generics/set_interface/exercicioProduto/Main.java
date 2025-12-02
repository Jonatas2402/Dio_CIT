package generics.set_interface.exercicioProduto;

public class Main {
    public static void main(String[] args) {
        SetProduto produto = new SetProduto();

        produto.adicionarProduto(123456789, "Liquidificador", 160.00, 50);
        produto.adicionarProduto(789456123, "Tv 40", 1850.00, 80);
        produto.adicionarProduto(258741963, "Air fryer", 250.00, 120);

        System.out.println(produto.exibirProdutosPorNome());

        System.out.println(produto.exibirProdutosPorPreco());
    }
}
