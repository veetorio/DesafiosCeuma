package desefiosCeuma.SistemasdeVoo.ClasseMãe;

import desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines.Passageiro;
//interface das linhas que implementão os métodos de reserva e mostrar passageiro
public interface SIstemasdeLines
{
    default void reservas(int assento, Passageiro p){}
    default void MostrarPassageiros(){}
}
