package Exercicio1;

public class Pilha {
    private Nodo topo;

    public Pilha() {
        this.topo = null;
    }

    public void push(Pedido pedido) {      // Adicionar um pedido cancelado no topo da pilha
        Nodo novoNodo = new Nodo(pedido);
        novoNodo.proximo = topo;
        topo = novoNodo;
    }

    public Pedido pop() {      // Remover o último pedido cancelado da pilha
        if (topo == null) {
            return null;
        }
        Pedido pedidoRemovido = topo.pedido;
        topo = topo.proximo;
        return pedidoRemovido;
    }

    public void printStack() {        // Imprimir todos os pedidos cancelados
        if (topo == null) {
            System.out.println("Nenhum pedido cancelado.");
            return;
        }
        Nodo atual = topo;
        while (atual != null) {
            System.out.println(atual.pedido);
            atual = atual.proximo;
        }
    }
}
