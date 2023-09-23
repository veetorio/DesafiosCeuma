package desefiosCeuma.SistemasdeVoo.ClasseMãe.pseudo_interface;

import desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines.Azul;
import desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines.Passageiro;

public class Test {
    public static void main(String[] args) {
        Azul a = new Azul();

        a.reservas(new Passageiro("ettore","cuba",20));
        a.reservas(new Passageiro("ettore","cuba",20));
        a.reservas(new Passageiro("ettore","cuba",12));
        a.reservas(new Passageiro("ettore","cuba",14));



        a.MostrarPassageiros();
    }

}
