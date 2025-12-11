package stream__api.interfaces__Funcionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */
public class FunctionExemplo {
    public static void main(String[] args) {
        //Cria uma lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Utiliza function e lambda para dobrar os números.
        Function<Integer, Integer> dpbrar = numero -> numero * 2;

        //Colocando os números dobrados em uma outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(dpbrar)
                .toList();

        //Imprimindo números dobrados.
        numerosDobrados.forEach(System.out::println);

    }
}
