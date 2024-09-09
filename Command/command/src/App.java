



public class App {
    public static void main(String[] args) throws Exception {
        Invoker invoker = new Invoker();  

        Command command1 = new SimpleCommand("Operação 1");
        Command command2 = new SimpleCommand("Operação 2");

        invoker.executeCommand(command1);
        invoker.executeCommand(command2);

    }
}


