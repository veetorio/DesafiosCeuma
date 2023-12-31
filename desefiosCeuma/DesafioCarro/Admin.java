package desefiosCeuma.DesafioCarro;

import javax.swing.*;
import java.util.List;
import java.util.Map;

public class Admin extends Garagem {
    private final String key = "ABC123";
    private final List<String> operator = List.of("adicionar carro", "remover carro", "procurar carro", "mostrar carro");

    private final Map<Integer, Carro> garagem = Garagem.garagem;

    private int vagastot = Vagastot;
    private Boolean entrada = false;

    Admin(String senha) {
        if (senha.equals(key)) {
            System.out.println("---------Operações de Adm----------\n[adicionar carro]\n[remover carro]\n[procurar carro]\n[mostrar carros]");
            this.entrada = true;
        } else {
            JOptionPane.showMessageDialog(null, "Acesso negado", "Solicitação", JOptionPane.ERROR_MESSAGE);
        }
    }

    void Init() {
        int continuar = 0;
        try {
            while (continuar == 0) {
                if (entrada){
                    String opt_s = JOptionPane.showInputDialog("Qual sua operação : ").trim().strip().toLowerCase();

                    if (opt_s.contains("adicionar")     ||  opt_s.equals("adicionar carros")) {
                        Adicionar();
                        JOptionPane.showMessageDialog(null,"Carro adicionado !! restaram apenas " + vagastot + " vagas ");
                    }// adicionar um carro
                    else if (opt_s.contains("remover")  ||  opt_s.equals("remover carros")){
                        Remover(); } // remove um carro
                    else if (opt_s.contains("procurar") ||  opt_s.equals("procurar carros")){
                        Procurar(); }// procura um carro
                    else if (opt_s.contains("mostrar")  ||  opt_s.equals("mostrar carros")){
                        Mostrar(); }// mostrar carro
                    else{
                        if (!operator.contains(opt_s.toLowerCase())) {
                            JOptionPane.showMessageDialog(null, "valor inserido não está nas operações", "", JOptionPane.ERROR_MESSAGE);
                        } } }
                    else{
                        JOptionPane.showMessageDialog(null, "Aplicação não pode ser acessada, verifique se sua senha está correta", "entrada warning", JOptionPane.WARNING_MESSAGE);
                        continuar = JOptionPane.showConfirmDialog(null, "deseja continuar como administrador");}
                    continuar = JOptionPane.showConfirmDialog(null, "deseja continuar como administrador");
                }
            }catch (NullPointerException e){ JOptionPane.showMessageDialog(null, "Aplicação foi encerrada indevidamente", "", JOptionPane.ERROR_MESSAGE); }
    }

    private void Adicionar() {
        String Concluido = "";
        while (!Concluido.equals("concluido")) {
            try {
                String nome = JOptionPane.showInputDialog("Qual o seu nome: ");
                String modelo = JOptionPane.showInputDialog("Qual modelo do carro");
                int vaga = Integer.parseInt(JOptionPane.showInputDialog("Qual seu assento "));
                if (Validação(nome, modelo, vaga)) {
                    Carro c = new Carro(vaga, nome, modelo);
                    adicionarCarro(c);
                    this.vagastot--;
                    Concluido = "concluido";
                } else {
                    JOptionPane.showMessageDialog(null, "erro de inserção. Verifique: \n" + "se o valor inserido não é vazio; \n" + "se o valor inserido não possui meta-caracter(Ex @#$%) \n" + "se o valor inserido em assento é negativo ");
                }
            } catch (NumberFormatException a) {
                JOptionPane.showMessageDialog(null, "Valor inválido, corriga a vaga ");
            }

        }
    }

    private void Mostrar() {
        mostrarLista(garagem);
    }

    private void Procurar() {String model = JOptionPane.showInputDialog("Qual o modelo deseja procurar :");String nome = JOptionPane.showInputDialog("Qual seu nome :");
        procurarCarro(model, nome);
    }

    private void Remover() {int Assento = Integer.parseInt(JOptionPane.showInputDialog("Qual a vaga que deseja retirar :"));removeCarro(Assento, this.garagem);
    }
}