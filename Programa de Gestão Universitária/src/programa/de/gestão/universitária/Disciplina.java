/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.de.gestão.universitária;
import static programa.de.gestão.universitária.CursoTableModel.Cursos;

/**
 *
 * @author Isello
 */
public class Disciplina {
    
    private int idDisciplina;
    private String nomeDisciplina;
    private String siglaDisciplina;
    private String professor;
    private String curso;

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getSiglaDisciplina() {
        return siglaDisciplina;
    }

    public void setSiglaDisciplina(String siglaDisciplina) {
        this.siglaDisciplina = siglaDisciplina;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    

    public Disciplina() {
    }

    public Disciplina(int idDisciplina, String nomeDisciplina, String siglaDisciplina, String professor, String curso) {
        this.idDisciplina = idDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.siglaDisciplina = siglaDisciplina;
        this.professor = professor;
        this.curso = curso;
    }
}
