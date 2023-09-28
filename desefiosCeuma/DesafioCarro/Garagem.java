package desefiosCeuma.DesafioCarro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Garagem {
    // sistema de armazenagem e procura do carro
    Map<Integer, Carro> garagem = new HashMap();// lista dos carros na garagem

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

    void mostrarLista() {
        garagem.values().forEach(p -> {
            System.out.printf("Carro: %s -> Dono: %s -> Estacionado %s \n", p.getModelo(), p.getNomeMotorista(),
                    p.getEstacionado());
        });

        }//mostra os carros

        void procurarCarro(String nome,String model){
            garagem.values().forEach(g -> {
                if(g.getModelo().equals(model) && g.getNomeMotorista().equals(nome)){
                    System.out.println("Carro encontrado!, ele está na vaga " + g.getEstacionado());
                }
            });
        }
    }
// procura o carro atraves do modelo e nome
