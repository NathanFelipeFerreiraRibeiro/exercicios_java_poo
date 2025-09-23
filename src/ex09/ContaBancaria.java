package ex09;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.Deque;

class operacao {
    private final String tipo;
    private final BigDecimal valor;
    private final LocalDateTime data = LocalDateTime.now();
    private final BigDecimal saldoFinal;

    public operacao(String tipo, BigDecimal valor, BigDecimal saldoFinal) {
        this.tipo = tipo;
        this.valor = valor;
        this.saldoFinal = saldoFinal;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return String.format("[%s] %s: %s | Saldo:  %s",
                data.format(fmt),
                tipo,
                valor,
                saldoFinal);
    }
}

public class ContaBancaria {
    private BigDecimal saldo = BigDecimal.valueOf(0f);
    private final Deque<operacao> extrato;
    private final int limiteExtrato = 10;

    public ContaBancaria() {
        this.saldo = BigDecimal.ZERO;
        this.extrato = new ArrayDeque<>();
    }

    public void depositar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Valor do depósito deve ser positivo");
        }

        saldo = saldo.add(valor);
        registrarOperacao("DEPÓSITO", valor, saldo);
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal valor) {
        this.saldo = saldo.add(valor);
    }

    public void sacar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("ERRO! Não é possível sacar um valor negativo ou nulo!");
        }

        if (valor.compareTo(this.saldo) > 0) {
            throw new IllegalArgumentException("ERRO! Não é possível sacar um valor maior que o seu saldo!");
        }

        saldo = saldo.subtract(valor);
        registrarOperacao("SAQUE", valor.negate(), saldo);
    }

    private void registrarOperacao(String tipo, BigDecimal valor, BigDecimal saldoFinal) {
        if (extrato.size() == limiteExtrato) {
            extrato.removeFirst();
        }

        extrato.addLast(new operacao(tipo, valor , saldoFinal));
    }

    public void imprimirExtrato() {
        System.out.println("Extrato da conta: ");
        extrato.forEach(System.out::println);
    }

}
