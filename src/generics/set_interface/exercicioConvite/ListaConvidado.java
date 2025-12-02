package generics.set_interface.exercicioConvite;

import java.util.HashSet;
import java.util.Set;

public class ListaConvidado {
    private Set<Convidado> listaConvidados;

    public ListaConvidado() {
        this.listaConvidados = new HashSet<>();
    }

    public void adicionar(String nome, int codigo) {
        listaConvidados.add(new Convidado(nome, codigo));
    }
    public void removerPorCodigo(int codigo){
       Convidado removerConvidado = null;
       for (Convidado c : listaConvidados){
           if (c.getCodigoConvite() == codigo){
               removerConvidado = c;
               break;
           }
       }
       listaConvidados.remove(removerConvidado);
    }
    public int contar(){
        return listaConvidados.size();
    }
    public void exibirConvidatdos() {
        System.out.println(listaConvidados);
    }
}

