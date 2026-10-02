package Hash;

public class Main {
    public static void main(String[] args) {
        Hash listaHash = new Hash(20);
        Par par = new Par(20251111, "Isabel");
        listaHash.addPar(par);
        listaHash.getElements();
        listaHash.removeElements(11);
        listaHash.getElements();

    }

}