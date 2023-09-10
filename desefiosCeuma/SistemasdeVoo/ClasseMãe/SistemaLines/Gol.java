package desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines;
import desefiosCeuma.SistemasdeVoo.ClasseMãe.ClasseLinesM;
import desefiosCeuma.SistemasdeVoo.ClasseMãe.SIstemasdeLines;

import java.util.HashMap;
import java.util.Map;

public class Gol extends ClasseLinesM implements SIstemasdeLines// linha Gol que está recebendo o atributo da classe mãe e os metodos da classe
{
    public Map<Integer, Passageiro> reservaGol = new HashMap<>();// O map irá guardar os passageiros e seus assentos, sendo seus keys assentos e os values são o objeto passageiro
    public int ReservasTot = this.limite;// e o limitador de reserva maximo
    @Override
    public void reservas(int assento, Passageiro a) {
        reservaGol.put(assento, a);
    }// responsavel por adicionar o assento e o objeto na lista

    @Override
    public void MostrarPassageiros(){
        for (Passageiro p : reservaGol.values())
        {
            System.out.println("Assento: "+ reservaGol.keySet() +" => "+ p.getNome() +":"+p.getLugar());
        }
    }//responsavel por mostrar os passageiros
    public boolean vagasGol() {
        boolean verify = (reservaGol.isEmpty()) || (reservaGol.size() <= ReservasTot);
        return verify;
    }// retornar uma verificação de se (a map está vazia ou o tamanho do map é menor que o limite)
}
