
package Tema3_MetodosNumericos;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class csModeloTablaGauss extends AbstractTableModel{
    
    String cabezera[]={"k","x1","x2","x3","x4","error"};
    ArrayList<csFilaGauss>lista;

    public csModeloTablaGauss(ArrayList<csFilaGauss> lista) {
        this.lista=lista;
    }
    
    public csModeloTablaGauss(){
        
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.cabezera.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        switch(columna){
            case 0: return this.lista.get(fila).getK();
            case 1: return this.lista.get(fila).getX1();
            case 2: return this.lista.get(fila).getX2();
            case 3: return this.lista.get(fila).getX3();
            case 4: return this.lista.get(fila).getX4();
            case 5: return this.lista.get(fila).getError();
            default: return null;
        }
    }
    
            @Override
    public String getColumnName(int i) {
        //return super.getColumnName(i); //To change body of generated methods, choose Tools | Templates.
        return this.cabezera[i];
    }
}
