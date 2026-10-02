public class MinhaLista {
    Nodo proximo;
    Nodo anterior;
    Nodo primeiro;
    public int tamanho;

    public MinhaLista() {
        this.proximo = null;
        this.anterior= null;
        this.tamanho = 0;

    }

    public void adicionarLast(int num) {
        if (primeiro == null) {
            primeiro = new Nodo(num);
        } else {
            Nodo novo = new Nodo(num);
            Nodo ultimo = primeiro.getAnterior();
            ultimo.setProximo(novo);
            novo.setAnterior(ultimo);
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);

        }
        this.tamanho++;

    }

    public boolean adicionarPos(int posicao, int valor) {

        if (posicao < 0 || posicao > tamanho) {
            return false;
        }
        if(posicao == 0){
                Nodo nodo = new Nodo(valor);
            if(primeiro==null){
                adicionarLast(nodo.getValor());
                tamanho++;
            }
            else{
                Nodo ultimoNodo = getElement(tamanho-1);
                Nodo antigo = getElement(0);
                nodo.setAnterior(ultimoNodo);
                nodo.setProximo(antigo);
                ultimoNodo.setProximo(nodo);
                antigo.setAnterior(nodo);
            }
            primeiro = null;
        }
        else {
            Nodo novo = new Nodo(valor);
            Nodo atual = primeiro;
            for (int i = 0; i < posicao-1; i++) {
                atual = atual.getProximo();
            }

            novo.setProximo(atual.getProximo());
            atual.setProximo(novo);
            }

        return true;

    }

    public void remove(int posicao){

        if (posicao < 0 || posicao > tamanho) {
            throw new NullPointerException("posição inválida");
        }

        if (posicao == 0){
            primeiro = null;
        }

            Nodo atual = primeiro;
            for (int i = 0; i < posicao; i++) {
                atual = atual.getProximo();

            }
            Nodo anterior = atual.getAnterior();
            Nodo proximo = atual.getProximo();
            anterior.setProximo(atual.getProximo());
            proximo.setAnterior(anterior);
            tamanho --;


    }

    public Nodo getElement(int posicao){
        Nodo elementoNodo = primeiro;
        if (posicao < 0 || posicao > tamanho){
            throw new IndexOutOfBoundsException("A posição é inválida");
        }

        for(int i = 0; i < tamanho; i++){
            if(posicao == i){
                System.out.println(elementoNodo.getValor());
            }
            else if (elementoNodo.getProximo() == null){
                throw new NullPointerException(" posição vazia");
            }
            else {
                elementoNodo = elementoNodo.getProximo();
            }

        }
        return elementoNodo;

    }
    public int tamanho() {
        return tamanho;
    }
}
