package services;

import preparacao.Cafe;
import preparacao.Decorator;

public class CafeLeite extends Decorator {

    public CafeLeite(Cafe cafe) {
        super(cafe);
       
    }

    @Override
    public String ingredientesInfo() {
        
        return super.ingredientesInfo() + "Leite, ";
    }

    @Override
    public double valorCafe() {
        return super.valorCafe() + 0.5;
    }
    
}
