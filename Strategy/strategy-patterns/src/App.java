import services.Frete;
import services.tipos.Dhl;
import services.tipos.Fedex;
import services.tipos.Pac;
import services.tipos.Sedex;


public class App {
    public static void main(String[] args) throws Exception {
        
        Dhl dhl = new Dhl();
        Pac pac = new Pac();
        Fedex fedex = new Fedex();
        Frete frete = new Frete(pac);

        System.out.println(frete.calcula(0));
        System.out.println(frete.getServico());
   
    }
}
