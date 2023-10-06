package list.Ordenacao;

import java.util.HashSet;
import java.util.Set;

public class GerenciadorAlunos {
    private Set<Aluno> gerenciarAluno;

    public GerenciadorAlunos() {
        this.gerenciarAluno = new HashSet<>();
    }

    public void adicionarAluno (String nome, long matricula, double nota){
        gerenciarAluno.add(new Aluno(nome, matricula, nota));
    }
}
