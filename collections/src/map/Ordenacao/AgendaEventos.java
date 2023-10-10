package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> agendaEventosMap;

    public AgendaEventos() {
        this.agendaEventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        agendaEventosMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> agendaEventoTreeMap = new TreeMap<>(agendaEventosMap);
        System.out.println(agendaEventoTreeMap);
    }

    public void obterProximoEvento(){
        /*Set<LocalDate> dataSet = agendaEventosMap.keySet(); retorna um set de chaves(key)
        Collection<Evento> values = agendaEventosMap.values(); coleção de valores(values)*/
        // agendaEventosMap.get(values;)

        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> agendaEventoTreeMap = new TreeMap<>(agendaEventosMap);
        for(Map.Entry<LocalDate, Evento> entry : agendaEventoTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento " + entry.getValue() + " acontecerá na data: " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2023, 5, 1), "Dia do Trabalho", "Feira de Negócios");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 9, 7), "Festival de Gastronomia", "Banda Terra");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 12), "Dia das Crianças", "Patati e Patatá");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 11, 2), "Finados", "Missa");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
