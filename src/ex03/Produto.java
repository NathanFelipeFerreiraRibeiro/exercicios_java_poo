package ex03;

public class Produto {
    String nomeProduto;
    float precoBruto;
    float descontoPercentual;


    public Produto(String np, float pb, float dp) {
        if (dp < 0 || dp > 100) {
            throw new IllegalArgumentException("Valor deve ser entre 0 e 100");
        }
        this.nomeProduto = np;
        this.precoBruto = pb;
        this.descontoPercentual = dp;
    }

    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public void setNomeProduto(String np) {
        this.nomeProduto = np;
    }

    public float getPrecoBruto() {
        return this.precoBruto;
    }

    public void setPrecoBruto(float pb) {
        this.precoBruto = pb;
    }

    public float getDescontoPercentual() {
        return this.descontoPercentual;
    }

    public void setDescontoPercentual(float dp) {
        this.descontoPercentual = dp;
    }

    public void precoFinal() {
        System.out.println("Produto: " + this.getNomeProduto());
        System.out.println("Preco final com desconto de " + (int) this.getDescontoPercentual() + "%: R$" + String.format("%.2f", (this.getPrecoBruto() - (this.getPrecoBruto() * (this.getDescontoPercentual() / 100)))));
    }
}
