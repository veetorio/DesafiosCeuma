package desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines;
import desefiosCeuma.SistemasdeVoo.ClasseMãe.*;

import java.util.HashMap;

public class Qatar extends MãeDeLines implements Benéficios_E_Verificação{// linha Qatar que está recebendo o atributo da classe mãe e os metodos da classe{
    static HashMap<Integer,Passageiro> reserva3 = new HashMap<>();
    public void reservar(Passageiro passageiro) {
        reservar(reserva3,passageiro);
    }
    public void mostrarElementosQatar() {
        mostrarElementos(reserva3);
    }
    @Override
    public String Beneficios(Integer contador) {
        return Benéficios_E_Verificação.super.Beneficios(contador);
    }

}
