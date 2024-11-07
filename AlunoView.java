import java.util.Scanner;

public class AlunoView {
    private Scanner scanner;

    public AlunoView() {
        scanner = new Scanner(System.in);
    }

    public String getNome() {
        System.out.print("Digite o nome do aluno: ");
        return scanner.nextLine();
    }

    public int getIdade() {
        System.out.print("Digite a idade do aluno: ");
        return scanner.nextInt();
    }

    public String getPlano() {
        scanner.nextLine(); 
        System.out.print("Digite o objetivo do aluno (ex: hipertrofia, emagrecimento...: ");
        return scanner.nextLine();
    }

    public void mostrarAluno(Aluno aluno) {
        System.out.println(aluno.toString());
    }
}
