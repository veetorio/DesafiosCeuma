package desefiosCeuma.DesafioCarro;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Admin extends Garagem {
    final String key = "ABC123";
    List<String> operator = List.of("adicionar carro", "remover carro", "procurar carro", "mostrar carro");
    Boolean entrada = false;

    Admin(String senha) {
        if (senha.equals(key)) {
            System.out.println("---------Operações de Adm----------\n[adicionar carro]\n[remover carro]\n[procurar carro]\n[mostrar]");
            this.entrada = true;
        } else {
            JOptionPane.showMessageDialog(null, "Acesso negado", "Solicitação", JOptionPane.ERROR_MESSAGE);
        }
    }

    void Init() {
        int ContAdm = 0;
        while (ContAdm == 0) {
            if (entrada) {
                String opt_s = JOptionPane.showInputDialog("Qual sua operação : ");
                if (operator.contains(opt_s.toLowerCase())) {
                    switch (opt_s.toLowerCase()) {
                        case "remover carro":
                            Remover();
                            break;
                        case "adicionar carro":
                            Adicionar();
                            JOptionPane.showMessageDialog(null, "Carro Adicionado, restaram apenas " + Vagastot + "vagas", "sucesso", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "procurar carro":
                            Procurar();
                            break;
                        case "mostrar carro":
                            Mostrar();
                            break;
                    }
                } else {
                    if (!operator.contains(opt_s.toLowerCase())) {
                        JOptionPane.showMessageDialog(null, "valor inserido não está nas operações", "", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Aplicação não pode ser acessada, verifique se sua senha está correta", "entrada warning", JOptionPane.WARNING_MESSAGE);
            }
            ContAdm = JOptionPane.showConfirmDialog(null, "Deseja continuar como Adm", "", JOptionPane.ERROR_MESSAGE);
        }

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
                    Concluido = "concluido";
                } else {
                    JOptionPane.showMessageDialog(null, "erro de inserção. Verifique: se o valor inserido não é vazio ;, se o valor inserido não possui meta-caracter(Ex @#$%) ;, valor de vaga é mimi");
                }
            } catch (NumberFormatException a) {
                JOptionPane.showMessageDialog(null, "Valor inválido, corriga a vaga ", "", JOptionPane.CANCEL_OPTION);
            }

        }
    }

    private void Mostrar() {
        mostrarLista();
    }

    private void Procurar() {
        String model = JOptionPane.showInputDialog("Qual o modelo deseja procurar :");
        String nome = JOptionPane.showInputDialog("Qual seu nome :");
        procurarCarro(model, nome);
    }

    private void Remover() {
        int Assento = Integer.parseInt(JOptionPane.showInputDialog("Qual a vaga que deseja retirar :"));
        removeCarro(Assento);
    }

    public void Usuario() {
        Garagem garagem1 = new Garagem();
        String nome = JOptionPane.showInputDialog("Qual seu nome :");
        if (Validação(nome, nome, 0)) {
            System.out.println("---Status---");
            garagem.values().forEach(
                    p -> {
                        if(nome.equals(p.getNomeMotorista())){
                            System.out.println();
                        }
                    }
            );
        }

    }
}
