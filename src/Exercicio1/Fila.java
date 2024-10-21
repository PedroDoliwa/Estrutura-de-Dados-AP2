package Exercicio1;

public class Fila {
    private Nodo inicio;
    private Nodo fim;

    public Fila() {
        this.inicio = null;
        this.fim = null;
    }


    public void enqueue(Pedido pedido) {  // Adicionar um pedido no final da fila
        Nodo novoNodo = new Nodo(pedido);
        if (fim != null) {
            fim.proximo = novoNodo;
        }
        fim = novoNodo;
        if (inicio == null) {
            inicio = fim;
        }
    }


    public Pedido dequeue() {  // Remover o pedido do início da fila
        if (inicio == null) {
            return null; // Fila vazia
        }
        Pedido pedidoRemovido = inicio.pedido;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        return pedidoRemovido;
    }

    public void printQueue() {      // Imprimir todos os pedidos pendentes
        if (inicio == null) {
            System.out.println("Nenhum pedido pendente.");
            return;
        }
        Nodo atual = inicio;
        while (atual != null) {
            System.out.println(atual.pedido);
            atual = atual.proximo;
        }
    }
}
