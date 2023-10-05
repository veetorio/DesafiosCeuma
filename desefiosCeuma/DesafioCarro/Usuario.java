package desefiosCeuma.DesafioCarro;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class Usuario extends Garagem {
    Map<Integer, Carro> garagem = super.garagem;
    public Usuario(String nome) {
        Garagem.garagem.values().forEach(p -> {
            if (nome.equals(p.getNomeMotorista())){
                JFrame status = new JFrame("vai luan");
                String txt = String.format("----------------Perfil-------------------\nNome | %s\nModelo |%s\nVaga | %s",p.getNomeMotorista(),p.getModelo(),p.getEstacionado());
                JTextArea a = new JTextArea(txt);
                Font f = new Font("rapaz",Font.BOLD,20);

                status.setSize(720,800);
                status.setContentPane(a);
                status.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                a.setLineWrap(true);
                a.setLocation(390,390);
                a.setFont(f);
                status.setVisible(true);

            }
        });
    }
}
