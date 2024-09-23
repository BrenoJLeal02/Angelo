import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    protected String nome;
    protected LocalDate dataDeNascimento;

    public Pessoa(String nome, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public int obterIdade() {
        return Period.between(dataDeNascimento, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return nome + ", Data de Nascimento: " + dataDeNascimento;
    }
}
