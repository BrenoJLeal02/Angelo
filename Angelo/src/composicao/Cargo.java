package composicao;

public class Cargo {
    private String nome;
    private String descricao;

    public Cargo(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return nome + ": " + descricao;
    }
}
