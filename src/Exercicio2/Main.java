package Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada listaDeLivros = new ListaDuplamenteEncadeada();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Adicionar Livro no Início");
            System.out.println("2. Adicionar Livro no Fim");
            System.out.println("3. Remover Primeiro Livro");
            System.out.println("4. Remover Último Livro");
            System.out.println("5. Buscar Livro por ID");
            System.out.println("6. Imprimir Livros na Ordem Original");
            System.out.println("7. Imprimir Livros na Ordem Inversa");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do livro: ");
                    int idInicio = scanner.nextInt();
                    scanner.nextLine(); // Consumir quebra de linha
                    System.out.print("Digite o título do livro: ");
                    String tituloInicio = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autorInicio = scanner.nextLine();
                    Livro livroInicio = new Livro(idInicio, tituloInicio, autorInicio);
                    listaDeLivros.adicionarNoInicio(livroInicio);
                    break;

                case 2:
                    System.out.print("Digite o ID do livro: ");
                    int idFim = scanner.nextInt();
                    scanner.nextLine(); // Consumir quebra de linha
                    System.out.print("Digite o título do livro: ");
                    String tituloFim = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autorFim = scanner.nextLine();
                    Livro livroFim = new Livro(idFim, tituloFim, autorFim);
                    listaDeLivros.adicionarNoFim(livroFim);
                    break;

                case 3:
                    listaDeLivros.removerDoInicio();
                    break;

                case 4:
                    listaDeLivros.removerDoFim();
                    break;

                case 5:
                    System.out.print("Digite o ID do livro a ser buscado: ");
                    int idBusca = scanner.nextInt();
                    listaDeLivros.pesquisarPorID(idBusca);
                    break;

                case 6:
                    listaDeLivros.imprimirNaOrdemOriginal();
                    break;

                case 7:
                    listaDeLivros.imprimirNaOrdemInversa();
                    break;

                case 8:
                    System.out.println("Saindo...");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
