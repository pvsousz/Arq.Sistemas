package services;

import preparacao.Cafe;

public class CafeNormal implements Cafe {

    @Override
    public double valorCafe() {
        return 3;
    }

    @Override
    public String ingredientesInfo() {
        return "Café, "; 
    }
    
}
