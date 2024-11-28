import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VetorTest {

  @Test
  public void testTamanhoAtual() {
    Vetor vetor = new Vetor();
    Aluno a1 = new Aluno();
    Aluno a2 = new Aluno();

    a1.setNome("Maria");
    a2.setNome("José");

    // Inicialmente, o tamanho deve ser 0
    assertEquals(0, vetor.tamanhoAtual(), "O vetor deve estar vazio inicialmente.");

    // Após adicionar alunos, o tamanho deve refletir corretamente
    vetor.adiciona(a1);
    assertEquals(1, vetor.tamanhoAtual(), "O tamanho do vetor deve ser 1 após adicionar um aluno.");

    vetor.adiciona(a2);
    assertEquals(2, vetor.tamanhoAtual(), "O tamanho do vetor deve ser 2 após adicionar dois alunos.");
  }

  @Test
  public void testConsultaAluno() {
    Vetor vetor = new Vetor();
    Aluno a1 = new Aluno();
    Aluno a2 = new Aluno();

    a1.setNome("Maria");
    a2.setNome("José");

    // Adiciona alunos ao vetor
    vetor.adiciona(a1);
    vetor.adiciona(a2);

    // Consulta alunos por índice
    assertEquals("Maria", vetor.consultaAluno(0), "O aluno na posição 0 deve ser 'Maria'.");
    assertEquals("José", vetor.consultaAluno(1), "O aluno na posição 1 deve ser 'José'.");

    // Testa consulta em uma posição inválida (fora do intervalo)
    Exception exception = assertThrows(NullPointerException.class, () -> {
      vetor.consultaAluno(5);
    });
    assertNotNull(exception, "Consultar uma posição inválida deve lançar uma NullPointerException.");
  }
}
