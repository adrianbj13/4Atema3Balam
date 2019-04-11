package Tema3_MetodosNumericos;

import Tema3_MetodosNumericos.csMetodoJacobi;
import Tema3_MetodosNumericos.csFilaJacobi;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class csModeloTablaJacovi2 extends AbstractTableModel {

    csMetodoJacobi a = new csMetodoJacobi();

    private String[] columna = {"X1", "X2", "X3", "X4"};
    private ArrayList<csFilaJacobi> lista;

    public csModeloTablaJacovi2(ArrayList<csFilaJacobi> lista) {
        this.lista = lista;
    }

    public csModeloTablaJacovi2() {

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
                return this.lista.get(fi).getRestaX1();
            case 1:
                return this.lista.get(fi).getRestaX2();
            case 2:
                return this.lista.get(fi).getRestaX3();
            case 3:
                return this.lista.get(fi).getRestaX4();
            default:
                return null;
        }
    }
    
    public String getColumnName(int i) {
        return this.columna[i];
    }

}
