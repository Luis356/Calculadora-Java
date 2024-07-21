package Utilitarios;

import java.util.Scanner;

public class Pega {
    int Var1, Var2;
    char Opr;
    String[] entrada;
    Scanner scanPega = new Scanner(System.in);

    public Pega(Historico historico) {
        ControleTela controleTela = new ControleTela();
        Calcula calc = new Calcula(historico);
        while (true) {
            controleTela.clearScreen();
            System.out.println("Digite a equação a ser calculada (m - para Menu): ");
            String[] entrada = scanPega.nextLine().split(" ");

            if (entrada[0].equalsIgnoreCase("m")) {
                return;
            }

            if (Validador.isNumero(entrada[0])) {
                if (entrada.length == 1) {

                    try {
                        Var1 = Integer.parseInt(entrada[0]);

                        System.out.println("Digite o operador: ");
                        Opr = scanPega.next().charAt(0);
                        scanPega.nextLine();

                        System.out.println("Digite o próximo número: ");
                        Var2 = scanPega.nextInt();
                        scanPega.nextLine();

                        calc.CalculaUm(Var1, Var2, Opr);

                    } catch (Exception e) {
                        System.out.println("Erro na entrada de dados... Tente novamente");
                        scanPega.nextLine();
                    }

                } else if (entrada.length == 3 && Validador.isNumero(entrada[2])) {

                    try {

                        calc.CalculaDois(Integer.parseInt(entrada[0]), Integer.parseInt(entrada[2]), entrada[1]);

                    } catch (Exception e) {

                        System.out.println("Erro na entrada de dados... Tente novamente");

                    }

                } else {
                    System.out.println("Formato de entrada inválido!");

                }
            } else {
                System.out.println("O primeiro valor não é um numero");
            }
        }
    }
}
