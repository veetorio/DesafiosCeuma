package desefiosCeuma.DesafioCarro;

import javax.swing.*;
import java.awt.*;

public class InterfaceProject {
    private JPanel panel1;
    private JButton button1;

    public void Ass(){
        panel1.setSize(new Dimension(1000,1000));
        panel1.setVisible(true);
        getButton1();
    }
    public void getButton1() {
        button1.addActionListener(p -> {
            System.out.println("alai");
        });
    }
}
