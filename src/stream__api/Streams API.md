Streams Api.

A Streams API traz uma nova opção para a manipulação de coleções em Java
seguindo os princípios da programação funcional.

Stream, trata-se de uma poderosa solução para processar coleções de maneira declarativa.
Ao invés da tradicional e burocrática forma imperativa.

List<Item> itemList = new ArrayList<>();

public Double calcularValorTotal(){
double total = 0;
for (Item t: itemList){
total+= t.getPreco() * t.getQuantidade() ;
}
return total;
}


Na forma imperativa, para realizar uma soma simples, por exemplo, o desenvolvedor
tem que se preocupar não apenas com o que deve ser feito em cada elemento.
isto é, com as regras associadas ao processamento dos elementos da lista, mas também com a maneira de realizar essa iteração.

private List<Item> itemList;

//método para calcular valor total dos itens utilizando o Stream API
public double calcularValorTotal() {
if (itemList.isEmpty()) {
throw new RuntimeException("A lista está vazia!");
}
return itemList.stream()
.mapToDouble(item -> item.getPreco() * item.getQuant())
.sum();
}
}