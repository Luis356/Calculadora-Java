import java.util.List;
import java.util.ArrayList;

public class Historico {
    private List<String> hist;

    public Historico() {
        hist = new ArrayList<>();
    }

    public void adicionarItems(String expressao, int resultado) {

        String item = expressao + " = " + resultado;
        hist.add(item);

    }

    public List<String> getHistorico() {
        return hist;
    }
}
