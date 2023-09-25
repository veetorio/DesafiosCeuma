package desefiosCeuma.SistemasdeVoo.ClasseMãe.pseudo_interface;

import desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines.Azul;
import desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines.Gol;
import desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines.Passageiro;
import desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines.Qatar;

import java.util.Scanner;

public class Test {
    static Sistema_de_Requisição_e_Aquisição sys = new Sistema_de_Requisição_e_Aquisição();
    static Scanner leia = sys.leia;
    public static void main(String[] args) {
        while (true){
            sys.Sistema(true);
            System.out.println("Deseja continuar ?");
            String saida = leia.nextLine();
            if(leia.equals("nao")){
                break;
            }
        }
    }

}
