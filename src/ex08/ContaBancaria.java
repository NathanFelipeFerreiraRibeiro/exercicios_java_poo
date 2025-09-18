package ex08;

import java.math.BigDecimal;

public class ContaBancaria {
    private String numeroConta;
    private BigDecimal saldo = BigDecimal.valueOf(0f);

    public ContaBancaria(String numeroConta) {
        if (numeroConta == null) {
            throw new IllegalArgumentException("Todos os cliente tem que ter um número de conta");
        }
        this.numeroConta = numeroConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void depositar(BigDecimal valor) {
        this.saldo = this.saldo.add(valor);
    }

    public void sacar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("ERRO! Não é possível sacar um valor negativo ou nulo!");
        }

        if (valor.compareTo(this.saldo) > 0) {
            throw new IllegalArgumentException("ERRO! Não é possível sacar um valor maior que o seu saldo!");
        }

        this.saldo = this.saldo.subtract(valor);
    }

}
