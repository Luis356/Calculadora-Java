package Utilitarios;

public class Calcula {

    public int resultado;
    private Historico historico;

    public Calcula(Historico historico) {
        this.historico = historico;
    }

    public void CalculaUm(int ValorUm, int ValorDois, char Operador) {
        String expressao = ValorUm + " " + Operador + " " + ValorDois;
        switch (Operador) {
            case '+':
                resultado = ValorUm + ValorDois;
                break;
            case '-':
                resultado = ValorUm - ValorDois;
                break;
            case '*':
                resultado = ValorUm * ValorDois;
                break;
            case '/':
                divisao(ValorUm, ValorDois);
                break;
            default:
                System.out.println("Operador inválido!");
                break;
        }
        MostraResultado(resultado);
        historico.adicionarItens(expressao, resultado);
    }

    public void CalculaDois(int var1, int var2, String Operador) {
        String expressao = var1 + " " + Operador + " " + var2;

        switch (Operador) {
            case "+":
                resultado = var1 + var2;
                break;
            case "-":
                resultado = var1 - var2;
                break;
            case "*":
                resultado = var1 * var2;
                break;
            case "/":
                divisao(var1, var2);
                break;

            default:
                break;
        }
        MostraResultado(resultado);
        historico.adicionarItens(expressao, resultado);
    }

    public void divisao(int valorUm, int valorDois) {

        if (valorUm != 0 && valorDois != 0) {

            this.resultado = valorUm / valorDois;

        } else {

            System.out.println("Não é possível dividir por 0");

        }

    }

    public void MostraResultado(int Valor) {
        System.out.println("Resultado: " + Valor);
    }
}
