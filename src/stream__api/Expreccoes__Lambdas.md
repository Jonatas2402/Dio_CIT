As expressões lambda permitem representar interfaces funcionais (interfaces com um único método abstrato)
de forma mais concisa e possibilitam escrever código no estilo funcional.

As interfaces funcionais desempenham um papel crucial na programação funcional em Java.
Pois servem de base para o uso de expressões lambda.

Uma função lambda é uma função sem declaração, isto é, não é necessário colocar um nome.
Um tipo de retorno e o modificador de acesso.
A ideia é que o método seja declarado no mesmo lugar em que será usado.

As funções lambda em Java tem a sintaxe definida como (argumento) -> (corpo).

public class OrdenacaoPessoa {
//atributo
private List<Pessoa> pessoaList;

//construtor
public OrdenacaoPessoa() {
this.pessoaList = new ArrayList<>();
}

public List<Pessoa> ordenarPorAltura() {
if (!pessoaList.isEmpty()) {
List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
pessoasPorAltura.sort((p1, p2) -> Double.compare(p1.getAltura(), p2.getAltura()));
return pessoasPorAltura;
} else {
throw new RuntimeException("A lista está vazia!");
}
}
}