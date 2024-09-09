package services.entregas;

public class Correios {

    public double calcularRemessa(String servico, double peso){
        double valor = 0;

        if (servico == "PAC") {
            valor = 10;
        }
        else if (servico == "SEDEX"){
            valor =30;
        }
        return valor;
    }
}