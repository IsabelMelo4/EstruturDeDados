//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MinhaLista lista = new MinhaLista();

        lista.adicionarLast(5);
        lista.adicionarLast(15);
        lista.adicionarLast(35);
        lista.adicionarLast(45);
        lista.adicionarLast(36);
        lista.adicionarPos(2,47);
        lista.tamanho();

        for(int i =0 ; i< lista.tamanho; i++){
           lista.getElement(i);
        }

        lista.remove(1);

    }
    }
