package desefiosCeuma.DesafioCarro;

public class Carro {
    private String nomeMotorista;//nome do motorista
    private String Modelo;//Modelo do carro
    private int estacionado;//local estacionado

    Carro(int estacionado,String nome, String Modelo) {
        this.nomeMotorista = nome;
        this.Modelo = Modelo;
        this.estacionado = estacionado;
    }//construtor que guardará as informações do objeto(Pessoa que está estacionando)

    String getNomeMotorista()
    {
        return this.nomeMotorista;
    }//get que retorna
    String getModelo() {
        return this.Modelo;
    }// get que retorna o modelo do carro
    int getEstacionado(){return estacionado;}//get que retorna o local estacionado


}