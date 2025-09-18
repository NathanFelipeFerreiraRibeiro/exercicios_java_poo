package ex07;
import static java.lang.Math.pow;

public class Circulo {
    private float raio;

    public Circulo(float r) {
        if(r <= 0) {
            throw new IllegalArgumentException("Raio não pde ser menor e nem igual a zero.");
        }

        this.raio = r;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float r) {
        this.raio = r;
    }

    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    public void circunferencia() {
        double pi = Math.PI;

        System.out.println("\nCircunferencia do Circulo: " + 2 * pi * 10);
    }
}
