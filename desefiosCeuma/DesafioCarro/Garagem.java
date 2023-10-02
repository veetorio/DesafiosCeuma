package desefiosCeuma.DesafioCarro;

import javax.swing.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class Garagem {
    // sistema de armazenagem e procura do carro
    Map<Integer,Carro> garagem = new HashMap<>();
    Carro c;// lista dos carros na garagem

    void adicionarCarro(Carro c) {

        if (garagem.size() <= 1 && !garagem.containsKey(c.getEstacionado())){
            garagem.put(c.getEstacionado(),c);}else{if(garagem.containsKey(c.getEstacionado())){
                System.out.println("Este assento está ocupado");
            }else{System.out.println("Não há vagas");}}
    }// este metodo adiciona carro na garagem

    void removeCarro(int ass) {
        garagem.values().forEach(p ->{
            if(p.getEstacionado() == (ass)){
                garagem.remove(p.getEstacionado());
                JOptionPane.showMessageDialog(null,"carro removido","remoção",JOptionPane.PLAIN_MESSAGE);
            }
        });
    }// este metodo remove carro

      void mostrarLista(){
        List<String> model = new ArrayList<>();
      }

        void procurarCarro(String modelo){
            garagem.values().forEach( a -> {
                if(a.getModelo().equals(modelo.strip())) {
                    JOptionPane.showMessageDialog(null, a.getNomeMotorista() + "Seu carro foi encontrado na vaga" + a.getEstacionado(), "Procura", JOptionPane.PLAIN_MESSAGE);
                }
            });
        }

    }
// procura o carro atraves do modelo e nome
