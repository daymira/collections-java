package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> listPessoa;

    public OrdenacaoPessoa() {
        this.listPessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listPessoa);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listPessoa);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenarPessoa = new OrdenacaoPessoa();

        ordenarPessoa.adicionarPessoa("Laura", 25, 1.65);
        ordenarPessoa.adicionarPessoa("Marco", 36, 1.82);
        ordenarPessoa.adicionarPessoa("Maira", 29, 1.60);
        ordenarPessoa.adicionarPessoa("Ines", 50, 1.64);
        ordenarPessoa.adicionarPessoa("Vitor", 19, 1.77);

        System.out.println(ordenarPessoa.ordenarIdade());
        System.out.println(ordenarPessoa.ordenarPorAltura());

    }
}
