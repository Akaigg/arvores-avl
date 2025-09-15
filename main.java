public class Main {
    public static void main(String[] args) {
        ArvoreAVL arvore = new ArvoreAVL();
        int[][] sequencias = {
            {40, 20, 60, 10, 30, 25},
            {60, 40, 80, 35, 50, 90, 20, 38, 37},
            {30, 20, 10, 25, 40, 50, 5, 35, 45}
        };

        for (int i = 0; i < sequencias.length; i++) {
            System.out.println("Inserindo sequência" + (i + 1) + ":");
            No raiz = null;
            for (int valor : sequencias[i]) {
                raiz = arvore.inserir(raiz, valor);
            }
            System.out.print("Árvore em pré-ordem: ");
            arvore.preOrdem(raiz);
            System.out.println("\n");
        }
    }
}
