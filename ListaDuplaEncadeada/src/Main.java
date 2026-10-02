public class Main {
    public static void main(String[] args) {
        System.out.println("rodou");
        MinhaLista lista = new MinhaLista();

        lista.adicionarLast(5);
        lista.adicionarLast(15);
        lista.adicionarLast(35);
        lista.adicionarLast(45);
        lista.adicionarLast(36);
       lista.adicionarPos(2,47);
        lista.tamanho();
        lista.remove(3);

      for(int i =0 ; i< lista.tamanho; i++){
            lista.getElement(i);
      }


        }

}