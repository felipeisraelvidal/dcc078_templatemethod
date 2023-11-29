package templatemethod;

public class FuncionarioEfetivado extends Funcionario {

    public String verificarHoras() {
        if (this.calcularHorasSemana() >= 40) {
            return "Liberado";
        }
        else {
            return "Não Liberado";
        }
    }

    @Override
    public String getTipo() {
        return "FuncionarioEfetivado";
    }
}
