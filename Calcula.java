public class Calcula {

    private int Resultado;

    public Calcula(int var1, String op, int var2, String expressao, Historico historico) {


        switch (op) {

            case "+":

                setResultado(var1 + var2);
                break;

            case "-":

                setResultado(var1 + var2);
                break;

            case "*":

                setResultado(var1 * var2);
                break;

            case "/":

                setResultado(var1 / var2);
                break;

            default:
                break;
        }
        historico.adicionarItems(expressao, getResultado());

    }

    public int getResultado() {
        return Resultado;
    }

    public void setResultado(int resultado) {
        Resultado = resultado;
    }

}
