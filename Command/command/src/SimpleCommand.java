public class SimpleCommand implements Command{
    private String operation;

    public SimpleCommand(String operation){
        this.operation = operation;
    }

    @Override
    public void execute() {
       System.out.println("Executando:" + operation);
    }
    
}
