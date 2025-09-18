package ex08;

import java.math.BigDecimal;

public class instanciarContaBancaria {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("123");
        c1.depositar(BigDecimal.valueOf(100));
        System.out.println("R$" + c1.getSaldo());
        c1.sacar(new BigDecimal(50));
        System.out.println("R$" + c1.getSaldo());
        c1.depositar(new BigDecimal(40));
        System.out.println("R$" + c1.getSaldo());
        c1.sacar(new BigDecimal(70));
        System.out.println("R$" + c1.getSaldo());
        c1.sacar(new BigDecimal(21));
    }
}
