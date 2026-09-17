public class Nodo {

    private int valor;
    private Nodo proximo;

    public  Nodo(int valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public int getValor() {
        return valor;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
}
