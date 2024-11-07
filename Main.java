public class Main {
    public static void main(String[] args) {
        AlunoView view = new AlunoView();
        AlunoService service = new AlunoService(view);

        System.out.println("Bem-vindo ao sistema de cadastro de alunos da academia!");

        Aluno aluno = service.criarAluno();

        System.out.println("\nCadastro realizado:");
        service.exibirAluno(aluno);
    }
}
