package templatemethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioEfetivadoTest {

    @Test
    void deveRetonarAprovado() {
        FuncionarioEfetivado funcionarioEfetivado = new FuncionarioEfetivado();
        funcionarioEfetivado.setHorasTrabalhadas(8);
        assertEquals("Liberado", funcionarioEfetivado.verificarHoras());
    }

    @Test
    void deveRetonarReprovado() {
        FuncionarioEfetivado funcionarioEfetivado = new FuncionarioEfetivado();
        funcionarioEfetivado.setHorasTrabalhadas(6);
        assertEquals("Não Liberado", funcionarioEfetivado.verificarHoras());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioEfetivado funcionarioEfetivado = new FuncionarioEfetivado();
        funcionarioEfetivado.setHorasTrabalhadas(9);
        funcionarioEfetivado.setNome("Maria");
        funcionarioEfetivado.setId(1);
        assertEquals("FuncionarioEfetivado{id=1, nome='Maria', resultado=Liberado}", funcionarioEfetivado.getInfo());
    }
}
