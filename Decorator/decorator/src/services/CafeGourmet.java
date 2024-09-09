package services;

import preparacao.Cafe;
import preparacao.Decorator;

public class CafeGourmet extends Decorator{

    public CafeGourmet(Cafe cafe) {
        super(cafe);
        
    }

    @Override
    public String ingredientesInfo() {
        
        return super.ingredientesInfo()+ "Extrato de baunilha";
    }

    @Override
    public double valorCafe() {
        
        return super.valorCafe() + 3;
    }
    
}
