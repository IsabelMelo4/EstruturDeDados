import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class MinhaLista {

    Nodo inicio;
    public int tamanho;

    public MinhaLista() {
        this.inicio = null;
        this.tamanho = 0;

    }

    public void adicionarLast(int num) {
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

    public boolean adicionarPos(int posicao, int valor) {

        if (posicao < -1 || posicao > tamanho) {
            return false;
        }

        Nodo novo = new Nodo(valor);
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

    public boolean remove(int index){

        if (inicio == null){
            return false;
        }

        else {
            for(int i = 0; i< tamanho; i++){
                if (i == index){
                  tamanho --;

                }
            }

            return true;
        }


    }


    public void getElement(int posicao){
        Nodo elementoNodo = inicio;
        if (posicao < 0 || posicao > tamanho){
            throw new IndexOutOfBoundsException("A posição é inválida");
        }

        for(int i = 0; i < tamanho; i++){
            if(posicao == i){
                System.out.println(elementoNodo.getValor());
            }
            else if (elementoNodo.getProximo() == null){
                throw new NullPointerException(" elemento null");
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
