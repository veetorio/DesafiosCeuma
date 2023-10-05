package desefiosCeuma.DesafioCarro;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test{ // desafio criar uma garagem e um sistema de armazenagem,remoção e procura
    // acrescentado que a garagem possuí um limite

    static List perfis = Arrays.asList("adm","usuario");
    public static void main(String[] args) {

        String Saida = "iniciar";
        int cont = 0;
        int sair = JOptionPane.showConfirmDialog(null, String.format("Deseja %s ", Saida), "Programa", JOptionPane.INFORMATION_MESSAGE);

        while (sair == 0) {
            String perfil = JOptionPane.showInputDialog("qual seu perfil");

            if(perfis.contains(perfil)){
                switch (perfil){
                    case "adm":
                        Adm();
                        break;
                    case "usuario":
                }
            }else{
                JOptionPane.showMessageDialog(null,"Insira Adm ou Usuario","",JOptionPane.ERROR_MESSAGE);

            }

            {
                Saida = cont != 0 ? Saida : "continuar";
                sair = JOptionPane.showConfirmDialog(null, String.format("Deseja %s ", Saida), "Programa", JOptionPane.INFORMATION_MESSAGE);
                cont++;}
        }
    }

    static void Adm(){
        String senha = JOptionPane.showInputDialog("Qual sua senha ?");
        Admin a = new Admin(senha);
        a.Init();
    }
}
