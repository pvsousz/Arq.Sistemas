package services.tipos;

import services.FreteServicos;

import services.entregas.DHL;

public class Dhl implements FreteServicos {

    @Override
    public double calcula(double peso) {
        DHL dhl = new DHL();
        double valorTotal = dhl.priceCalculator( peso);
        return valorTotal;
    }
    
}
