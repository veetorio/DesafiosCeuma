package desefiosCeuma.DesafioCarro;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Test { // desafio criar uma garagem e um sistema de armazenagem,remoção e procura
    // acrescentado que a garagem possuí um limite
    static Garagem g = new Garagem();
    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {

        while (true){
            try{
            String opc = JOptionPane.showInputDialog("O que deseja fazer");
            if(opc.trim().equals("sair")){System.out.println("programa executado com sucesso");break;}
            switch (opc.toLowerCase()){
                case "reservar":
                    Integer estacionamento = Integer.parseInt(JOptionPane.showInputDialog("Onde deseja estacionar ?:"));
                    String model = JOptionPane.showInputDialog("Qual o modelo do seu carro ?:");
                    String nome = JOptionPane.showInputDialog("Qual seu nome ?");
                    Carro c = new Carro(estacionamento,nome,model);
                    g.adicionarCarro(c);
                    break;
                case "reserva":
                    Integer _estacionamento = Integer.parseInt(JOptionPane.showInputDialog("Onde deseja estacionar ?:"));
                    String _model = JOptionPane.showInputDialog("Qual o modelo do seu carro ?:");
                    String _nome = JOptionPane.showInputDialog("Qual seu nome ?");
                    Carro _c = new Carro(_estacionamento,_nome,_model);
                    g.adicionarCarro(_c);
                    break;
                case "mostrar":
                    JFrame a = new JFrame("Garagem");
                    JTextField txt = new JTextField(g.mostrarLista());
                    txt.setHorizontalAlignment(SwingConstants.EAST);
                    a.add(txt);
                    a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    a.setSize(700,450);
                    a.setVisible(true);
                    break;
                case "procurar":
                    break;
                case "remover":
                    break;
                case "":
                    System.out.println("nenhum selecionado");
                    break;
            }
            }catch(NullPointerException e){
                JOptionPane.showMessageDialog(null,"A aplicação foi forçada a parar antes do fim de execução","Erro de Execução",JOptionPane.ERROR_MESSAGE);
                break;
            }catch(NumberFormatException p){
                System.out.println("este valor não é valido");
                break;}

        }}





    }

