package generics.set_interface.exerciciosContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaDeContatos {
    Set<Contatos> contatosSet;

    public AgendaDeContatos(Set<Contatos> contatosSet) {
        this.contatosSet = new HashSet<>();
    }
    public void adicionar(String nome, int numero) {
        contatosSet.add(new Contatos(nome, numero));
    }
    public void exibirContatos() {
        System.out.println(contatosSet);
    }
    public Set<Contatos> pesquisarPorNome(String nome) {
        Set<Contatos> nomeBusca = new HashSet<>();
        for (Contatos c : contatosSet) {
            if (c.getNome().startsWith(nome)){
                nomeBusca.add(c);
            }
        }
        return nomeBusca;
    }

    public Contatos atualizarNomeroContato (String nome, int novoNumero){
        Contatos contatoAtualizado = null;
        for (Contatos c : contatosSet) {
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

}
