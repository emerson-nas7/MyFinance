import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("===============");
        System.out.println("   MyFinance");
        System.out.println("===============");
        System.out.println(" ");

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("1 - Adicionar Receita");
            System.out.println("2 - Adicionar Despesa");
            System.out.println("3 - Ver Relatório ");
            System.out.println("4 - Sair");
            System.out.println("  ");
            System.out.println("Digite uma opção:");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Em andamento");
                    break;
                case 2:
                    System.out.println("Em andamento");
                    break;
                case 3:
                    System.out.println("Em andamento");
                    break;
                case 4:
                    System.out.println("Saindo...");
            }
        }
        }
    }