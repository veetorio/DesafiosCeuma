package desefiosCeuma.DesafioCarro;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.logging.ErrorManager;

public class Janela {
    static Boolean a = true;
    static Garagem garagem = new Garagem();

    static JFrame FrameP  =new JFrame("Garagem");
    Janela(int width,int height,boolean visible,String title){


        FrameP.setSize(new Dimension(1080,720));
        FrameP.setVisible(visible);
        FrameP.getContentPane().setBackground(Color.CYAN);
        interações(new JButton("USuario"),new JButton("Adm"));
        FrameP.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    static Boolean init(){
        Janela J = new Janela(500,50,true,"Garagem");
        String saida = JOptionPane.showInputDialog("deseja continuar");
        return a = false;
    }
    private void interações(JButton A,JButton B){
        final int wid = 150;
        final int hei = 50;

        A.setSize(wid,hei);
        A.setLocation(450,270);
        B.setSize(wid,hei);
        B.setLocation(450,390);

        A.addActionListener(p -> {
            FrameP.setVisible(false);
            String concluido = "";

            try{
                while(!concluido.equals("Concluido")) {
                    Integer assento = Integer.parseInt(JOptionPane.showInputDialog("Qual seu assento"));
                    String nome = JOptionPane.showInputDialog("Qual seu nome :");
                    String modelo = JOptionPane.showInputDialog("Qual seu carro");
                    boolean vazio = !nome.isBlank() && !modelo.isBlank();
                    boolean vagas = garagem.garagem.size() <= 1 && !garagem.garagem.containsKey(assento);
                    if(vagas){
                        if(vazio){
                            Carro c = new Carro(assento,nome,modelo);
                            garagem.adicionarCarro(c);
                            JOptionPane.showMessageDialog(null,"","Sucesso",JOptionPane.INFORMATION_MESSAGE);
                            concluido = "Concluido";}else{
                            JOptionPane.showMessageDialog(null,"nome","tilte",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }catch (NumberFormatException number){
                JOptionPane.showMessageDialog(null, "Valor invalido insira um valor ", "Erro 1", JOptionPane.ERROR_MESSAGE);
            }

        });
        B.addActionListener(p ->{
            FrameP.setVisible(false);
            Integer ass = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua vaga"));
            garagem.removeCarro(ass);
        });
        FrameP.add(A);
        FrameP.add(B);
    }
}

