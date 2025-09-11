package ex02;

public class Pessoas {
    private String nome;
    private String cpf;
    private int anonascimento;

    public Pessoas(String nome, String cpf, int anoNascimento) {
        setNome(nome);
        setCPF(cpf);
        setAnoNascimento(anoNascimento);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return this.cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public int getAnoNascimento() {
        return this.anonascimento;
    }

    public void setAnoNascimento(int ano) {
        this.anonascimento = ano;
    }

    public void apresentar() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCPF());
        System.out.println("Ano: " + this.getAnoNascimento());
    }
}