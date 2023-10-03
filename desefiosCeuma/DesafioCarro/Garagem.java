package desefiosCeuma.DesafioCarro;

import javax.swing.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Garagem {
    // sistema de armazenagem e procura do carro
     Map<Integer,Carro> garagem = new HashMap<>();
    Carro c;// lista dos carros na garagem

    void adicionarCarro(Carro c) {
        garagem.put(c.getEstacionado(),c);
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

    boolean verificacaoVagas(String nome,String modelo,int vaga) {


        boolean retorno = true;
        boolean vagas = garagem.size() <= 1 && garagem.containsKey(vaga);
        boolean vazio = !(nome.equals(null)) && !(modelo.equals(null));
        if (vagas) {
            if (vazio){
                retorno = true;
            }
        }
        else{
            retorno = false;}
        return retorno;
    }}
// procura o carro atraves do modelo e nome
