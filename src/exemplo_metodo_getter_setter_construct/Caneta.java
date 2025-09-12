package exemplo_metodo_getter_setter_construct;

public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    //O Metodo abaixo é o metodo construtor
    //Lembresse sempre, o metodo construtor tem sempre o mesmo nome da classe
    public Caneta (String m, String c, float p) {
        setModelo(m);
        setCor(c);
        setPonta(p);
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void Status() {
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }

}
