package stream__api.interfaces__Funcionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
 * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
 */
public class BinaryOperatorExemplo {
    public static void main(String[] args) {
        //Criando uma lista de números inteiros.
        List<Integer> numeros  = Arrays.asList(1, 2, 3, 4, 5);


        //Utilizando BinaryOperator com lambda para somar dois números.

        BinaryOperator<Integer> soma = Integer::sum;

        //Utilizando o BinaryOperator para somar todos os números.

        int resultado = numeros.stream()
                .reduce(0, soma);

        //Imprimindo a soma.

        System.out.printf("O resultado da soma é: " + resultado);
    }
}
