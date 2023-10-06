package desefiosCeuma.DesafioCarro;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Interface { // desafio criar uma garagem e um sistema de armazenagem,remoção e procura
    // acrescentado que a garagem possuí um limite

    static List perfis = Arrays.asList("adm", "usuario");

    public static void main(String[] args) {

        String Saida = "iniciar";
        int cont = 0;
        int sair = JOptionPane.showConfirmDialog(null, String.format("Deseja %s ", Saida), "Programa", JOptionPane.INFORMATION_MESSAGE);
        while (sair == 0) {
            String perfil = JOptionPane.showInputDialog("qual seu perfil").toLowerCase();
            while(!perfis.contains(perfil)){
                JOptionPane.showMessageDialog(null, "Insira Adm ou Usuario", "", JOptionPane.ERROR_MESSAGE);
                perfil = JOptionPane.showInputDialog("qual seu perfil").toLowerCase();
            }
            switch (perfil.toLowerCase()) {
                    case "adm":
                        Adm();
                        break;
                    case "usuario":
                        User();
                        break;
                }
            {
                Saida = cont != 0 ? Saida : "continuar";
                sair = JOptionPane.showConfirmDialog(null, String.format("Deseja %s ", Saida), "Programa", JOptionPane.INFORMATION_MESSAGE);
                cont++;
            }
        }
    }

    static void Adm() {
        try {
            String senha = JOptionPane.showInputDialog("Qual sua senha ?");
            Admin a = new Admin(senha);
            a.Init();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "aplicação foi encerrada: senha incorrreta");
        }
    }

    static void User() {
        String nome = JOptionPane.showInputDialog("diga seu nome ");
        Usuario u = new Usuario(nome);
    }
}
