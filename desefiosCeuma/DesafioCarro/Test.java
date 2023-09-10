package desefiosCeuma.DesafioCarro;

import java.util.Scanner;

public class Test
{        // desafio criar uma garagem e um sistema de armazenagem,remoção e 
    static Garagem g = new Garagem();
    static Scanner leia = new Scanner(System.in);
    public static void main(String[] args)
    {

        System.out.println("_-_-_Garagem codeCeuma_-_-_-");

        while(true){
            System.out.println("Deseja estacionar ?");
            String resposta = leia.next();
            if(resposta.equals("sim")){
                System.out.println("Qual o modelo do seu carro");
                String model = leia.next();
                System.out.println("Qual seu nome ?:");
                String nome = leia.next();
                System.out.println("onde deseja estacionar:");
                int estacionado = Integer.parseInt(leia.next());
                g.adicionarCarro(new Carro(estacionado,nome,model));
            }

            else{
                System.out.println("deseja procurar qual seu carro ?");
                String resposta2 = leia.next();
                System.out.println("Qual o modelo do seu carro ?");
                String model = leia.next();
                if(resposta2.equals("sim"))
                {
                    System.out.println("Qual seu nome ");
                    String nome = leia.next();
                    g.procurarCarro(nome,model);
                }
                g.mostrarLista();
                break;
            }
        }





    }
}
