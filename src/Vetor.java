public class Vetor {
  Aluno vetor[] = new Aluno[100];
  private int totalAlunos = 0;

  // Adiciona aluno no inicio do vetor
  public void adiciona(Aluno aluno) {
    vetor[totalAlunos] = aluno;
    totalAlunos++;
  }

  public boolean posicaoOcupada(int posicao) {
    return posicao > 0 && posicao < totalAlunos;
  }

  public Aluno buscaPorPosicao(int posicao) {
    if (!posicaoOcupada(posicao)) {
      throw new IllegalArgumentException("Posição Inválida!");
    }
    return vetor[posicao];
  }

  public void inserePorPosicao(int posicao, Aluno aluno) {
    if (!posicaoOcupada(posicao)) {
      throw new IllegalArgumentException("Posição Inválida!");
    }
    for (int i = totalAlunos - 1; i >= posicao; i--) {
      vetor[i + 1] = vetor[i];
    }
    vetor[posicao] = aluno;
    totalAlunos++;
  }

  // Metodo para mostrar todos os alunos adicionados no vetor
  public String mostraTodos() {
    StringBuilder alunos = new StringBuilder();

    for (int i = 0; i < totalAlunos; i++) {
      if (vetor[i] != null) {
        alunos.append(vetor[i].getNome()).append(", ");
      }
    }

    return alunos.toString();
  }

  // Verifica se determinado aluno está no vetor
  public boolean contemAluno(String nome) {
    for (int i = 0; i < totalAlunos; i++) {
      if (vetor[i].getNome().equals(nome)) {
        return true;
      }
    }
    return false;
  }

  // Verifica tamanho do vetor
  public int tamanhoAtual() {
    // Você vai apagar esse comentario e implementar aqui seu código conforme
    // critérios da prova
  }

  // Consulta aluno por ID
  public String consultaAluno(int id) {
    // Você vai apagar esse comentario e implementar aqui seu código conforme
    // critérios da prova
  }

}
