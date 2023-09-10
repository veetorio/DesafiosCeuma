package desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines;

import desefiosCeuma.SistemasdeVoo.ClasseMãe.ClasseLinesM;
import desefiosCeuma.SistemasdeVoo.ClasseMãe.SIstemasdeLines;

import java.util.*;

public class Azul extends ClasseLinesM implements SIstemasdeLines // linha azul que está recebendo o atributo da classe mãe e os metodos da classe
{

    public Integer ReservasTot = this.limite;// e o limitador de reserva maximo
    public Map<Integer, Passageiro> reservaAzul = new HashMap<>();// O map irá guardar os passageiros e seus assentos, sendo seus keys assentos e os values são o objeto passageiro
    @Override
    public void reservas(int assento, Passageiro a) {
        reservaAzul.put(assento, a);
    }// responsavel por adicionar o assento e o objeto na lista
    @Override
    public void MostrarPassageiros() {
        for (Passageiro p : reservaAzul.values()) {
            System.out.println("Assento: " + reservaAzul.keySet() + " => " + p.getNome() + ":" + p.getLugar());
        }
    }//responsavel por mostrar os passageiros
    public boolean vagasAzul() {
        boolean verify = (reservaAzul.isEmpty()) || (reservaAzul.size() <= ReservasTot);
        return verify;
    }// retornar uma verificação de se (a map está vazia ou o tamanho do map é menor que o limite)
}