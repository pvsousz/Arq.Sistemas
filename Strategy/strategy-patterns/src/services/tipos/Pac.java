package services.tipos;

import services.FreteServicos;
import services.entregas.Correios;

public class Pac implements FreteServicos {

    @Override
    public double calcula(double peso) {
        Correios correios = new Correios();
        double valorTotal = correios.calcularRemessa("PAC", peso);
        return valorTotal;
    }
    
}
