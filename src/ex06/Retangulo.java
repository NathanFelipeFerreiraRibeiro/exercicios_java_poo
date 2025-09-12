package ex06;

public class Retangulo {
    private float largura;
    private float altura;

    public Retangulo(float l, float a) {
        if(l < 0) {
            throw new IllegalArgumentException("Largura invalida: a Largura não pode ser menor que zero!");
        }

        if(a < 0) {
            throw new IllegalArgumentException("Altura invalida: a Altura não pode ser menor que zero!");
        }

        this.largura = l;
        this.altura = a;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura( float l) {
        this.largura =l;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura (float a) {
        this.altura = a;
    }

    public void area() {
        System.out.println("\nÁREA (em metros)");
        System.out.println("largura: " + this.getLargura());
        System.out.println("altura: " + this.getAltura());
        System.out.println("Essa área é de: " + (this.getLargura() * this.getAltura()) + "m²");
    }

    public void perimetro() {
        float perimetro = (this.getAltura()*2) + (this.getAltura()*2);

        System.out.println("\nPERIMETRO (em metros)");
        System.out.println("largura: " + this.getLargura());
        System.out.println("altura: " + this.getAltura());
        System.out.println("Esse perimetro é de:" + ((this.getAltura()*2) + (this.getAltura()*2)));
    }
}
