public class MinhaLista {

    Nodo primeiro;
    Nodo proximo;
    public int tamanho;

    public MinhaLista() {
        this.primeiro = null;
        this.proximo = null;
        this.tamanho = 0;

    }

    public void adicionarLast(int num) {
        if (primeiro == null) {
            primeiro = new Nodo(num);

        } else {
            Nodo novo = new Nodo(num);
            Nodo atual = primeiro;

            while(atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novo);
            novo.setAnterior(atual);
              System.out.println("teste anterior:"+atual.getValor());
            System.out.println("teste proximo"+novo.getValor());
            this.tamanho++;
        }
    }

    public boolean adicionarPos(int posicao, int valor) {

        if (posicao < -1 || posicao > tamanho) {
            return false;
        }
        Nodo novo = new Nodo(valor);
        if(posicao == 0){
           primeiro.setProximo(novo);
           primeiro.setAnterior(novo);

        }
        else {
            Nodo atual = primeiro;
            novo.setProximo(atual.getProximo());
            atual.setProximo(novo);

            }
        return true;
    }

    public void remove(int posicao){

        if (posicao == 0){
            primeiro.setAnterior(primeiro);
            primeiro.setProximo(primeiro);
        }
            Nodo atual = primeiro;
            for (int i = 0; i < posicao; i++) {
                atual = atual.getProximo();

        }

        Nodo anterior = atual.getAnterior();
        Nodo proximo = atual.getProximo();
        anterior.setProximo(proximo);
        proximo.setAnterior(anterior);

//            System.out.println(atual.getValor());
//            System.out.println(anterior.getValor());
//            System.out.println(proximo.getValor());
        tamanho --;

    }

    public void getElement(int posicao){
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


    }
    public int tamanho() {
        return tamanho;
    }
}
