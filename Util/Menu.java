package Util;

import java.util.Scanner;

public class Menu {
    private int resultadoAtual; // Novo atributo para armazenar o resultado atual
    private Historico historico;

    public Menu() {
        this.resultadoAtual = 0; // Inicializa o resultado atual
        this.historico = new Historico();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a expressão (ou 'h' para exibir o histórico): ");

        do {
            String expressao = scan.nextLine();

            if (expressao.equalsIgnoreCase("h")) {
                historico.exibirHistorico();
                break; // Encerra o loop se o usuário desejar exibir o histórico
            }

            Recebe rec = new Recebe(expressao, historico, resultadoAtual);
            resultadoAtual = rec.getValorUm(); // Atualiza o resultado atual

        } while (true);

        scan.close();
    }
}
