package desefiosCeuma.SistemasdeVoo.ClasseMãe.pseudo_interface;
import desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines.Azul;
import desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines.Gol;
import desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines.Passageiro;
import desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines.Qatar;


import java.text.NumberFormat;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Sistema_de_Requisição_e_Aquisição
{
    Boolean entrada = false;
    public Scanner leia = new Scanner(System.in);
    private int contador;

    public Boolean Sistema(Boolean _entrada) {
        if(_entrada){
            System.out.println("Selecione sua companhia: azul;gol;qatar");
            String option = leia.nextLine();
            Selecionar(option);
        }else{
            System.out.println("Sistema fora do ar");
        }


        return _entrada;
    }
    private void Selecionar(String opc){
        System.out.println("Qual sua operação: mostrar passageiro;reserva passageiro");
        String opt = leia.nextLine();
        switch (opc){
            case "azul":
                Sys_azul(opt);
                break;
            case "gol":
                Sys_gol(opt);
                break;
            case "qatar":
                Sys_qatar(opt);
        }
    }
     private void Sys_azul(String opt){
        Azul a = new Azul();
        switch (opt){
            case "reserva":
                System.out.println("qual seu nome ?:");
                String nome = leia.nextLine();
                System.out.println("Qual seu destino ?:");
                String local = leia.nextLine();
                System.out.println("Qual seu assento?:");
                Integer assento = Integer.parseInt(leia.nextLine());
                try{leia.nextInt();}catch(NumberFormatException pa){
                    System.out.println("seu erro number");
                }
                a.reservar(new Passageiro(nome,local,assento));
            break;
            case "mostrar":a.mostrarElementosAzul();
            break;
        }
    }
     private void Sys_qatar(String opt){
        Qatar q = new Qatar();
        switch (opt){
            case "reserva":
                System.out.println("qual seu nome ?:");
                String nome = leia.nextLine();
                System.out.println("Qual seu destino ?:");
                String local = leia.nextLine();
                System.out.println("Qual seu assento?:");
                Integer assento = Integer.parseInt(leia.nextLine());
                try{assento = leia.nextInt();}catch (Exception e){}
                q.reservar(new Passageiro(nome,local,assento));
                break;
            case "mostrar":
                q.mostrarElementosQatar();
                break;
        }
    }
     private void Sys_gol(String opt){
        Gol g = new Gol();
        switch (opt){
            case "reserva":
                System.out.println("qual seu nome ?:");
                String nome = leia.nextLine();
                System.out.println("Qual seu destino ?:");
                String local = leia.nextLine();
                System.out.println("Qual seu assento?:");
                Integer assento = Integer.parseInt(leia.nextLine());
                g.reservar(new Passageiro(nome,local,assento));
                break;
            case "mostrar":
                g.mostrarElementosGol();
                break;
        }
    }
}