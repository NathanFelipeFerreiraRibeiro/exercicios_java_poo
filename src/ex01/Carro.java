package ex01;

public class Carro {
        public String marca;
        public String categoria;
        public String modelo;
        public String cor;
        int anoFabricacao;
        int anoModelo;

        protected void Status() {
            System.out.println("Marca: " + this.marca);
            System.out.println("Categoria: " + this.categoria);
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Cor: " + this.cor);
            System.out.println("Ano de Fabricação: " + this.anoFabricacao);
            System.out.println("Ano do Modelo: " + this.anoModelo);
        }
}

class instanciar{
    public static void main(String[] args) {
            Carro c1 = new Carro();
            c1.marca = "Chevrolet";
            c1.categoria = "Prisma";
            c1.modelo = "LTZ";
            c1.cor = "Preto";
            c1.anoFabricacao = 2019;
            c1.anoModelo = 2019;
            c1.Status();
    }
}
