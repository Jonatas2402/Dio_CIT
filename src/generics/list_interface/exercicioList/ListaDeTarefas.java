package generics.list_interface.exercicioList;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {
    private final List<Tarefas> tarefasList = new ArrayList<>();

    public void adicionarTarefa(String descricao){
        tarefasList.add(new Tarefas(descricao));
    }
    public void removerTarefa(String decricao){
       List<Tarefas> tarefasParaRemover = new ArrayList<>();
       /*Percorre o tarefasList*/
       for (Tarefas t: tarefasList){
           if (t.getDescricao().equalsIgnoreCase(decricao)){
               /*Adiciona na tarefas para remover a tarefa que será excluída.*/
               tarefasParaRemover.add(t);
               /*percorrendo a lista para saber qual descrição será excluída.*/
           }
       }
       tarefasList.removeAll(tarefasParaRemover);
       /*Removendo da lista as tarefas selecionadas.*/
    }
    public void obterNumeroTotalDeTarefas(){
        System.out.println("Total de tarefas: " + tarefasList.size());
    }
    public void obterDescricoesTarefas() {
        System.out.println("Descrição: " + tarefasList);
    }

    public static void main(String[] args) {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();
        listaDeTarefas.obterNumeroTotalDeTarefas();

        listaDeTarefas.adicionarTarefa("Fazer feira.");
        listaDeTarefas.obterDescricoesTarefas();
        listaDeTarefas.obterNumeroTotalDeTarefas();
    }
}
