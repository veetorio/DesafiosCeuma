package desefiosCeuma.SistemasdeVoo.ClasseMãe;

import desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines.Passageiro;

import java.util.HashMap;

//Classe mãe da linhas de vôos, responsavel por estabelecer o limites dos Maps
public class MãeDeLines{
//{Passageir
    protected void reservar(HashMap<Integer,Passageiro> ModelMap,Passageiro p){
        if(ModelMap.size()+1 <= 10){
            if(!ModelMap.containsKey(p.getAssento())){
                ModelMap.put(p.getAssento(),p);
            }else{
                System.out.println("Este assento está ocupado");
            }
        }else{
            System.out.println("Sem vagas");
        }

    }
    protected void mostrarElementos(HashMap<Integer,Passageiro> modelMap){
        modelMap.values().forEach(p -> System.out.println("Assento = "+p.getAssento()+":"+"nome = "+p.getNome()+":"+"destino ="+p.getLugar()));
    }
}
