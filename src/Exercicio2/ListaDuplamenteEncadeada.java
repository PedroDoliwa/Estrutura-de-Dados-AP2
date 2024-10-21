package Exercicio2;

public class ListaDuplamenteEncadeada {
    private NodoDuplo inicio;
    private NodoDuplo fim;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    public void adicionarNoInicio(Livro livro) {         // Adicionar livro no início da lista
        NodoDuplo novoNodo = new NodoDuplo(livro);
        if (inicio == null) {
            inicio = fim = novoNodo;
        } else {
            novoNodo.proximo = inicio;
            inicio.anterior = novoNodo;
            inicio = novoNodo;
        }
        System.out.println("Livro adicionado no início: " + livro);
    }


    public void adicionarNoFim(Livro livro) {       // Adicionar livro no fim da lista
        NodoDuplo novoNodo = new NodoDuplo(livro);
        if (fim == null) {
            inicio = fim = novoNodo;
        } else {
            fim.proximo = novoNodo;
            novoNodo.anterior = fim;
            fim = novoNodo;
        }
        System.out.println("Livro adicionado no fim: " + livro);
    }


    public void removerDoInicio() {         // Remover livro do início da lista
        if (inicio == null) {
            System.out.println("Nenhum livro para remover no início.");
            return;
        }
        System.out.println("Livro removido do início: " + inicio.livro);
        if (inicio == fim) {
            inicio = fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
    }


    public void removerDoFim() {       // Remover livro do fim da lista
        if (fim == null) {
            System.out.println("Nenhum livro para remover no fim.");
            return;
        }
        System.out.println("Livro removido do fim: " + fim.livro);
        if (inicio == fim) {
            inicio = fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }
    }


    public void pesquisarPorID(int id) {            // Pesquisar livro por ID
        NodoDuplo atual = inicio;
        while (atual != null) {
            if (atual.livro.id == id) {
                System.out.println("Livro encontrado: " + atual.livro);
                return;
            }
            atual = atual.proximo;
        }
        System.out.println("Livro com ID " + id + " não encontrado.");
    }



    public void imprimirNaOrdemOriginal() {         // Imprimir livros na ordem original (do primeiro ao último)
        if (inicio == null) {
            System.out.println("Nenhum livro na lista.");
            return;
        }
        NodoDuplo atual = inicio;
        System.out.println("Livros na ordem original:");
        while (atual != null) {
            System.out.println(atual.livro);
            atual = atual.proximo;
        }
    }



    public void imprimirNaOrdemInversa() {       // Imprimir livros na ordem inversa (do último ao primeiro)
        if (fim == null) {
            System.out.println("Nenhum livro na lista.");
            return;
        }
        NodoDuplo atual = fim;
        System.out.println("Livros na ordem inversa:");
        while (atual != null) {
            System.out.println(atual.livro);
            atual = atual.anterior;
        }
    }
}
