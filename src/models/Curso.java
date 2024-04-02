package models;

import models.Aluno;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int codigo;
    private String nome;
    private List<Aluno> alunos = new ArrayList<Aluno>();
    private Grade grade = null;

    public Curso(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public String exibirAlunos() {
        StringBuilder exibicao = new StringBuilder();
        exibicao.append("models.Curso: " + this.nome + "\n" + "Alunos: " + "\n");
        for(Aluno aluno : alunos) {
            String texto =
                    "Nome: " + aluno.getNome() +
                    "\nMatricula: " + aluno.getMatricula() +
                    "\n";
            exibicao.append(texto);
        }
        return exibicao.toString();
    }

    public String exibirGrade() {
        StringBuilder exibicao = new StringBuilder();
        exibicao.append("Grade: ").append(grade.getNome()).append("\n").append("Disciplinas: ").append("\n");
        for(Disciplina disciplina : grade.getDisciplina()) {
            String texto =
                    "Nome: " + disciplina.getNome() +
                    "\nCódigo: " + disciplina.getCodigo() +
                    "\n";
            exibicao.append(texto);
        }
        return exibicao.toString();
    }
}
