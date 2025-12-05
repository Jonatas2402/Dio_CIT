package generics.map_interface.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;


    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionar (String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void remover (String palavra) {
        if (!dicionarioMap.isEmpty()) {
            if (dicionarioMap.containsKey(palavra)){
                dicionarioMap.remove(palavra);
            }else {
                System.out.println("Palavra não encontrada");
            }
        }
    }
    public void exibirPalavra(){
        if (!dicionarioMap.isEmpty()){
            System.out.println(dicionarioMap);
        }else {
            System.out.println("Dicionario vazio.");
        }
    }
    public void pesquisarPorPalavra (String palavra) {
        if (!dicionarioMap.isEmpty()) {
            if (dicionarioMap.containsKey(palavra)) {
                System.out.println("definição de " + palavra + ": " + dicionarioMap.get(palavra));
            }else {
                System.out.println("Palavra não encontrada.");
            }
        }
    }

}
