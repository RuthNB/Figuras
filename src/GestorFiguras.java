import java.util.Arrays;
public class GestorFiguras {
    public static double suma(Figura[] listaFiguras) {
        double res = 0;
        for (Figura f : listaFiguras) {
            res = res + f.area();
        }
        return res;
    }
    public static void sort(Figura[]listaFiguras){
        Arrays.sort(listaFiguras);
        for(Figura f:listaFiguras){
            System.out.println(f.area());
        }
    }
    public static void main(String[] args){
        Figura[] listaFiguras=new Figura[4];
        Cuadrado q = new Cuadrado(5);
        Circulo c = new Circulo(7.5);
        Triangulo t= new Triangulo(2,4);
        Rectangulo r= new Rectangulo(5,2);
        listaFiguras[0]=q;
        listaFiguras[1]=t;
        listaFiguras[2]=c;
        listaFiguras[3]=r;
        System.out.println(suma(listaFiguras));
        sort(listaFiguras);
    }
}
