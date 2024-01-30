package Util;

public class Recebe {
    private int valorUm;
    private int valorDois;
    private String operador;
    private String expressao;
    private Historico historico;

    public Recebe(String expressao, Historico historico) {
        this.expressao = expressao;
        this.historico = historico;
        solicitaExpressao();
        chamaCalculo();
    }

    public void solicitaExpressao() {
        String[] frase = getExpressao().split(" ");
        setValorUm(Integer.parseInt(frase[0]));
        setOperador(frase[1]);
        setValorDois(Integer.parseInt(frase[2]));
    }

    public void chamaCalculo() {

        Calcula comp = new Calcula(getValorUm(), getOperador(), getValorDois(), getExpressao(), historico);
        int resultado = comp.getResultado();
        System.out.println("Resultado: " + resultado);

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
