package generics.map_interface.Ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventosMap.put(data, new Evento(nome, atracao));
    }
    public void exibirEvento() {
        /*O LocalDate  implementa o ChronaLocalDate.
        Que por sua vez implementa o Comparable.
        sendo assim não preciso fazer uma lógica para exibir na ordem crescente de data..*/
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

        System.out.println(eventosTreeMap);
    }
    public void obterProximoEvento(){
        /*Pegando a data atual*/
        LocalDate dataAtual = LocalDate.now();
        /*Eventos em ordem cronológica.*/
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        /*Percorrendo lista e eventos, e retornando o próximo evento.*/
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if (entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento " + proximoEvento + " acontecerá na data: " + proximaData);
                break;
            }
        }
    }

}
