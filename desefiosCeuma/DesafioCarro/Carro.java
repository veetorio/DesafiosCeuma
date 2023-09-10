package desefiosCeuma.DesafioCarro;

public class Carro {
    private String nomeMotorista;
    private String Modelo;

    private int estacionado;

    Carro(int estacionado,String nome, String Modelo) {
        this.nomeMotorista = nome;
        this.Modelo = Modelo;
        this.estacionado = estacionado;
    }

    String getNomeMotorista()
    {
        return this.nomeMotorista;
    }//get que retorna
    String getModelo() {
        return this.Modelo;
    }// get que retorna o modelo do carro
    int getEstacionado(){return estacionado;}//get que retorna o local estacionado


}