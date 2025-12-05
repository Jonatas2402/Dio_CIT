package generics.map_interface.contato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatosMap;

    public AgendaContatos() {
        this.contatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        contatosMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!contatosMap.isEmpty()){
           if (contatosMap.containsKey(nome)){
               contatosMap.remove(nome);
           } else {
               System.out.println("Contato não encontrado.");
           }
        }
    }
    public void exibirContatos() {
        System.out.println(contatosMap);
    }
    public void pesquisarPorNome(String nome) {
        if (!contatosMap.isEmpty()){
            if (contatosMap.containsKey(nome)){
                System.out.println("Número de " + nome + ": " + contatosMap.get(nome));
            }else {
                System.out.println("Número de " + nome + " não encontrado.");
            }
        }
    }
}
