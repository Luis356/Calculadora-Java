import java.util.Scanner;

public class Recebe {
    private int var1;
    private String op;
    private int var2;
    private String expressao;
    private Historico historico;

    Scanner scan = new Scanner(System.in);

    public Recebe(String[] resposta, Historico historico) {
        for (String expressao : resposta) {
            this.expressao = expressao;
            this.historico = historico;
            solicitaExpressao();
            chamaCalculo();
        }
    }

    public void solicitaExpressao() {

        String[] frase = getExpressao().split(" "); // QUEBROU A EXPRESSÃO NOS ESPAÇOS, ARMAZENANDO NO VETOR "frase"

        setVar1(Integer.parseInt(frase[0]));
        setOp(frase[1]);
        setVar2(Integer.parseInt(frase[2]));

    }

    public void chamaCalculo() {
        Calcula comp = new Calcula(getVar1(), getOp(), getVar2(), getExpressao(), historico);
        int resultado = comp.getResultado();
        System.out.println("Resultado: " + resultado);

    }

    public int getVar1() {
        return var1;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public int getVar2() {
        return var2;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    public String getExpressao() {
        return expressao;
    }

    public void setExpressao(String expressao) {
        this.expressao = expressao;
    }

}
