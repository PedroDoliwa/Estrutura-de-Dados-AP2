package Exercicio2;

public class NodoDuplo {
    Livro livro;
    NodoDuplo anterior;
    NodoDuplo proximo;

    public NodoDuplo(Livro livro) {
        this.livro = livro;
        this.anterior = null;
        this.proximo = null;
    }
}
