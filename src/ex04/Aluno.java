package ex04;

public class Aluno {
    private String nome;
    private float nota1 = 0;
    private float nota2 = 0;
    private float nota3 = 0;

    public Aluno(String nome, float n1, float n2, float n3) {
        this.nome = nome;
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return this.nota1;
    }

    public void setNota1(float n1) {
        this.nota1 = n1;
    }

    public float getNota2() {
        return this.nota2;
    }

    public void getNota2(float n2) {
        this.nota2 = n2;
    }

    public float getNota3() {
        return this.nota3;
    }

    public void setNota3(float n3) {
        this.nota3 = n3;
    }

    public void media() {
        float media = (this.nota1 + this.nota2 + this.nota3) / 3;

        System.out.println("A média do aluno " + this.getNome() + " é: " + String.format("%.1f", media));

        if (media < 6) {
            System.out.println("O aluno está: Reprovado");
        } else {
            System.out.println("O aluno está: Aprovado");
        }
    }
}
