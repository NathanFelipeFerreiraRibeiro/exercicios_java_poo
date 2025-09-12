package ex03;

public class instanciarProduto {
    public static void main(String[] args) {
        String nomeProduto = "Pão de Forma(Panco)";
        float precoBruto = 10f;
        float descontoProduto = 5f;
        Produto p1 = new Produto(nomeProduto, precoBruto, descontoProduto);
        p1.precoFinal();
    }
}
