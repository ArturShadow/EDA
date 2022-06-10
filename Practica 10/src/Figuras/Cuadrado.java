package Figuras;

public class Cuadrado extends Figura {
    public double lado;

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public void CalcularArea() {
        // TODO Auto-generated method stub
        setArea(Math.pow(lado, 2));
    }

    @Override
    public void CalcularPerim() {
        // TODO Auto-generated method stub
        setPerimetro(getLado()*4);
    }

    
}
