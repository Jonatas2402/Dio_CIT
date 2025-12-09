Method Reference é um novo recurso do Java 8 que permite fazer referência a um método ou construtor de uma classe (de forma funcional)
e assim indicar que ele deve ser utilizado num ponto específico do código.
Deixando-o mais simples e legível.

Para utilizá-lo, basta informar uma classe ou referência seguida do símbolo “::” e o nome do método sem os parênteses no final.

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
pessoasPorAltura.sort(Comparator.comparingDouble(Pessoa::getAltura));
return pessoasPorAltura;
} else {
throw new RuntimeException("A lista está vazia!");
}
}
}