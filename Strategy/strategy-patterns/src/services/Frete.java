package services;



public class Frete  {
    private FreteServicos servico;

    public Frete(FreteServicos servico) {
        this.servico = servico;
    }

    public void setServico(FreteServicos servico) {
        this.servico = servico;
    }
    
    public double calcula(double value){
        double valorTotal = this.servico.calcula(value);
        return valorTotal;
    }

    public FreteServicos getServico() {
        return servico;
    }

}
