public class No {
    int valor;
    No esquerda;
    No direita;
    int altura;

    public No(int valor) {
        this.valor = valor;
        this.altura = 1;
        this.esquerda = null;
        this.direita = null;
    }
}
