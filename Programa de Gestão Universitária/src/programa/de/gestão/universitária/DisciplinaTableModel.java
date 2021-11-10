/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.de.gestão.universitária;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import static programa.de.gestão.universitária.CursoTableModel.Cursos;

/**
 *
 * @author Isello
 */
public class DisciplinaTableModel extends AbstractTableModel{
    
    private String[] colunas = {"Disciplina","ID","Sigla","Professor","Curso"};
    public static ArrayList<Disciplina> Disciplinas = new ArrayList<>();

    @Override
    public String getColumnName(int column) {
        return colunas[column]; 
    }
    
    @Override
    public int getRowCount() {
        return Disciplinas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            case 0:
                return Disciplinas.get(linha).getNomeDisciplina();
            case 1:
                return Disciplinas.get(linha).getIdDisciplina();
            case 2:
                return Disciplinas.get(linha).getSiglaDisciplina();
            case 3:
                return Disciplinas.get(linha).getProfessor();
            case 4:
                return Disciplinas.get(linha).getCurso();     
        }
        return null;
    }
    
        @Override
    public void setValueAt(Object value, int linha, int coluna) {
        
        switch(coluna){
            case 0:
                Disciplinas.get(linha).setNomeDisciplina((String) value);
                break;
            case 2:
                Disciplinas.get(linha).setSiglaDisciplina((String) value);
                break;     
            case 3:
                Disciplinas.get(linha).setProfessor((String) value);
                break;    
            case 4:
                Disciplinas.get(linha).setCurso((String) value);
                break;                  
        }
        this.fireTableRowsUpdated(linha, linha);
    }
    
    public void addRow(Disciplina p){
        this.Disciplinas.add(p);
        this.fireTableDataChanged();
    }
    public void removeRow(int linha){
        this.Disciplinas.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
}
