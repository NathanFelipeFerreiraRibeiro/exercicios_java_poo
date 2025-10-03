package ex10;

import java.math.BigDecimal;

public class instanciarFuncionario {
    public static void main(String[] args) {
        Funcionario f = new Funcionario(1000);

        f.cabecalho();
        System.out.println("O seu salário base é R$" + String.format("%.2f", f.getsalarioBase()) + ".");
        f.salarioComBonus();
    }
}
