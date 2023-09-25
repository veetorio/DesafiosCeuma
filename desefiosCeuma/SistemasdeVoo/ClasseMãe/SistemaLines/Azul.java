package desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines;
import desefiosCeuma.SistemasdeVoo.ClasseMãe.*;

import java.rmi.server.RemoteServer;
import java.util.HashMap;
import java.util.Map;


public class Azul extends MãeDeLines implements Benéficios_E_Verificação{// linha azul que está recebendo o atributo da classe mãe e os metodos da classe

    static HashMap<Integer,Passageiro> reserva1 = new HashMap<>();
    @Override
    public String Beneficios(Integer contador){
        return Benéficios_E_Verificação.super.Beneficios(contador);
    }
    public void reservar(Passageiro p) {
        reservar(reserva1,p);
    }
    public void mostrarElementosAzul(){
        mostrarElementos(reserva1);
    }
    
}