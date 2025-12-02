package generics.set_interface.exerciciosContatos;

import java.util.Objects;

public class Contatos {
    private String nome;
    private  int numero;

    public Contatos(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contatos contatos = (Contatos) o;
        return numero == contatos.numero && Objects.equals(nome, contatos.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "Número: " + numero;
    }

}
