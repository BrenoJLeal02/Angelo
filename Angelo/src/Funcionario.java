import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private LocalDate dataDeNascimento;
    private String cargo;
    private double salario;
    private LocalDate dataAdmissao;
    private Endereco endereco;
    private TelsContato telsContato;

    public Funcionario(String nome, LocalDate dataDeNascimento, String cargo, double salario, LocalDate dataAdmissao, Endereco endereco, TelsContato telsContato) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.endereco = endereco;
        this.telsContato = telsContato;
    }

    public void reajustarSalario(double percentual) {
        if (percentual > 0) {
            salario += salario * (percentual / 100);
            System.out.println("Salário reajustado para: " + salario);
        } else {
            System.out.println("Percentual inválido. O reajuste não foi aplicado.");
        }
    }

    public void promover(String novoCargo) {
        this.cargo = novoCargo;
        System.out.println("Funcionário promovido para: " + novoCargo);
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nData de Nascimento: " + dataDeNascimento +
                "\nCargo: " + cargo +
                "\nSalário: " + salario +
                "\nData de Admissão: " + dataAdmissao +
                "\nEndereço: " + endereco +
                "\nContatos: " + telsContato;
    }

}
