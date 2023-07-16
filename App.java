import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Historico historico = new Historico();
        boolean primeiraEx = true;
        while (true) {

            if (primeiraEx) {

                System.out.println("Digite uma expressão: ");
                primeiraEx = false;

            } else {

                System.out.println("Digite outra expressão ou 'H' para ver o Historico: ");

            }

            String resp = scanner.nextLine();

            if (resp.equalsIgnoreCase("h")) {
                historico.exibirHistorico();
                break;

            } else {
                new Recebe(resp, historico);
            }
        }
        scanner.close();
    }
}