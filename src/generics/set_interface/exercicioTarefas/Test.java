package generics.set_interface.exercicioTarefas;

public class Test {
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        lista.adicionar("Fazer feira");
        lista.adicionar("Comprar leite");
        lista.adicionar("Comprar carro");

        lista.exibirTarefas();
        System.out.println("\n");
        lista.marcarTarefaConcluida("Comprar carro");
        lista.marcarTarefaConcluida("Comprar leite");
        System.out.println(lista.tarefasConcluidas());
        System.out.println("\n");
        lista.marcarTarefaPendente("Comprar carro");
        System.out.println(lista.tarefasPendentes());

        lista.remover("Fazer feira");

        lista.limparListaTarefas();

        lista.exibirTarefas();





    }
}
