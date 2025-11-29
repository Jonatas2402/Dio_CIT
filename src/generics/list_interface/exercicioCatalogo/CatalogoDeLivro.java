package generics.list_interface.exercicioCatalogo;

import java.util.ArrayList;
import java.util.List;

public class CatalogoDeLivro {
    List<Livro> livros;

    public CatalogoDeLivro() {
        this.livros = new ArrayList<>();
    }

    public void adicionar(String titulo, String autor, int anoLancamento){
        livros.add(new Livro(titulo, autor, anoLancamento));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livros.isEmpty()){//Para saber se a lista esta vazio.
            for (Livro l : livros){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisaLivroPorAno(int anoInicial, int anoFinal){
        List<Livro> livroPorIntervaloDeAno = new ArrayList<>();
        if (!livros.isEmpty()){
            for (Livro l : livros){
                if (l.getAnoLancamento() >= anoInicial && l.getAnoLancamento() <= anoFinal){
                    livroPorIntervaloDeAno.add(l);
                }
            }
        }
        return livroPorIntervaloDeAno;
    }
    public Livro pesquisaPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livros.isEmpty()){
            for (Livro l : livros){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoDeLivro catalogo = new CatalogoDeLivro();
        catalogo.adicionar("Livro 1", "Autor 1", 2025);
        catalogo.adicionar("Livro 2", "Autor 2", 2023);
        catalogo.adicionar("Livro 3", "Autor 3", 2020);
        catalogo.adicionar("Livro 3", "Autor 2", 2000);
        catalogo.adicionar("Livro 4", "Autor 4", 1890);
        catalogo.adicionar("Livro 5", "Autor 5", 1998);

        System.out.println(catalogo.pesquisarPorAutor("Autor 2"));

        System.out.println(catalogo.pesquisaPorTitulo("Livro 3"));
    }
}
