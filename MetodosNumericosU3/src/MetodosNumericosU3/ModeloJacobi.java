
package MetodosNumericosU3;
import javax.swing.table.AbstractTableModel;

public class ModeloJacobi extends AbstractTableModel {
    private int filas, columnas;
    private String cabecera[];
    private double matriz[][];
    
    public ModeloJacobi(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.cabecera=new String[columnas];
        for (int col=0;col<this.columnas;col++)
        {
         this.cabecera[col]="X"+(col+1);
        }
        
        this.matriz=new double[this.filas][this.columnas];
    }

    @Override
    public String getColumnName(int i) {
        
        return this.cabecera[i]; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public int getRowCount() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
     return this.filas;
    }

    @Override
    public int getColumnCount() {
        return this.cabecera.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return this.matriz[row][col];
    }

    @Override
    public void setValueAt(Object o, int row, int col) {
        //super.setValueAt(o, i, i1); //To change body of generated methods, choose Tools | Templates.
        this.matriz[row][col]= 
                Double.parseDouble((String) o);
    }
    
    

    @Override
    public boolean isCellEditable(int i, int i1) {
        return true;
    }
    
    public double[][] getMatriz()
    {
      return this.matriz;
    }

    
}
