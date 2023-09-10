package desefiosCeuma.SistemasdeVoo.ClasseMãe.pseudo_interface;
import desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines.Azul;
import desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines.Gol;
import desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines.Passageiro;
import desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines.Qatar;


import java.util.Scanner;

public class SistemaLines_Main
{
    private Azul azul = new Azul();
    private Qatar qatar = new Qatar();
    private Gol gol = new Gol();
    static public int qtd;
    private final int reservas_base = azul.ReservasTot;
    private Scanner leia = new Scanner(System.in);

    void reservarAzul(){
        if(vagasAzul()){
            System.out.println("Coloque seu nome: ");
            String nome = leia.next();
            System.out.println("Coloque seu destino: ");
            String local = leia.next();
            System.out.println("Qual seu assento: ");
            int assento = Integer.parseInt(leia.next());
            if(!azul.reservaAzul.containsKey(assento)){
                Passageiro p = new Passageiro(nome, local);
                azul.reservas(assento, p);
            }
            else{
                System.out.println("este assento já está ocupado");
            }
        }
        else {System.out.println("não há vagas");
        }
    }// reserva da classe azul
    void assentosAzul() {azul.MostrarPassageiros();
    }//mostrar passageiros

    void reservarGol(){
        if(vagasGol()){
            System.out.println("Coloque seu nome: ");
            String nome = leia.next();
            System.out.println("Coloque seu destino: ");
            String local = leia.next();
            System.out.println("Qual seu assento: ");
            int assento = Integer.parseInt(leia.next());

            if(!gol.reservaGol.containsKey(assento)){
                Passageiro g = new Passageiro(nome,local);
                gol.reservas(assento, g);
            }
            else{
                System.out.println("este assento já está ocupado");
            }
        }
        else{
            System.out.println("não há vagas");
        }

    }// reserva da classe Gol
    void assentosGol()
    {
        gol.MostrarPassageiros();
    }//mostrar passageiros

    void reservarQatar(){
        if(vagasQatar()){
            System.out.println("Coloque seu nome: ");
            String nome = leia.next();
            System.out.println("Coloque seu destino: ");
            String local = leia.next();
            System.out.println("Qual seu assento: ");
            int assento = Integer.parseInt(leia.next());

            if(!qatar.reservaQatar.containsKey(assento)){
                Passageiro p = new Passageiro(nome,local);
                qatar.reservas(assento, p);
            }
            else{
                System.out.println("este assento já está ocupado");
            }
        }
        else{
            System.out.println("não há vagas");
        }
    }// reserva da classe Qatar
    void assentosQatar()
    {
        qatar.MostrarPassageiros();
    }//mostrar passageiros

    //verificação dos maps
    boolean vagasAzul() {
        return azul.vagasAzul();}
    boolean vagasGol()
    {
        return gol.vagasGol();
    }
    boolean vagasQatar()
    {
        return qatar.vagasQatar();
    }
}

