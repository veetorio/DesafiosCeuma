package desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines;


public class Passageiro
{
    private String nome;//nome
    private String lugar;// e destino
    private Integer Assento;// assento

    public Passageiro(String _nome,String _lugar,Integer assento)
    {
        this.nome = _nome;
        this.lugar = _lugar;
        this.Assento = assento;
    }
    public String getNome()
    {
        return this.nome;
    }
    public String getLugar()
    {
        return this.lugar;
    }

    public Integer getAssento(){
        return this.Assento;
    }
}
