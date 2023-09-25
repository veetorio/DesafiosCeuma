package desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines;
import desefiosCeuma.SistemasdeVoo.ClasseMãe.MãeDeLines;
import desefiosCeuma.SistemasdeVoo.ClasseMãe.Benéficios_E_Verificação;

import java.util.HashMap;

public class Gol extends MãeDeLines implements Benéficios_E_Verificação// linha Gol que está recebendo o atributo da classe mãe e os metodos da classe
{
    static HashMap<Integer,Passageiro> reserva2 = new HashMap<>() ;
    @Override
    public String Beneficios(Integer contador) {
        return Benéficios_E_Verificação.super.Beneficios(contador);
    }


    public void reservar(Passageiro p) {
        reservar(reserva2,p);
    }


    public void mostrarElementosGol() {
        mostrarElementos(reserva2);
    }
}


