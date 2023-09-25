package desefiosCeuma.SistemasdeVoo.ClasseMãe;

import java.util.HashMap;
import java.util.Objects;

//interface das linhas que implementão os métodos de reserva e mostrar passageiro
public interface Benéficios_E_Verificação {
    default String Beneficios(Integer contador){

        if(contador >= 5){
            int PercentualBenefico = 20;
            return String.format("Olá!!, você acaba de ganhar %d porcento de desconto por sua %dº viajem em nossa companhia",PercentualBenefico,contador);
        }else{
            return "Olá!!, você já esta em sua " + contador + " continue assim que até sua, 5 viajem você irá ganhar um bônus";
        }
    }

}
