package templatemethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioEstagioTest {

    @Test
    void deveRetonarLiberado() {
        FuncionarioEstagio funcionario = new FuncionarioEstagio();
        funcionario.setHorasTrabalhadas(6);
        assertEquals("Liberado", funcionario.verificarHoras());
    }

    @Test
    void deveRetonarReprovado() {
        FuncionarioEstagio funcionario = new FuncionarioEstagio();
        funcionario.setHorasTrabalhadas(5);
        assertEquals("Não Liberado", funcionario.verificarHoras());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioEstagio funcionario = new FuncionarioEstagio();
        funcionario.setHorasTrabalhadas(5);
        funcionario.setNome("Maria");
        funcionario.setId(2);
        assertEquals("Funcionario{id=2, nome='Maria', resultado=Não Liberado}", funcionario.getInfo());
    }
}
