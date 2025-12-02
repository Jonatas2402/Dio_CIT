package generics.set_interface.exercicioTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefas> tarefasSet = new HashSet<>();


    public void adicionar(String descricao){
        tarefasSet.add(new Tarefas(descricao));
    }
    public void remover(String descricao){
        Set<Tarefas> tarefasExcluir = new HashSet<>();
        if (!tarefasSet.isEmpty()){
            for (Tarefas t : tarefasSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefasExcluir.add(t);
                }
            }
        }
        tarefasSet.removeAll(tarefasExcluir);
    }
    public void exibirTarefas() {
        System.out.println(tarefasSet);
    }
    public void contarTarefas() {
        System.out.println("Total de tarefas: " + tarefasSet.size());
    }
    public Set<Tarefas> tarefasConcluidas(){
        Set<Tarefas> tarefasFeitas = new HashSet<>();
        if (!tarefasSet.isEmpty()){
            for (Tarefas t : tarefasSet){
                if (t.isTarefaConcluida()){
                    tarefasFeitas.add(t);
                }
            }

        }
        return tarefasFeitas;
    }
    public Set<Tarefas> tarefasPendentes() {
        Set<Tarefas> setTarefasPendentes = new HashSet<>();
        if (!tarefasSet.isEmpty()){
            for (Tarefas t : tarefasSet){
                if (t.isTarefaConcluida() == false){
                    setTarefasPendentes.add(t);
                }
            }
        }
        return setTarefasPendentes;
    }
    public void marcarTarefaConcluida(String descricao){
        if (!tarefasSet.isEmpty()){
            for (Tarefas t : tarefasSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setTarefaConcluida(true);
                }
            }
        }
    }
    public void marcarTarefaPendente(String descricao){
        if (!tarefasSet.isEmpty()){
            for (Tarefas t : tarefasSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setTarefaConcluida(false);
                }
            }
        }
    }
    public void limparListaTarefas() {
        tarefasSet.clear();
    }
}
