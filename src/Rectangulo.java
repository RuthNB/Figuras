public class Rectangulo extends Figura{
    public double lado1;
    public double lado2;

    public Rectangulo(double lado1,double lado2){
        this.lado1=lado1;
        this.lado2=lado2;
    }

    public double area() {
        return lado1*lado2;
    }
}
