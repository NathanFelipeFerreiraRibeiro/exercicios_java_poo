package ex09;

import java.math.BigDecimal;
import java.time.LocalDate;

public class instanciarContaBancaria {
        public static void main(String[] args) {
            LocalDate data = LocalDate.now();

            ContaBancaria conta = new ContaBancaria();
            conta.depositar(new BigDecimal("100.00"));
            conta.sacar(new BigDecimal("30.00"));
            conta.depositar(new BigDecimal("50.00"));
            conta.imprimirExtrato();
        }
}
