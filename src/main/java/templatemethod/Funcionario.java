package templatemethod;

public abstract class Funcionario {

    private int id;
    protected String nome;
    private int horasTrabalhadas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int calcularHorasSemana() {
        return this.horasTrabalhadas *5;
    }

    public abstract String verificarHoras();

    public String getTipo() {
        return "Funcionario";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "id=" + this.id +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarHoras() +
                '}';
    }
}

