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

    public void exibirHistorico() {
        System.out.println("Historico: ");
        for (String expressao : hist) {
            System.out.println(expressao);
        }
    }
}
