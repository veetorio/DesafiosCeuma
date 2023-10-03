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

      }

        void procurarCarro(String modelo) {
            garagem.values().forEach(a -> {
                if (a.getModelo().equals(modelo.strip())) {
                    JOptionPane.showMessageDialog(null, a.getNomeMotorista() + "Seu carro foi encontrado na vaga" + a.getEstacionado(), "Procura", JOptionPane.PLAIN_MESSAGE);
                }
            });
        }

         boolean Validação(String nome,String modelo,Integer assento){
            final String regex = "[0-9]";
            boolean retorno;
            Pattern range = Pattern.compile(regex);
            Matcher start = range.matcher(nome);

            boolean vagas = garagem.size() <= 1 && !garagem.containsKey(assento);
            boolean vazio = !nome.isBlank() && !modelo.isBlank();
            boolean NotContainsNumeric = !start.find();

            if(vagas && vazio && NotContainsNumeric){
                retorno = true;
            }else{
                retorno = false;
            }
            return retorno;
        }
    }
// procura o carro atraves do modelo e nome
