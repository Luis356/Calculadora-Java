package Utilitarios;

import java.util.List;
import java.util.ArrayList;

public class Historico {

    private List<String> hist;

    public Historico() {

        hist = new ArrayList<>();

    }

    public void adicionarItens(String expressao, int resultado) {

        String item = expressao + " = " + resultado;
        hist.add(item);

    }

    public void exibirHistorico() {
        ControleTela controleTela = new ControleTela();
        controleTela.clearScreen();
        
        System.out.println("Historico: \n");
        for (String item : hist) {
            System.out.println(item);
        }

    }

    public List<String> getHistorico() {
        return hist;
    }

}
