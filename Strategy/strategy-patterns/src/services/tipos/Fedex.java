package services.tipos;

import services.FreteServicos;

public class Fedex implements FreteServicos {

    @Override
    public double calcula(double peso) {
        services.entregas.Fedex fedex = new services.entregas.Fedex();
        double valorTotal = fedex.calculation( peso);
        return valorTotal;
    }
    
}
