package generics.map_interface.dicionario;

public class DicionarioMapMain {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionar("Somar", "É a ação de adicionar um elemento a algo.");
        dicionario.adicionar("dividir", "É a ação de partilhar algo.");
        dicionario.adicionar("subtrair", "É a ação de diminuir algo.");

        dicionario.exibirPalavra();

        dicionario.pesquisarPorPalavra("Somar");
    }
}
