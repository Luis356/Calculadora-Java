package Util;

public class Calcula {

    private int resultado;

    public Calcula(int valorUm, String operador, int valorDois, String expressao, Historico historico) {

        switch (operador) {
            case "+":
                setResultado(valorUm + valorDois);
                break;

            case "-":
                setResultado(valorUm - valorDois);
                break;

            case "*":
                setResultado(valorUm * valorDois);
                break;

            case "/":
                setResultado(valorUm / valorDois);
                break;

            default:
                break;
        }

        historico.adicionarItens(expressao, getResultado());

    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

}
