public class Profissao {
    private String nome;
    private String descricao;

    public Profissao(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return nome + ": " + descricao;
    }
}
