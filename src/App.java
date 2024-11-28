import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Estância variável scanner para capturar entradas de usuário
        Scanner scanner = new Scanner(System.in);

        // Estância uma variável com nome "vetor" do tipo Vetor definido em outra classe
        Vetor vetor = new Vetor();

        // Cria uma variávem com nome de "a1" do tipo Aluno definido em outra classe
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();

        // System.out.print("Entre com o nome do aluno: ");
        a1.setNome("Maria");
        a2.setNome("José");
        a3.setNome("Juca");
        a4.setNome("Francisco");
        a5.setNome("Marlete");

        // Adiciona a variável a1 no vetor.
        vetor.adiciona(a1);
        vetor.adiciona(a2);
        vetor.adiciona(a3);
        vetor.adiciona(a4);

        // Chama o método "mostraTodos()" e exibe seu retorno.
        System.out.println("vetor.mostraTodos(): " + vetor.mostraTodos());

        // Chama o método "contemAluno()" para verificar se existe determinado aluno na
        // lista.
        System.out.println("vetor.contemAluno(): " + vetor.contemAluno("Francisco"));

        // Chama o método "tamanhoAtual" para mostrar quando alunos estão inseridos na
        // lista.
        System.out.println("vetor.tamanhoAtual(): " + vetor.tamanhoAtual());

        System.out.println("vetor.consultaAluno(): " + vetor.consultaAluno(2));

        System.out.println("vetor.buscaPorPosicao(): " + vetor.buscaPorPosicao(1).getNome());

        vetor.inserePorPosicao(1, a5);
        System.out.println("vetor.mostraTodos(): " + vetor.mostraTodos());

        scanner.close();
    }

}
