public class Circulo extends Figura{
    public double radio;

    public Circulo(double radio){
        this.radio=radio;
    }

    public double area() {
        return Math.PI*Math.pow(radio,2);
    }
}
