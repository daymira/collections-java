package list.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo){
        convidadoSet.add(new Convidado(nome, codigo));
    }

    public void removerPorCodConvite (int codigo){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigo() == codigo ){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados (){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();
        System.out.println("Existem "+ conjuntoConvidado.contarConvidados() + " convidado(s) no Set.");

        conjuntoConvidado.adicionarConvidado("Laura", 1);
        conjuntoConvidado.adicionarConvidado("Marcos", 2);
        conjuntoConvidado.adicionarConvidado("Isabela", 3);
        conjuntoConvidado.adicionarConvidado("Leticia", 4);
        conjuntoConvidado.adicionarConvidado("Vitor", 4);

        conjuntoConvidado.exibirConvidados();

        System.out.println("Existem "+ conjuntoConvidado.contarConvidados() + " convidado(s) no Set.");

        conjuntoConvidado.removerPorCodConvite(4);
        System.out.println("Existem "+ conjuntoConvidado.contarConvidados() + " convidado(s) no Set.");
        conjuntoConvidado.exibirConvidados();


    }
}
