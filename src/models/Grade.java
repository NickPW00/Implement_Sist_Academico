package models;

import models.Curso;
import models.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class Grade {
    private int codigo;
    private String nome;
    private List<Disciplina> disciplina = new ArrayList<>();
    private Curso curso = null;

    public Grade(int codigo, String nome) {
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

    public List<Disciplina> getDisciplina() {
        return disciplina;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void addDisciplina(Disciplina disciplinaDesjd){
        disciplina.add(disciplinaDesjd);
    }
}
