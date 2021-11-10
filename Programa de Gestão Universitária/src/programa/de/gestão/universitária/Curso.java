/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programa.de.gestão.universitária;

import java.util.ArrayList;

/**
 *
 * @author Isello
 */
public class Curso {
    private int idCurso;
    String nomeCurso;
    

    public int getIdCurso() {
        return idCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Curso(int idCurso, String nomeCurso) {
        this.idCurso = idCurso;
        this.nomeCurso = nomeCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public Curso() {
    }
    
    @Override
    public String toString() {
        return this.nomeCurso;
    }

    
    
}
