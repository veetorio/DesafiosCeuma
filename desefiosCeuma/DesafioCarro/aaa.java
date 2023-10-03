package desefiosCeuma.DesafioCarro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class aaa {
    public static void main(String[] args) {
        Garagem g = new Garagem();

        Carro a = new Carro(1,"ettore","fiat");
        Carro b = new Carro(2,"ettore","fiat");
        g.adicionarCarro(a);
        g.adicionarCarro(b);
        System.out.println(g.Validação("ettore","jo0ao",b.getEstacionado()));

    }
}
