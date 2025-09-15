public class ArvoreAVL {
    private int altura(No no) {
        if (no == null) return 0;
        return no.altura;
    }


    private int maximo(int a, int b) {
        return (a > b) ? a : b;
    }


    private No rotacaoDireita(No y) {
        No x = y.esquerda;
        No T2 = x.direita;
        x.direita = y;
        y.esquerda = T2;
        y.altura = maximo(altura(y.esquerda), altura(y.direita)) + 1;
        x.altura = maximo(altura(x.esquerda), altura(x.direita)) + 1;
        return x;
    }

    private No rotacaoEsquerda(No x) {
        No y = x.direita;
        No T2 = y.esquerda;
        y.esquerda = x;
        x.direita = T2;
        x.altura = maximo(altura(x.esquerda), altura(x.direita)) + 1;
        y.altura = maximo(altura(y.esquerda), altura(y.direita)) + 1;
        return y;
    }


    private int fatorBalanceamento(No no) {
        if (no == null) return 0;
        return altura(no.esquerda) - altura(no.direita);
    }

    public No inserir(No raiz, int valor) {

        if (raiz == null) {
            return new No(valor);
        }


        if (valor < raiz.valor) {
            raiz.esquerda = inserir(raiz.esquerda, valor);
        } else if (valor > raiz.valor) {
            raiz.direita = inserir(raiz.direita, valor);
        } else {
            return raiz;
        }


        raiz.altura = maximo(altura(raiz.esquerda), altura(raiz.direita)) + 1;

        int fb = fatorBalanceamento(raiz);


        if (fb > 1 && valor < raiz.esquerda.valor) {
            return rotacaoDireita(raiz);
        }

        if (fb < -1 && valor > raiz.direita.valor) {
            return rotacaoEsquerda(raiz);
        }

        if (fb > 1 && valor > raiz.esquerda.valor) {
            raiz.esquerda = rotacaoEsquerda(raiz.esquerda);
            return rotacaoDireita(raiz);
        }
        if (fb < -1 && valor < raiz.direita.valor) {
            raiz.direita = rotacaoDireita(raiz.direita);
            return rotacaoEsquerda(raiz);
        }

        return raiz;
    }

    public void preOrdem(No raiz) {
        if (raiz != null) {
            System.out.print(raiz.valor + " ");
            preOrdem(raiz.esquerda);
            preOrdem(raiz.direita);
        }
    }
}
