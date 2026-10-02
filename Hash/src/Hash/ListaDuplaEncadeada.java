package Hash;

public class ListaDuplaEncadeada {

    Nodo inicio;
    public int tamanho;

    public ListaDuplaEncadeada( ) {
        this.inicio = null;
        this.tamanho = 0;

    }

    public void adicionarLast(Par num) {
        if (inicio == null) {
            inicio = new Nodo(num);


        } else {
            Nodo addNum = new Nodo(num);
            Nodo elemento = inicio;
            while(elemento.getProximo() != null) {
                elemento = elemento.getProximo();
            }
            elemento.setProximo(addNum);
        }
        this.tamanho++;
    }

    public boolean adicionarPos(int posicao, Par par) {

        if (posicao < -1 || posicao > tamanho) {
            return false;
        }

        Nodo novo = new Nodo(par);
        if(posicao == 0){
            novo.setProximo(inicio);
           inicio = novo;

        }

        else {
            Nodo atual = inicio;

            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.getProximo();
            }

            novo.setProximo(atual.getProximo());
            atual.setProximo(novo);
            }

        return true;
    }

    public boolean remove(int index) {

        if (inicio == null || index < 0 || index >= tamanho) {
            return false;
        }
        if (index == 0) {
            inicio = inicio.getProximo();
            tamanho--;
            return true;
        }

        Nodo atual = inicio;

        for (int i = 0; i < index - 1; i++) {
            atual = atual.getProximo();
        }

        atual.setProximo(atual.getProximo().getProximo());

        tamanho--;

        return true;
    }
    public void getElements() {

        Nodo elementoNodo = inicio;

        while (elementoNodo != null) {
            System.out.println(elementoNodo.getPar().getMatricula());
            System.out.println(elementoNodo.getPar().getNome());
            elementoNodo = elementoNodo.getProximo();
        }
    }
    public int tamanho() {
        return tamanho;
    }
}
