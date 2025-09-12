package ex04;

public class instanciarAluno {
    public static void main(String[] args) {
        String nome = "Nathan";
        float n1 = 5.56f;
        float n2 = 5.65f;
        float n3 = 9.35f;

        Aluno a1 = new Aluno(nome, n1, n2, n3);
        a1.media();
    }
}
