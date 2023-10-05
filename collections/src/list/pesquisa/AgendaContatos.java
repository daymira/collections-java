package list.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }
    
    public void adicionarContato(String nome, int numero){
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c : contatosSet){
            if(c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    } 

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatosSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Ana", 359812514);        
        agendaContatos.adicionarContato("Paula", 254789747);
        agendaContatos.adicionarContato("Lucio", 256897458);
        agendaContatos.adicionarContato("Ana", 258795478);
        agendaContatos.adicionarContato("Ana Maria", 258795478);

        agendaContatos.exibirContato();
        System.out.println(agendaContatos.pesquisarPorNome("Ana"));
        System.out.println("Contato atualizado "+ agendaContatos.atualizarNumeroContato("Ana Maria", 125478987));
    }
}
