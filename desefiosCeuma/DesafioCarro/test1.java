package desefiosCeuma.DesafioCarro;

public class test1 {
    public static void main(String[] args) {
        Garagem g = new Garagem();
        Carro a = new Carro(2, "ettore", "fiat");
        Carro b = new Carro(1, "joao", "fiat");
        g.adicionarCarro(a);
        g.adicionarCarro(b);
        // g.removeCarro(1);
        g.procurarCarro("ettore", "fiat");
        g.mostrarLista();
    }

}
