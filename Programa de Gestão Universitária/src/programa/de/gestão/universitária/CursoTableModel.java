
package programa.de.gestão.universitária;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class CursoTableModel extends AbstractTableModel{
    
    private String[] colunas = {"Código","Curso"};
    public static ArrayList<Curso> Cursos = new ArrayList<>();

    @Override
    public String getColumnName(int column) {
        return colunas[column]; 
    }
    
    @Override
    public int getRowCount() {
        return Cursos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            case 0:
                return Cursos.get(linha).getIdCurso();
            case 1:
                return Cursos.get(linha).getNomeCurso();
        }
        return null;
    }
    
        @Override
    public void setValueAt(Object value, int linha, int coluna) {
        
        switch(coluna){
            case 1:
                Cursos.get(linha).setNomeCurso((String) value);
                break;
        }
        this.fireTableRowsUpdated(linha, linha);
    }
    
    public void addRow(Curso p){
        this.Cursos.add(p);
        this.fireTableDataChanged();
    }
    public void removeRow(int linha){
        this.Cursos.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
}

