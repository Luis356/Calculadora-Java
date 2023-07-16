import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Historico historico = new Historico();

        while (true) {

            System.out.println("Digite uma expressão: ");
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