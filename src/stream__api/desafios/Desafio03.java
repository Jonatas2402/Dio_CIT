package stream__api.desafios;

import java.util.Arrays;
import java.util.List;
/*
*  Verifique se todos os números da lista são positivos:
Com a ajuda da Stream API, verifique se todos os números da lista
*  são positivos e exiba o resultado no console.*/
public class Desafio03 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPositivos = numeros.stream()
                .filter(n -> n >= 0)
                .sorted()
                .toList();

        System.out.println("Números positivos: ");
        numerosPositivos.forEach(System.out::println);
    }
}
