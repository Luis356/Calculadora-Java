package Utilitarios;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    private Historico historico;

    @SuppressWarnings("resource")
    public Menu() {
        historico = new Historico();
        MostraMenu();
    }

    public void MostraMenu() {
        Boolean controle = true;
        Scanner scanMenu = new Scanner(System.in);
        ControleTela controleTela = new ControleTela();
        while (controle) {
            controleTela.clearScreen();
            System.out.println("Calculadora 2.0 \nOpcoes: \nC - Calcular \nH - Historico\nS - Sair");
            char opcao = scanMenu.next().charAt(0);

            switch (opcao) {
                case 's':
                case 'S':
                    System.out.println("Saindo...");
                    controle = false;
                    return;

                case 'h':
                case 'H':
                    historico.exibirHistorico();
                    System.out.println("Pressione enter para retornar...");
                    scanMenu.nextLine();
                    scanMenu.nextLine();
                    break;

                case 'c':
                case 'C':
                    Pega pega = new Pega(historico);
                    break;

                default:
                    System.out.println("Opção invalida, tente novamente...");
                    break;
            }
        }
        scanMenu.close();
    }
}
