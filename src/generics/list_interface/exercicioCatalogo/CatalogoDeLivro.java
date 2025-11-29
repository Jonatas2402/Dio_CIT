package generics.list_interface.exercicioCatalogo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalogoDeLivro {
    List<Livro> livros;

    public CatalogoDeLivro(List<Livro> livros) {
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
    public List<Livro> pesquisaPorTitulo(String titulo){
        List<Livro> livroPorAutor = new ArrayList<>();
        if (!livros.isEmpty()){
            for (Livro l : livros){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    }

    public static void main(String[] args) {
        CatalogoDeLivro catalogo = new CatalogoDeLivro(new ArrayList<>());
        catalogo.adicionar("Princesa isabel", "Isabel", 2025);
        catalogo.adicionar("João e o pé de feijão", "João", 2023);
        catalogo.adicionar("Escrava isaura", "Isaura", 2024);

        catalogo.pesquisarPorAutor("João");

    }
}
