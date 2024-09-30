package pessoas;

import composicao.Cargo;
import composicao.Endereco;
import composicao.TelsContato;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private Cargo cargo;
    private double salario;
    private LocalDate dataAdmissao;
    private Endereco endereco;
    private TelsContato telsContato;

    public Funcionario(String nome, LocalDate dataDeNascimento, Cargo cargo, double salario, LocalDate dataAdmissao, Endereco endereco, TelsContato telsContato) {
        super(nome, dataDeNascimento);
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

    public void promover(Cargo novoCargo) {
        this.cargo = novoCargo;
        System.out.println("Funcionário promovido para: " + novoCargo);
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nData de Nascimento: " + dataDeNascimento +
                "\ncomposicao.Cargo: " + cargo +
                "\nSalário: " + salario +
                "\nData de Admissão: " + dataAdmissao +
                "\nEndereço: " + endereco +
                "\nContatos: " + telsContato;
    }
}
