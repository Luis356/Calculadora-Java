package Util;

public class Recebe {
    private int valorUm;
    private int valorDois;
    private String operador;
    private String expressao;
    private Historico historico;

    public Recebe(String expressao, Historico historico, int resultadoAtual) {
        this.expressao = expressao;
        this.historico = historico;
        solicitaExpressao(resultadoAtual);
    }

    public void solicitaExpressao(int resultadoAtual) {
        String[] frase = getExpressao().split(" ");

        if (frase.length == 3) {
            // Se a expressão estiver vazia, é a primeira execução, então solicita a
            // expressão completa
            setValorUm(Integer.parseInt(frase[0]));
            setOperador(frase[1]);
            setValorDois(Integer.parseInt(frase[2]));
            chamaCalculo();
        } else {
            // Caso contrário, solicita apenas o operador e o valor
            setValorUm(resultadoAtual);
            setOperador(frase[0]);
            setValorDois(Integer.parseInt(frase[1]));
            chamaCalculo();
        }
    }

    public void chamaCalculo() {
        Calcula comp = new Calcula(getValorUm(), getOperador(), getValorDois(), getExpressao(), historico);
        int resultado = comp.getResultado();
        System.out.println("= " + resultado);

    }

    public int getValorUm() {
        return valorUm;
    }

    public void setValorUm(int valorUm) {
        this.valorUm = valorUm;
    }

    public int getValorDois() {
        return valorDois;
    }

    public void setValorDois(int valorDois) {
        this.valorDois = valorDois;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getExpressao() {
        return expressao;
    }

    public void setExpressao(String expressao) {
        this.expressao = expressao;
    }

    public Historico getHistorico() {
        return historico;
    }

    public void setHistorico(Historico historico) {
        this.historico = historico;
    }

}
