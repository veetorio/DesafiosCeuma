package desefiosCeuma.DesafioCarro;

import desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines.Passageiro;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class Garagem {
    // sistema de armazenagem e procura do carro
    Map<Integer,Carro> garagem = new ArrayList<>();
    Carro c;// lista dos carros na garagem

    void adicionarCarro(Carro c) {

        if (garagem.size() <= 1 && !garagem.containsKey(c.getEstacionado())){
            garagem.put(c.getEstacionado(),c);}
        else{
            if(garagem.containsKey(c.getEstacionado())){
                System.out.println("Este assento está ocupado");
            }else{System.out.println("Não há vagas");}
        }
    }// este metodo adiciona carro na garagem

    void removeCarro(int model) {
        if (garagem.containsKey(model)){
                garagem.remove(model);
            }
    }// este metodo remove carro

      void mostrarLista(){
        List<String> model = new ArrayList<>();
      }

        String procurarCarro(String nome){
                Boolean valida = garagem.contains(c.getEstacionado());
                if(valida){
                     return ("Carro encontrado!, ele está na vaga " + c.getEstacionado());
                }else{
                     return "não encontrado";
//                }
        }
    }}
// procura o carro atraves do modelo e nome
