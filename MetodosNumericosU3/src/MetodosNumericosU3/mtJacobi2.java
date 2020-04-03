
package MetodosNumericosU3;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author vjRorigo
 */
public class mtJacobi2 extends AbstractTableModel {
     csMetodoJacobi a = new csMetodoJacobi();

    private String[] columna = {"X1", "X2", "X3", "X4"};
    private ArrayList<csFilaJacobi> lista;

    public mtJacobi2(ArrayList<csFilaJacobi> lista) {
        this.lista = lista;
    }

    public mtJacobi2() {

    }
    
    @Override
    public int getRowCount() {
       return this.lista.size();
    }

    @Override
    public int getColumnCount() {
    return this.columna.length;
    }

    @Override
    public Object getValueAt(int fi, int columnas) {
        switch (columnas) {
            case 0:
                return this.lista.get(fi).getRestX1();
            case 1:
                return this.lista.get(fi).getRestX2();
            case 2:
                return this.lista.get(fi).getRestX3();
            case 3:
                return this.lista.get(fi).getRestX4();
            default:
                return null;

        }
    }

    public String getColumnName(int i) {
        return this.columna[i];
    }
}
