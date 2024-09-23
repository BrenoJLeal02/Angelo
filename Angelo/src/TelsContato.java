import java.util.ArrayList;
import java.util.List;

public class TelsContato {
    private List<String> telefones;

    public TelsContato() {
        this.telefones = new ArrayList<>();
    }

    public void adicionarTelefone(String telefone) {
        telefones.add(telefone);
    }

    public List<String> getTelefones() {
        return telefones;
    }

    @Override
    public String toString() {
        return String.join(", ", telefones);
    }
}
