package vehicleLifecycle;

public class Lifecycle {

    private Command command;

    public Lifecycle(Command command){
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }

}
