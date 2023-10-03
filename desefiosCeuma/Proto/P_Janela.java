package desefiosCeuma.Proto;

import javax.swing.*;
import java.awt.*;

public class P_Janela {
    P_Janela(int width,int height){
        JFrame Main = new JFrame();
        JButton User = new JButton("Usuario");
        JButton Adm = new JButton("Administrado");

        Main.getContentPane().setBackground(Color.DARK_GRAY);
        Main.setSize(width,height);
        Main.setVisible(true);

        User.setLocation(300,400);
        Main.add(User);

    }
}
