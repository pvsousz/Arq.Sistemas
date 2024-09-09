import preparacao.Cafe;
import services.CafeGourmet;
import services.CafeLeite;
import services.CafeNormal;

public class App {
    public static void main(String[] args) throws Exception {
       Cafe normal = new CafeNormal();
       Cafe leite = new CafeLeite(normal);
       Cafe gourmet = new CafeGourmet(leite);
       

       System.out.println(gourmet.valorCafe());
       System.out.println(gourmet.ingredientesInfo());
        
       
    }
}
