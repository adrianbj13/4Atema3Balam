package Tema3_MetodosNumericos;

import Tema3_MetodosNumericos.csFilaJacobi;
import java.util.ArrayList;
import javax.swing.JOptionPane;

  /*CHI PECH LUIS ESTEBAN 
    JOSÉ EDUARDO PISTE COUOH
    WILIAM GUSTAVO DZUL CASTILLO*/

public class csMetodoJacobi {

    public ArrayList<csFilaJacobi> Jacobi(double x1, double x2, double x3, double x4, double errorDeseado) {

        double Error;
        double AuxX1 = x1;
        double AuxX2 = x2;
        double AuxX3 = x3;
        double AuxX4 = x4;
        
        ArrayList<csFilaJacobi> lista;
        int i = 1;
        lista = new ArrayList<csFilaJacobi>();
        do {
            csFilaJacobi fila = new csFilaJacobi();

            fila.setX1(this.formulax1(AuxX2, AuxX3));

            fila.setX2(this.formulax2(AuxX1, AuxX3, AuxX4));
            fila.setX3(this.formulax3(AuxX1, AuxX2, AuxX4));
            fila.setX4(this.formulax4(AuxX2, AuxX3));
           
            double RX1, RX2, RX3, RX4;
            
            RX1 = Math.abs(fila.getX1() - AuxX1);
            fila.setRestaX1(RX1);
         
            RX2 = Math.abs(fila.getX2() - AuxX2);
            fila.setRestaX2(RX2);
            
            RX3 = Math.abs(fila.getX3() - AuxX3);
            fila.setRestaX3(RX3);
           
            RX4 = Math.abs(fila.getX4() - AuxX4);
            fila.setRestaX4(RX4);

            AuxX1 = fila.getX1();
            
            AuxX2 = fila.getX2();
            
            AuxX3 = fila.getX3();
            
            AuxX4 = fila.getX4();
            

            double Resta1 = Math.max(RX1, Math.max(RX2, Math.max(RX3, RX4)));

            double Resta2 = Math.max(Math.abs(fila.getX1()), Math.max(Math.abs(fila.getX2()), Math.max(Math.abs(fila.getX3()), Math.abs(fila.getX4()))));
           
            Error = Resta1 / Resta2;
            
            a.setError(Error);
            
            fila.setK(i++);
            lista.add(fila);
            

        } while (errorDeseado <= Error);
        
        return lista;
    }
    csFilaJacobi a = new csFilaJacobi();
    public String e (){
        return String.valueOf(a.getError());
    }
    
    public double formulax1(double X2, double X3) {
        return (6 + X2 - 2 * X3) / 10;
    }

    public double formulax2(double X1, double X3, double X4) {

        return (25 + X1 * X3 - 3 * X4) / 11;
    }

    public double formulax3(double X1, double X2, double X4) {

        return (-11 - 2 * X1 + X2 + X4) / 10;
    }

    public double formulax4(double X2, double X3) {

        return (15 - 3 * X2 + 3 * X3) / 8;
    }

}
