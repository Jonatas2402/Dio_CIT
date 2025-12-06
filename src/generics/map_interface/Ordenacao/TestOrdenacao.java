package generics.map_interface.Ordenacao;

import java.time.LocalDate;
import java.time.Month;

public class TestOrdenacao {
    public static void main(String[] args) {
        AgendaEventos eventos = new AgendaEventos();

        eventos.adicionarEvento(LocalDate.now(), "Jornada java", "Jonatas silva");
        eventos.adicionarEvento(LocalDate.of(2025,Month.DECEMBER, 07), "Amanhã", "Dia de amanhã");
        eventos.adicionarEvento(LocalDate.of(2025,Month.DECEMBER,25),"Natal", "Nascimento de Cristo");
        eventos.adicionarEvento(LocalDate.of(2025, Month.DECEMBER, 31), "Ano novo", "Final do ano");

        eventos.exibirEvento();

        eventos.obterProximoEvento();
    }
}
