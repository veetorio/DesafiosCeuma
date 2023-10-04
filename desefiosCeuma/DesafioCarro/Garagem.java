package desefiosCeuma.DesafioCarro;

import javax.swing.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Garagem {
    // sistema de armazenagem e procura do carro
     Map<Integer,Carro> garagem = new HashMap<>();
     protected Integer Vagastot = 20;
    Carro c;// lista dos carros na garagem

    protected void adicionarCarro(Carro c) {
            garagem.put(c.getEstacionado(),c);
            this.Vagastot --;

    }// este metodo adiciona carro na garagem

    protected void removeCarro(int ass) {
                garagem.remove(garagem.remove(ass));
                JOptionPane.showMessageDialog(null,"carro removido","remoção",JOptionPane.INFORMATION_MESSAGE);

       ;
    }// este metodo remove carro

    protected void mostrarLista(){
        System.out.println("------->=Garagem <=------");
        System.out.println("Nome   |Modelo    | Vaga");
        garagem.values().forEach(p -> System.out.println(p.getNomeMotorista() + "    |"+ p.getModelo()+"    |"+ p.getEstacionado()));
      }

        protected void procurarCarro(String modelo,String nome) {
            garagem.values().forEach(a -> {
                if (a.getModelo().equals(modelo.strip()) && a.getNomeMotorista().equals(nome.strip())) {
                    JOptionPane.showMessageDialog(null, a.getNomeMotorista() + "Seu carro foi encontrado na vaga" + a.getEstacionado(), "Procura", JOptionPane.PLAIN_MESSAGE);
                }
            });
        }
        protected boolean Validação(String nome,String modelo,Integer assento){
             boolean retorno;
             String nom = nome;

            boolean vagas = garagem.size() <= Vagastot && !garagem.containsKey(assento);
            boolean vazio = !nome.isBlank() && !modelo.isBlank();
            boolean isAlpha = nom.matches("^[a-zA-Z ]+$");

            if(vagas && vazio && isAlpha){
                retorno = true;
            }else{
                retorno = false;
            }
            return retorno;
        }
}
// procura o carro atraves do modelo e nome
