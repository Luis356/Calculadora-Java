package Util;

import java.util.Scanner;

public class Menu {
    private String expressao;

    public Menu() {
        Boolean roda = true;
        Historico historico = new Historico();
        Scanner scan = new Scanner(System.in);

        do {

            System.out.println("Digite a expressão a ser calculada: ");
            String expressao = scan.nextLine();
            if (expressao.equalsIgnoreCase("h")) {

                historico.exibirHistorico();
                roda = false;

            } else {

                Recebe rec = new Recebe(expressao, historico);

            }

        } while (roda);
        scan.close();
    }

}
