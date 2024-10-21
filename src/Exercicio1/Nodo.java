package Exercicio1;

public class Nodo {
    Pedido pedido;
    Nodo proximo;

    public Nodo(Pedido pedido) {
        this.pedido = pedido;
        this.proximo = null;
    }
}
