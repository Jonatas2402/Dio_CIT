package stream__api.interfaces__Funcionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */
public class PredicateExemplo {
    public static void main(String[] args) {
        //Criando lista de nomes.
        List<String> lista = Arrays.asList("Python", "Java", "Ruby", "Go", "JavaScript");

        //Criando um Predicate para checar o tamanho das palavras.
        Predicate<String> maiorPalavra = p -> p.length() >= 4;


      //Filtrando e imprimindo a maior palavra.
        lista.stream()
                .filter(maiorPalavra)
                .forEach(System.out::println);

    }
}
