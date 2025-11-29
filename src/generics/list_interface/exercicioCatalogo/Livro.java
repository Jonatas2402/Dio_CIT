package generics.list_interface.exercicioCatalogo;

public class Livro {
    private String titulo;
    private String autor;
    private int anoLancamento;

    public Livro(String titulo, String nome, int anoLancamento) {
        this.titulo = titulo;
        this.autor = nome;
        this.anoLancamento = anoLancamento;
    }

    public String getTitulo() {
        return titulo;
    }


    public String getAutor() {
        return autor;
    }


    public int getAnoLancamento() {
        return anoLancamento;
    }


    @Override
    public String toString() {
        return "Livro: " + titulo +
                ", Autor: " + autor +
                ", Ano de lançamento: " + anoLancamento;
    }
}
