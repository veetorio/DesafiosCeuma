package desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines;
import desefiosCeuma.SistemasdeVoo.ClasseMãe.ClasseLinesM;
import desefiosCeuma.SistemasdeVoo.ClasseMãe.SIstemasdeLines;

import java.util.HashMap;
import java.util.Map;

public class Qatar extends ClasseLinesM implements SIstemasdeLines// linha Qatar que está recebendo o atributo da classe mãe e os metodos da classe
{

    public Map<Integer, Passageiro> reservaQatar = new HashMap<>();// O map irá guardar os passageiros e seus assentos, sendo seus keys assentos e os values são o objeto passageiro
    private int ReservasTot = this.limite;// e o limitador de reserva maximo
    @Override
    public void reservas(int assento, Passageiro a){
        reservaQatar.put(assento,a);
    }// responsavel por adicionar o assento e o objeto na lista
    @Override
    public void MostrarPassageiros(){
        for (int i = 0;i <= reservaQatar.size();i++)
        {
            System.out.println(reservaQatar.keySet()+" ==> "+reservaQatar.values());
        }
    }//responsavel por mostrar os passageiros
    public boolean vagasQatar(){
        boolean verify = (reservaQatar.isEmpty()) || (reservaQatar.size() <= ReservasTot);
        return verify;
    }// retornar uma verificação de se (a map está vazia ou o tamanho do map é menor que o limite)
}
