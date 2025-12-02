package generics.set_interface.exercicioConvite;

public class Main {
    public static void main(String[] args) {
        ListaConvidado listaConvidado = new ListaConvidado();
        System.out.println("Existem " + listaConvidado.contar() + " convidados na lista");


        listaConvidado.adicionar("Jonatas", 210202);
        listaConvidado.adicionar("Luiz", 2151321);
        listaConvidado.adicionar("Karenn", 1215418);
        listaConvidado.adicionar("Larissa", 2151351);
        listaConvidado.adicionar("João", 125132015);
        listaConvidado.adicionar("Narciso", 215164156);
        listaConvidado.adicionar("Fabio", 21651321);

        System.out.println("Existem " + listaConvidado.contar());

        listaConvidado.exibirConvidatdos();

        listaConvidado.removerPorCodigo(2151351);

        listaConvidado.exibirConvidatdos();

    }
}
