package desefiosCeuma.DesafioCarro;


import java.util.ArrayList;
import java.util.List;

public class Garagem
{

    List<Carro> garagem = new ArrayList();

    void adicionarCarro(Carro c){

        if(garagem.size() <= 20)
        {
            garagem.add(c);
        }
        else
        {
            System.out.println("Não há vagas");
        }
    }//adiciona carro
    void removeCarro(String model){
        int i = 0;
        for (Carro c : garagem)
        {
            if (model.equals(c.getModelo())) {
                garagem.remove(garagem.get(i));
            }
        }
        i++;
    }//remove carro


    void mostrarLista() {
        for (Carro c: garagem)
        {
            System.out.println(c.getNomeMotorista() +"=>"+ c.getModelo()+"\n");
        }

    }//mostra os carros

    void procurarCarro(String nome,String model){
        for (Carro c : garagem)
        {
            if (nome.equals(c.getNomeMotorista()) && model.equals(c.getModelo()))
            {
                System.out.println("carro encontrado!! ele está estacionado na vaga " + c.getEstacionado()+"\n");
                break;
            }
        }

    }//mostra
}