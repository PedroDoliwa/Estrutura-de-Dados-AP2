package Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Fila filaDePedidos = new Fila();
        Pilha pilhaDeCancelados = new Pilha();
        int idPedido = 1;

        while (true) {
            System.out.println("\n1. Adicionar Novo Pedido");
            System.out.println("2. Atender Pedido");
            System.out.println("3. Cancelar Pedido");
            System.out.println("4. Restaurar Pedido");
            System.out.println("5. Imprimir Pedidos Pendentes");
            System.out.println("6. Imprimir Pedidos Cancelados");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();


            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição do pedido: ");
                    String descricao = scanner.nextLine();
                    Pedido novoPedido = new Pedido(idPedido++, descricao);
                    filaDePedidos.enqueue(novoPedido);
                    System.out.println("Pedido adicionado.");
                    break;

                case 2:
                    Pedido pedidoAtendido = filaDePedidos.dequeue();
                    if (pedidoAtendido != null) {
                        System.out.println("Pedido atendido: " + pedidoAtendido);
                    } else {
                        System.out.println("Nenhum pedido pendente.");
                    }
                    break;

                case 3:
                    Pedido pedidoCancelado = filaDePedidos.dequeue();
                    if (pedidoCancelado != null) {
                        pilhaDeCancelados.push(pedidoCancelado);
                        System.out.println("Pedido cancelado: " + pedidoCancelado);
                    } else {
                        System.out.println("Nenhum pedido pendente para cancelar.");
                    }
                    break;

                case 4:
                    Pedido pedidoRestaurado = pilhaDeCancelados.pop();
                    if (pedidoRestaurado != null) {
                        filaDePedidos.enqueue(pedidoRestaurado);
                        System.out.println("Pedido restaurado: " + pedidoRestaurado);
                    } else {
                        System.out.println("Nenhum pedido cancelado para restaurar.");
                    }
                    break;

                case 5:
                    System.out.println("Pedidos Pendentes:");
                    filaDePedidos.printQueue();
                    break;

                case 6:
                    System.out.println("Pedidos Cancelados:");
                    pilhaDeCancelados.printStack();
                    break;

                case 7:
                    System.out.println("Saindo...");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
