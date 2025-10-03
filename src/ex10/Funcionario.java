package ex10;

public class Funcionario {
    private float salarioBase;

    public Funcionario(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getsalarioBase() {
        return salarioBase;
    }

    public void salarioComBonus() {
        float percentual = 0.17f;
        float bonus = salarioBase * percentual;

        if (bonus <= 0) {
            throw new IllegalArgumentException("O Bônus não pode ser menor ou igual a zero.\nInsira um valor valido.");
        }

        if(bonus > (salarioBase*2)) {
            throw new IllegalArgumentException("O Bônus não pode ser maior que 100%");
        }
        System.out.println("O seu bônus é de " + (int)(percentual * 100) + "%.");
        System.out.println("Seu novo salário é de R$" + String.format("%.2f", (salarioBase + bonus)));
    }

    public void cabecalho() {
        System.out.println("\t\t----------------");
        System.out.println("\t\t| NOVO SALÁRIO |");
        System.out.println("\t\t----------------\n");
    }
}
