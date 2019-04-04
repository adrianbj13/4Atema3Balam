
package Tema3_MetodosNumericos;

import java.util.ArrayList;

public class csMetodoGauss {
    
    ArrayList<csFilaGauss>Gauss(double x1, double x2, double x3, double x4, double error){
        
        double ErrorCalculado = 0;
        int k=1;
        
        double X1=x1;
        double X2=x2;
        double X3=x3;
        double X4=x4;
        double r1,r2,r3,r4;
        ArrayList<csFilaGauss>lista;
        lista= new ArrayList<csFilaGauss>();
        
        do{
           csFilaGauss fila = new csFilaGauss();
           
           fila.setK(k);
          //  System.out.println("K:"+fila.getK());
           fila.setX1(this.Despeje1(X2, X3));
            //System.out.println("X1:"+fila.getX1());
           fila.setX2(this.Despeje2(fila.getX1(), X3, X4));
            //System.out.println("X2:"+fila.getX2());
           fila.setX3(this.Despeje3(fila.getX1(), fila.getX2(), X4));
            //System.out.println("X3:"+fila.getX3());
           fila.setX4(this.Despeje4(fila.getX2(),fila.getX4()));
            //System.out.println("X4:"+fila.getX4());
           
           r1=Math.abs(X1-fila.getX1());
          //  fila.setResta1(r1);
            //System.out.println(" r1:"+fila.getResta1());
            r2=Math.abs(X2-fila.getX2());
           // fila.setResta2(r2);
            //System.out.println(" r2:"+fila.getResta2());
            r3=Math.abs(X3-fila.getX3());
            fila.setResta3(r3);
           // System.out.println(" r3:"+fila.getResta3());
            r4=Math.abs(X4-fila.getX4());
            //System.out.println("r4:"+fila.getResta4());
           // fila.setResta4(r4);
            
                        
            X1=fila.getX1();
            X2=fila.getX2();
            X3=fila.getX3();
            X4=fila.getX4();
            

            double Resta1 = Math.max(r1, Math.max(r2, Math.max(r3, r4)));

            double Resta2 = Math.max(Math.abs(fila.getX1()), Math.max(Math.abs(fila.getX2()), Math.max(Math.abs(fila.getX3()), Math.abs(fila.getX4()))));

            
            ErrorCalculado=Resta1/Resta2;
            fila.setError(ErrorCalculado);
           // System.out.println(" Error:"+fila.getError());
            lista.add(fila);
            k++;
            
        }while(error<ErrorCalculado);
        return lista;
    }
        private double Despeje1(double x2, double x3){
        return (6+ x2-(2*x3))/10;
    }
    
    private double Despeje2(double x1, double x3, double x4){
        return (25+x1+x3-(3*x4))/11;
    }
    
    private double Despeje3(double x1, double x2, double x4){
        return (-11-(2*x1)+x2+x4)/10;
    }
    
    private double Despeje4(double x2, double x3){
        return (15-(3*x2)+x3)/8;
    }
}
