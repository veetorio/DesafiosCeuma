package desefiosCeuma.DesafioCarro;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.logging.ErrorManager;

public class Janela {
    static Boolean a = true;
    Garagem g = new Garagem();
    static JFrame FrameP  =new JFrame("Garagem");
    Janela(int width,int height,boolean visible,String title){


        FrameP.setSize(new Dimension(1080,720));
        FrameP.setVisible(visible);

        JButton adicionarcarro = new JButton("Adicionar Carro");
        JButton removerCarro = new JButton("Remover Carro");
        JButton mostrarcarro = new JButton("Mostrar Carros");

        int wid = 150;
        int hei = 50;


        adicionarcarro.setSize(wid,hei);
        adicionarcarro.setLocation(450,270);
        removerCarro.setSize(wid,hei);
        removerCarro.setLocation(450,390);
        mostrarcarro.setSize(wid,hei);
        mostrarcarro.setLocation(450,510);

        adicionarcarro.addActionListener(p -> {
            FrameP.setVisible(false);
            String concluido = "";
            while(!concluido.equals("Concluido")) {
                try {
                    Integer assento = Integer.parseInt(JOptionPane.showInputDialog("Qual seu assento"));
                    String nome = JOptionPane.showInputDialog("");
                    String modelo = JOptionPane.showInputDialog("");
                    nome = nome.strip();
                    modelo = modelo.strip();
                    if (!nome.isEmpty() && !modelo.isEmpty()) {
                        Carro a = new Carro(assento, nome, modelo);
                        JOptionPane.showMessageDialog(null, nome + " estacionou com sucesso ", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                        concluido = "Concluido";
                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhum valor foi insérido em nome e modelo", "Erro 2", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException number) {
                    JOptionPane.showMessageDialog(null, "Valor invalido insira um valor ", "Erro 1", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        removerCarro.addActionListener(p ->{
            FrameP.setVisible(false);
            Integer ass = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua vaga"));
            g.removeCarro(ass);
        });

        FrameP.add(adicionarcarro);
        FrameP.add(removerCarro);
        FrameP.add(mostrarcarro);
        FrameP.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    static Boolean init(){
        while(a){
            Janela J = new Janela(1080,720,true,"Garagem");
            String saida = JOptionPane.showInputDialog("deseja continuar");
            if(saida.equals("sim")){
                FrameP.setVisible(false);

                break;
            }
        }
        return false;
    }


}

