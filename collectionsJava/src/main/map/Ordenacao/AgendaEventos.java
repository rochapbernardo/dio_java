package main.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }
    
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        //Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirEvento(){
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento(){
        /*Set<LocalDate> dateSet = eventoMap.keySet();
        Collection<Evento> values = eventoMap.values();
        evento.get();*/

        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        if(!eventoTreeMap.isEmpty()){
            for(Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()){
                if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                    System.out.println("Próximo evento " + entry.getValue() + " acontecerá na data: " + entry.getKey());
                }
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.MAY, 3), "Tardezinha", "Thiaguinho");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.NOVEMBER, 9), "AmarElo", "Emicida");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.MARCH, 1), "Carnaval", "Blocos de rua");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.FEBRUARY, 20), "Estudar", "Eu");

        agendaEventos.exibirEvento();

        agendaEventos.obterProximoEvento();
    }
}
