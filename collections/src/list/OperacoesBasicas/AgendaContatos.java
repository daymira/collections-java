package list.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer numero){
        agendaContatosMap.put(nome, numero);
    }

    public void removerContato(String nome){
        if(!agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatosMap.isEmpty()){
            numeroPorNome= agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    } 

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Luan", 123456789);
        agendaContatos.adicionarContato("Iza", 1111111111);
        agendaContatos.adicionarContato("Ana", 128547886);
        agendaContatos.adicionarContato("Iza Martins", 215687841);
        agendaContatos.adicionarContato("Iza", 555555555);



        agendaContatos.exibirContato();

        agendaContatos.removerContato("Iza");
        agendaContatos.exibirContato();


    }
}


