
package Tema3_MetodosNumericos;

public class csFilaGauss {
    
    private int k;
    private double x1;
    private double x2;
    private double x3;
    private double x4;
    
    private double resta1;
    private double resta2;
    private double resta3;
    private double resta4;
    
    private double error;

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getX4() {
        return x4;
    }

    public void setX4(double x4) {
        this.x4 = x4;
    }

    public double getResta1() {
        return resta1;
    }

    public void setResta1(double resta1) {
        this.resta1 = resta1;
    }

    public double getResta2() {
        return resta2;
    }

    public void setResta2(double resta2) {
        this.resta2 = resta2;
    }

    public double getResta3() {
        return resta3;
    }

    public void setResta3(double resta3) {
        this.resta3 = resta3;
    }

    public double getResta4() {
        return resta4;
    }

    public void setResta4(double resta4) {
        this.resta4 = resta4;
    }

    public double getError() {
        return error;
    }

    public void setError(double error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "csFilaGauss{" + "k=" + k + ", x1=" + x1 + ", x2=" + x2 + ", x3=" + x3 + ", x4=" + x4 + ", resta1=" + resta1 + ", resta2=" + resta2 + ", resta3=" + resta3 + ", resta4=" + resta4 + ", error=" + error + '}';
    }
    
    
}
