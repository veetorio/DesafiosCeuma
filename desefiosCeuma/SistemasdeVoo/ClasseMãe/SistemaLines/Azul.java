package desefiosCeuma.SistemasdeVoo.ClasseMãe.SistemaLines;

import desefiosCeuma.SistemasdeVoo.ClasseMãe.ClasseLinesM;
import desefiosCeuma.SistemasdeVoo.ClasseMãe.SIstemasdeLines;

import java.util.*;

public class Azul extends ClasseLinesM implements SIstemasdeLines // linha azul que está recebendo o atributo da classe mãe e os metodos da classe
{
    @Override
    public void reservas(Passageiro passageiro) {
        SIstemasdeLines.super.reservas(passageiro);
    }

    @Override
    public void MostrarPassageiros() {
        SIstemasdeLines.super.MostrarPassageiros();
    }
}