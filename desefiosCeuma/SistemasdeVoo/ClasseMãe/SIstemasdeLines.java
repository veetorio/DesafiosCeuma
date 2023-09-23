package desefiosCeuma.SistemasdeVoo.ClasseMãe;
import desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines.Passageiro;

import java.util.HashMap;
import java.util.Map;

//interface das linhas que implementão os métodos de reserva e mostrar passageiro
public interface SIstemasdeLines
{
    Integer reservastot = 1;
    Map<Integer,Passageiro> Reservas = new HashMap<>();

    default void reservas(Passageiro passageiro)
    {

        if(Reservas.size() <= reservastot){
            if(!Reservas.containsKey(passageiro.getAssento())){
                Reservas.put(passageiro.getAssento(),passageiro);
            }
            else{
                System.out.println("este assento já esta ocupado");
            }
        }else{
            System.out.println("sem vagas");
        }

    }
    default void MostrarPassageiros(){
        Reservas.values().forEach( p ->System.out.println(p.getAssento()+" : "+p.getNome()+" : "+p.getLugar()));
    }
}
