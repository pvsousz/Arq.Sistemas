package preparacao;

public abstract class Decorator implements Cafe{
    private final Cafe cafeDecorator;

    public Decorator(Cafe cafe) {
        this.cafeDecorator = cafe;
    }

    @Override
    public String ingredientesInfo() {
        
        return cafeDecorator.ingredientesInfo();
    }

    @Override
    public double valorCafe() {
        return cafeDecorator.valorCafe();
    }

       
}
