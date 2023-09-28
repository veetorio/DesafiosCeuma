package desefiosCeuma.DesafioCarro;

import desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines.Passageiro;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class Garagem {
    // sistema de armazenagem e procura do carro
    Map<Integer, Carro> garagem = new HashMap();
    Carro c;// lista dos carros na garagem

    void adicionarCarro(Carro c) {

        if (garagem.size() <= 1) {
            if (!garagem.containsKey(c.getEstacionado())) {
                garagem.put(c.getEstacionado(), c);
            } else {
                System.out.println("já está ocupado");
            }
        } else {
            System.out.println("Não há vagas");
        }
    }// este metodo adiciona carro na garagem

    void removeCarro(int model) {
        if (garagem.containsKey(model)){
                garagem.remove(model);
            }
    }// este metodo remove carro

      String mostrarLista(){
          for (Carro a :garagem.values()){
              String lis = "Modelo -> "+a.getModelo() +" Dono -> "+a.getNomeMotorista()+" Vaga -> "+ a.getEstacionado();
              return lis;}
          return "";
      }//mostra os carros

        String procurarCarro(String nome,String model){
//                Boolean valida = garagem.values();
//                if(valida){
//                     return ("Carro encontrado!, ele está na vaga " + c.getEstacionado());
//                }else{
//                     return "não encontrado";
//                }
            return "";
        }
    }
// procura o carro atraves do modelo e nome
