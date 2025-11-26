package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsList {
    public static void main(String[] args) {
        /*Exemplo de uma lista sem generics*/
        List listaSemGenerics = new ArrayList<>();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10);
        //Permite inserir qualquer elemento.

        /*Lista com generics*/
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");
        //So permite adicionar Strings

        /*Iterando a lista com generics*/
        for (String c : listaGenerics){
            System.out.println(c);
        }
    }
}
