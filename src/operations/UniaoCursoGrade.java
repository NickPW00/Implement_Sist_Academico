package operations;

import models.Curso;
import models.Grade;

public class UniaoCursoGrade {
    public UniaoCursoGrade(){
    }
    public void unirCursoGrade(Curso curso, Grade grade){
        curso.setGrade(grade);
        grade.setCurso(curso);
    }
}
