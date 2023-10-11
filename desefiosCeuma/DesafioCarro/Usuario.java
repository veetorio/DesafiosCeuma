package desefiosCeuma.DesafioCarro;

import javax.swing.*;
import java.awt.*;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Usuario extends Garagem {
    Map<Integer, Carro> garagem = super.garagem;
    public Usuario(String nome) {
        Garagem.garagem.values().forEach(p -> {
            JFrame status = new JFrame("vai luan");
            Font f = new Font("rapaz",Font.BOLD,20);
            JTextArea a = new JTextArea();

            status.setSize(720,800);
            status.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

            String txt = "";
            if (nome.equals(p.getNomeMotorista())){
                txt = String.format("----------------Perfil-------------------\nNome | %s\nModelo |%s\nVaga | %s",p.getNomeMotorista(),p.getModelo(),p.getEstacionado());

                a.setText(txt);
                status.setContentPane(a);
                a.setFont(f);
                a.setLineWrap(true);

                a.setLocation(390,390);
                status.setVisible(true);}else{
                txt  = "nenhum veículo foi encontrado";
                a.setText(txt);
            }
        });

    }
}
