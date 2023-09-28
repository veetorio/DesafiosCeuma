package desefiosCeuma.DesafioCarro;

import java.util.Scanner;

public class Test { // desafio criar uma garagem e um sistema de armazenagem,remoção e procura
    // acrescentado que a garagem possuí um limite
    static Garagem g = new Garagem();
    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("_-_-_Garagem codeCeuma_-_-_-");

        while (true) {
            System.out.println("Deseja continuar o programa ?");
            String resposta = leia.nextLine();
            if (resposta.equals("sim")) {
                System.out.println("O que deseja fazer :");
                String opt = leia.nextLine();
                switch (opt.toLowerCase()) {
                    case "reserva":
                        System.out.println("Qual o modelo do seu carro");
                        String model = leia.nextLine();
                        System.out.println("Qual seu nome ?:");
                        String nome = leia.nextLine();
                        System.out.println("onde deseja estacionar:");
                        int estacionado = Integer.parseInt(leia.nextLine());
                        Carro c = new Carro(estacionado, nome, model);
                        g.adicionarCarro(c);
                        break;
                    case "mostrar":
                        g.mostrarLista();
                        break;
                    case "procurar":
                        System.out.println("Qual seu nome ?:");
                        String _nome = leia.nextLine();
                        System.out.println("Qual o modelo do seu carro");
                        String _model = leia.nextLine();
                        g.procurarCarro(_nome, _model);
                    case "remover":
                        System.out.println("onde deseja estacionar:");
                        int _estacionado = Integer.parseInt(leia.nextLine());
                        g.removeCarro(_estacionado);
                }
            } else {
                break;
            }
        }
        leia.close();
    }
}
