import models.Aluno;
import models.Curso;
import models.Disciplina;
import models.Grade;
import operations.UniaoCursoGrade;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tá tudo certo...");
        UniaoCursoGrade uniao = new UniaoCursoGrade();

        Curso curso = new Curso(12345, "Diretio");

        Grade grade = new Grade(11223, "Direito Civil");

        Disciplina disciplina1 = new Disciplina(3344, "Defesa do Consumidor");
        Disciplina disciplina2 = new Disciplina(3344, "Defesa2");
        Disciplina disciplina3 = new Disciplina(3344, "Defesa3");

        Aluno aluno1 = new Aluno(54321, "Roberto");
        Aluno aluno2 = new Aluno(13542, "Joao");
        Aluno aluno3 = new Aluno(53124, "Davi");
        Aluno aluno4 = new Aluno(24351, "Robson");
        Aluno aluno5 = new Aluno(42315, "Lau");

        grade.addDisciplina(disciplina1);
        grade.addDisciplina(disciplina2);
        grade.addDisciplina(disciplina3);

        uniao.unirCursoGrade(curso, grade);

        curso.addAluno(aluno1);
        curso.addAluno(aluno2);
        curso.addAluno(aluno3);
        curso.addAluno(aluno4);
        curso.addAluno(aluno5);

        System.out.println(curso.exibirAlunos());
        System.out.println(curso.exibirGrade());
    }
}
