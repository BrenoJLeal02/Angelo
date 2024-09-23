import java.time.LocalDate;

public class Cliente extends Pessoa {
    private String codigo;
    private Endereco endereco;
    private TelsContato telsContato;
    private Profissao profissao;

    public Cliente(String nome, LocalDate dataDeNascimento, String codigo, Endereco endereco, TelsContato telsContato, Profissao profissao) {
        super(nome, dataDeNascimento);
        this.codigo = codigo;
        this.endereco = endereco;
        this.telsContato = telsContato;
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome +
                ", Data de Nascimento: " + dataDeNascimento +
                ", Código: " + codigo +
                ", Endereço: " + endereco +
                ", Telefones: " + telsContato +
                ", Profissão: " + profissao +
                ", Idade: " + obterIdade();
    }
}
